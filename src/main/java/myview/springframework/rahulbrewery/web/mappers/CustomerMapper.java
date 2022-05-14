package myview.springframework.rahulbrewery.web.mappers;

import myview.springframework.rahulbrewery.domain.Customer;
import myview.springframework.rahulbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
}
