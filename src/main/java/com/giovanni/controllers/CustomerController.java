package com.giovanni.controllers;

import com.giovanni.entities.Customer;
import com.giovanni.services.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fullStack")
public class CustomerController {

    private final ICustomerService iCustomerService;

    public CustomerController(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }
    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        return iCustomerService.save(customer);
    }

    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return iCustomerService.findAll();
    }
}
