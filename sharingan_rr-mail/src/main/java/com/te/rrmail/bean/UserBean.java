package com.te.rrmail.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Data
@Table(name = "user_info")
public class UserBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@XmlElement
	private int id;
	
	@Column
	@JsonProperty
	@XmlElement
	private String user_name;
	
	@Column(unique = true)
	@JsonProperty
	@XmlElement
	private String email;
	
	@Column
	@JsonProperty
	@XmlElement
	private String password;
	
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<MailBean> mails;
	
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "userBean",cascade = CascadeType.ALL)
	private List<MailBean> mailBean;

}
