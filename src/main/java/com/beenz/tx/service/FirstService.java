package com.beenz.tx.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FirstService {

    @Transactional
    public void test() {

    }
}
