package com.company;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("ivanov","1","asdfgh");
        System.out.println(book);
Book book2=new Book(new Author("Ivanov"), new Title("qw"),new Content("123"));
        System.out.println(book2);
    }
}
