package edu.csu.example.demo.service;

import edu.csu.example.demo.dao.JpaAccountDao;
import edu.csu.example.demo.dao.JpaItemDao;

import java.util.ArrayList;
import java.util.List;

public class PetStoreServiceImpl implements PetStoreService{
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

    @Override
    public List<String> getUsernameList() {
        List<String> userNameList = new ArrayList<>();
        userNameList.add("颜小四");
        userNameList.add("颜小五");
        return userNameList;
    }
}
