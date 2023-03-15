package com.virtusa.GlobalExceptions;

import java.util.List;

public interface CustomerService {
	public List<Customer> getAll() throws NotFoundException;

	public Customer login(String userName, String password) throws NotFoundException;

	public List<Customer> searchedByFirstName(String firstName) throws NotFoundException;
}
