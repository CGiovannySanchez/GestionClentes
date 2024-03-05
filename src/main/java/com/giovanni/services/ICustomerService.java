package com.giovanni.services;

import com.giovanni.entities.Customer;

public interface ICustomerService {

    Customer save(Customer customer);
    Iterable<Customer> findAll();
    Customer findById(Integer Id);

    void deleteById(Integer id);
    Customer update(Customer customer);
}
