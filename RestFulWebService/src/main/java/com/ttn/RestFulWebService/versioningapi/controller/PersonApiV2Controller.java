package com.ttn.RestFulWebService.versioningapi.controller;

import com.ttn.RestFulWebService.versioningapi.entity.PersonName;
import com.ttn.RestFulWebService.versioningapi.entity.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class PersonApiV2Controller {
    @GetMapping(path = "/personapi/v2")
    public PersonV2 getPersonsUsingUri(){
        return new PersonV2(new PersonName("Raj","","Bhuva"));
    }

    @GetMapping(path = "/personapi/param", params = "version=2")
    public PersonV2 getPersonsUsingRequestParameters(){
        return new PersonV2(new PersonName("Raj","","Bhuva"));
    }

    @GetMapping(path = "/personapi/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonsUsingCustomHeadera(){
        return new PersonV2(new PersonName("Raj","","Bhuva"));
    }

    @GetMapping(path = "/personapi/accept", produces = "application/v2+json")
    public PersonV2 getPersonsUsingMimeType(){
        return new PersonV2(new PersonName("Raj","","Bhuva"));
    }
}
