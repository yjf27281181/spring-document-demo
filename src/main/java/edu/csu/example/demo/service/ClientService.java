package edu.csu.example.demo.service;

public class ClientService {
    private static ClientService clientService = new ClientService();
    public ClientService() {}

    public static ClientService createInstance() {
        System.out.println("调用了静态工厂方法");
        return clientService;
    }
}
