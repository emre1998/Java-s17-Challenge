package com.workintech.S17Challange.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private int credit;
    private Grade grade;
}


