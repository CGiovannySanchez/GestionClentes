package com.giovanni.services;

import com.giovanni.entities.Customer;

import java.util.List;

public interface ICustomerService {

    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);

    void deleteById(Integer id);

    Customer update(Customer customer);

}
