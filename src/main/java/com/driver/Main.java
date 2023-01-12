package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly newPerson = new RWOnly();
        // these will not work because the name variable is private
        // newPerson.name = "Name";
        // System.out.println(newPerson.name);
        newPerson.setName("Name");
        System.out.println(newPerson.getName());
    }
}
