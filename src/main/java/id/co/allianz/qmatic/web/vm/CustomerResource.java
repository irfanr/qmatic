package id.co.allianz.qmatic.web.vm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/*")
public class CustomerResource {

	private static final Logger log = LoggerFactory.getLogger(CustomerResource.class);

	@PostMapping(value = "/customer", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public CustomerDetailResponse getCustomer(@RequestBody CustomerDetailRequest request) {

		CustomerDetailResponse response = new CustomerDetailResponse();
		response.setPolicyNo(request.getPolicyNo());
		response.setCustName("BUDI SUMARGONO");
		response.setCustVIPLevel("VIP Level 1");
		return response;
	}

}
