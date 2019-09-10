package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-10T06:15:07.721Z")

@RestSchema(schemaId = "projectce7ltest")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectce7ltestImpl {

    @Autowired
    private Projectce7ltestDelegate userProjectce7ltestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectce7ltestDelegate.helloworld(name);
    }

}
