package com.beenz.tx.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.TransactionSynchronization;

@Service
public class SecondService {

    @Transactional
    public void test() {

    }
}
