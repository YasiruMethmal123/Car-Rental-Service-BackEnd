package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Customer;
import org.example.Entity.CustomerEntity;
import org.example.Repositary.CustomerRepository;
import org.example.Service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customerList = new ArrayList<>();
        repository.findAll().forEach(customer -> customerList.add(mapper.map(customer,Customer.class)));
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer>customer = new ArrayList<>();
        repository.findByName(name).forEach(entity->{
            customer.add(mapper.map(entity,Customer.class));
        });

        return customer;
    }


}
