package com.ttn.RestFulWebService.versioningapi.controller;


import com.ttn.RestFulWebService.versioningapi.entity.PersonV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
//@RequestMapping("/api2")
public class PersonApiV1Controller {

    @GetMapping(path = "/personapi/v1")
    public PersonV1 getPersonsUsingUri(){
        return new PersonV1("Raj Bhuva");
    }

    @GetMapping(path = "/personapi/param", params = "version=1")
    public PersonV1 getPersonsUsingRequestParameters(){
        return new PersonV1("Raj Bhuva");
    }

    @GetMapping(path = "/personapi/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonsUsingCustomHeader(){
        return new PersonV1("Raj Bhuva");
    }

    @GetMapping(path = "/personapi/accept", produces = "application/v1+json")
    public PersonV1 getPersonsUsingMimeType(){
        return new PersonV1("Raj Bhuva");
    }
}
