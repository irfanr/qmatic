package id.co.allianz.qmatic.web.vm;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CustomerDetailResponse")
public class CustomerDetailResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty
	private String policyNo;
	
	@JacksonXmlProperty
	private String custName;
	
	@JacksonXmlProperty
	private String custVIPLevel;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustVIPLevel() {
		return custVIPLevel;
	}

	public void setCustVIPLevel(String custVIPLevel) {
		this.custVIPLevel = custVIPLevel;
	}

}
