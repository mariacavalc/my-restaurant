package com.madu.port;

import com.madu.dto.CustomerDTO;

public interface CustomerDatabase {

    CustomerDTO addCustomer(CustomerDTO customer);
}
