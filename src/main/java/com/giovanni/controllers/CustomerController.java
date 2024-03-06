package com.giovanni.controllers;

import com.giovanni.entities.Customer;
import com.giovanni.services.ICustomerService;
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
    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable Integer id){
        return iCustomerService.findById(id);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        iCustomerService.deleteById(id);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer){
       Customer customerDb = iCustomerService.findById(customer.getId());

       customerDb.setName(customer.getName());
       customerDb.setLastName(customer.getLastName());
       customerDb.setEmail(customer.getEmail());
       return iCustomerService.update(customerDb);

    }
}
