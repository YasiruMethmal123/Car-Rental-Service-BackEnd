package org.example.Service;

import org.example.Dto.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getCustomer();
    void addCustomer(Customer customer);
    void deleteById(Integer id);
    List<Customer> searchByName(String name);


}
