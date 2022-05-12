package myview.springframework.rahulbrewery.services;

import lombok.extern.slf4j.Slf4j;
import myview.springframework.rahulbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating beer");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting Customer");
    }
}
