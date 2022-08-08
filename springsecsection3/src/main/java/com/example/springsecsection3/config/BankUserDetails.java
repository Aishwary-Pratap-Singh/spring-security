package com.example.springsecsection3.config;

import com.example.springsecsection3.model.Customer;
import com.example.springsecsection3.model.SecurityCustomer;
import com.example.springsecsection3.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("-------------------------UserDetails------------------");
        List<Customer> customer = customerRepository.findByEmail(username);

        if (customer.size() == 0){
            throw new UsernameNotFoundException("User details not found for user : "+ username);
        }
        return new SecurityCustomer(customer.get(0));
    }
}
