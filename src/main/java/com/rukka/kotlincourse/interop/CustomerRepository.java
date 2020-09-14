package com.rukka.kotlincourse.interop;

import com.rukka.kotlincourse.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
