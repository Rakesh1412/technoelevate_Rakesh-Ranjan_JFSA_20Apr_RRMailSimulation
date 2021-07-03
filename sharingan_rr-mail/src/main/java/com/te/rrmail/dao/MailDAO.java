package com.te.rrmail.dao;

import java.util.List;

import com.te.rrmail.bean.MailBean;
import com.te.rrmail.bean.UserBean;

public interface MailDAO {

	public boolean userRegister(UserBean bean);
	public UserBean login(String email, String password);
	public List<MailBean> getAllMail(int from_id);
//	public List<MailBean> getInboxMail(int to_id);
	public boolean sendMail(String subject, String msg, int to_id, int from_id);
	public boolean deleteMail(int mid);
	public UserBean searchByEmail(String email);
	public boolean changePassword(String email, String password);
	
}
