package com.sport.WebSport.models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotEmpty(message = "Введіть назву змагань")
    private String title;

    @NotEmpty(message = "Введіть місце проведення змагань")
    private String location;
    @NotNull(message = "Будь ласка, введіть дату")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime date;

    @Min(value = 0, message = "Число не може бути менше 0!")
    private Integer res1;

    @Min(value = 0, message = "Число не може бути менше 0!")
    private Integer res2;

    @NotEmpty(message = "Введіть назву першої команди")
    private String team1;

    @NotEmpty(message = "Введіть назву другої команди")
    private String team2;
    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public Post(String title, String location, LocalDateTime date, String team1, String team2, Integer res1, Integer res2) {
        this.title = title;
        this.location = location;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.res1 = res1;
        this.res2 = res2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Post() {
    }
    public Integer getRes1() {
        return res1;
    }

    public void setRes1(Integer res1) {
        this.res1 = res1;
    }

    public Integer getRes2() {
        return res2;
    }

    public void setRes2(Integer res2) {
        this.res2 = res2;
    }
}