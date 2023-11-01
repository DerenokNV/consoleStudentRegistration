package com.example.consoleStudentRegistration.data;


import lombok.Data;


@Data
public class Student {
  private static int COUNTER = 0;

  private int id;
  private String firstName;
  private String lastName;
  private int age;

  public  Student( String firstName, String lastName, int age ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.id = Integer.valueOf( COUNTER++ );
  }
}
