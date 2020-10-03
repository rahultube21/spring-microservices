package com.rahul.org.samples.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Employee implements Serializable  {
    private static final long serialVersionUID = 7272556606347437316L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String email;
    private String position;
    private String timestamp;
    public Employee(String name, int age, String email, String position) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.position = position;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


}
