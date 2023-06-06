package com.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class DBService {

    public void instantiateTestDataBase() throws ParseException {
        System.out.println("TEST");
    }

    public void instantiateDataBase() throws ParseException {

        System.out.println("PROD");

    }
}
