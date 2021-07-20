package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor // <--- THIS is it
public class User implements java.io.Serializable {
    private Long id; // will be set when persisting

    private String firstName;
    private String lastName;
    private int age;
}
