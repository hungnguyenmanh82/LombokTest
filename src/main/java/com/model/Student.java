package com.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor // <--- THIS is it
@EqualsAndHashCode
public class Student implements java.io.Serializable {
    private String name;
    private int age;
}
