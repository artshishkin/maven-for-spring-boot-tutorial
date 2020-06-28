package com.artarkatesoft.webapp.controllers;

import com.artarkatesoft.webmodel.ShippingAddess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @GetMapping("/")
    public ShippingAddess getAddress() {
        ShippingAddess shippingAddess = new ShippingAddess();
        shippingAddess.setCountryName("Ukraine");
        shippingAddess.setPostOfficeBox("post office box");
        shippingAddess.setPostalCode("84300");
        shippingAddess.setStreetAddress("MyFavourite Street");
        shippingAddess.setRegion("Donetsk region");
        return shippingAddess;
    }
}
