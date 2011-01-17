package net.samzh.repo.util;

import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.PasswordEncoder;

public class MD5PasswordEncoder implements PasswordEncoder {

	@Override
	public String encodePassword(String arg0, Object arg1)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPasswordValid(String arg0, String arg1, Object arg2)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

}
