package com.virtusa.GlobalExceptions;

import java.util.List;


public interface AdminService {
	public List<Admin> getAll() throws NotFoundException;

	public Admin login(String userName, String password) throws NotFoundException;
}
