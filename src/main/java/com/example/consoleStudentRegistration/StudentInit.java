package com.example.consoleStudentRegistration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("app.init-student.enable")
public class StudentInit {

  private final StudentList studentList;
  public StudentInit( StudentList studentList ) {
    this.studentList = studentList;
    init();
  }

  private void init() {
    studentList.addStudent("Petr", "Petrov", 34 );
    studentList.addStudent("Ivan", "Ivanov", 45 );
    studentList.addStudent("Natalia", "Mech", 38 );
  }
}
