package myview.springframework.rahulbrewery.services;

import myview.springframework.rahulbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateBeer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
