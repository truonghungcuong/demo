package com.example.demoapi.service;



import com.example.demoapi.model.City;

import java.util.Optional;

public interface ICityService {
    Iterable<City> findAllCity();

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);
}
