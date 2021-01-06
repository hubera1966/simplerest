package com.example.simplerest;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Component
public class CustomerRepository {
    List<Customer> customerList = new ArrayList<Customer>();

    @PostConstruct
    public void init(){
        customerList.add(new Customer(1, "albert"));
        customerList.add(new Customer(2, "maxim"));
    }
    public List<Customer> getData() {
        return customerList;
    }
}