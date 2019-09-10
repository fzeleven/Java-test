package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectce7ltest {

        Projectce7ltestDelegate projectce7ltestDelegate = new Projectce7ltestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectce7ltestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}