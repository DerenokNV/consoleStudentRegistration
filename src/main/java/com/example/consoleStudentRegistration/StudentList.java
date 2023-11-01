package com.example.consoleStudentRegistration;

import com.example.consoleStudentRegistration.data.Student;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@ShellComponent
public class StudentList {

  private final List<Student> students = new ArrayList();

  @ShellMethod(key = "add")
  public String addStudent( @ShellOption(value = "n") String firstName,
                            @ShellOption(value = "f") String lastName,
                            @ShellOption(value = "a") int age ) {
    if ( firstName.isEmpty() || lastName.isEmpty() || age == 0 ) {
      return "Check your input";
    }

    students.add( new Student( firstName, lastName, age ) );

    return MessageFormat.format( "Student added: name: {0}, family: {1}, age: {2}", firstName, lastName, age );
  }

  @ShellMethod(key = "print")
  public void printStudent() {
    students.forEach( student -> System.out.println( student.toString() ) );
  }

  @ShellMethod(key = "delete")
  public String deleteStudent( @ShellOption(value = "id") int id ) {
    Optional<Student> studentOpt = students.stream().filter(x -> x.getId() == id ).findAny();
    if ( studentOpt.isPresent() ) {
      students.remove( studentOpt.get() );
      return "Student delete";
    }
    return "Yps, not student id";
  }

  @ShellMethod(key = "deleteAll")
  public String deleteAllStudent() {
    students.clear();
    return "List cleared";
  }

}
