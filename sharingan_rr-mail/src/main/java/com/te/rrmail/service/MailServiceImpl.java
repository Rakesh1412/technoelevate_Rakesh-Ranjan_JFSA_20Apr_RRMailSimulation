package com.te.rrmail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.rrmail.bean.MailBean;
import com.te.rrmail.bean.UserBean;
import com.te.rrmail.dao.MailDAO;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private MailDAO dao;

	@Override
	public boolean userRegister(UserBean bean) {
		return dao.userRegister(bean);
	}

	@Override
	public UserBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public List<MailBean> getAllMail(int from_id) {
		return dao.getAllMail(from_id);
	}
	
//	@Override
//	public List<MailBean> getInboxMail(int to_id) {
//		return dao.getInboxMail(to_id);
//	}

	@Override
	public boolean sendMail(String subject, String msg, int to_id, int from_id) {
		return dao.sendMail(subject, msg, to_id, from_id);
	}

	@Override
	public boolean deleteMail(int mid) {
		return dao.deleteMail(mid);
	}

	@Override
	public boolean changePassword(String email, String password) {
		return dao.changePassword(email, password);
	}

	@Override
	public UserBean searchByEmail(String email) {
		return dao.searchByEmail(email);
	}

	
}
