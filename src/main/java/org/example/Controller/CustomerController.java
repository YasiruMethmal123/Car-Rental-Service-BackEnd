package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Customer;
import org.example.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/getCustomer")
    public List<Customer>getCustomer(){
        return service.getCustomer();
    }

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @DeleteMapping("/deleteCustomerById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/updateCustomer")
    @ResponseStatus(HttpStatus.OK )
    public void updateCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/searchByCustomerName/{Name}")
    public List<Customer>searchByName(@PathVariable String name){
        return service.searchByName(name);
    }




}
