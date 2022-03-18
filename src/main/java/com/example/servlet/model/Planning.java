package com.example.servlet.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Planning {
    private int id;
    private String name;
    private Date beginnig;
    private Date ending;
    private List<Cour> allCour;
}
