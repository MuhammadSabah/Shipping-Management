package model;

import java.io.Serializable;

public record Employee(int id,
                       String firstName,
                       String middleName,
                       String lastName,
                       String address,
                       int age,
                       char gender,
                       String phoneNumber,
                       String email,
                       double yearlySalary) implements Serializable {
    public Employee {
        if (firstName.length() < 3 || lastName.length() < 3 || middleName.length() < 3) {
            throw new IllegalArgumentException("Employee name is too short");
        }
    }
}


