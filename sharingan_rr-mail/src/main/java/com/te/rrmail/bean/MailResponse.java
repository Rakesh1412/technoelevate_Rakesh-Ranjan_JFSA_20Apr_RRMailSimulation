package com.te.rrmail.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@XmlRootElement(name="rrmail-resp")
@JsonRootName("rrmail-resp")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MailResponse {

	@JsonProperty
	@XmlElement
	private int status_code;
	
	@JsonProperty
	@XmlElement
	private String message;
	
	@JsonProperty
	@XmlElement
	private List<UserBean> userBean;
	
	@JsonProperty
	@XmlElement
	private List<MailBean> mailBean;

	
}
