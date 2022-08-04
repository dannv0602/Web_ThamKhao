package com.ltweb.service;

import java.util.List;

public interface ICategoryService<T> {
    List<T> findAll();
}
