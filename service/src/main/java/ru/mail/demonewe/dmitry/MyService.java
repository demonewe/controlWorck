package ru.mail.demonewe.dmitry;

public class MyService {
    private MyRepository myRepository = new MyRepository();

    public String myRepository(){
        String hello = "Hello world from service";
        System.out.println(hello);
        return myRepository.myRepository() +"\n" + hello;
    }
}
