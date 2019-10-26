package edu.csu.example.demo.service;

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();

    private static AccountService accountService = new AccountServiceImpl();

    public ClientService createClientServiceInstance() {
        System.out.println("factory create: clientService");
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        System.out.println("factory create: accountService");
        return accountService;
    }
}
