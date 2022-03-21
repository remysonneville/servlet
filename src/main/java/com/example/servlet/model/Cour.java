package com.example.servlet.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cour {
    private int id;
    private String material;
    private Date date;
    private Date beging;
    private Date ending;
}
