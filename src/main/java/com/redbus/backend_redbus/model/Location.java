package com.redbus.backend_redbus.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String cityName;
    @OneToMany
    private List<PointsTable> boardingPoints = new ArrayList<>();
}