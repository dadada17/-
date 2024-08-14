package com.dada.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

    @Autowired
    private JsonRepository jsonRepository;

    public Integer totalPostCount() {
        return jsonRepository.SumPostCount();
    }
}
