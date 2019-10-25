package edu.csu.example.demo.service;

import edu.csu.example.demo.dao.JpaAccountDao;
import edu.csu.example.demo.dao.JpaItemDao;

public class PetStoreServiceImpl {
    JpaAccountDao accountDao;
    JpaItemDao itemDao;

    public PetStoreServiceImpl() {
    }

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
