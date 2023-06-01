package io.datajek.tennisplayerrest;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Player {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String nationality;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthDate;

    private int titles;

    public Player() {}

    public Player(String name, String nationality, Date birthDate, int titles) {
        super();
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int getTitles() {
        return titles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nPlayer [id = " + id + ", name= " + name + ", nationality= " + nationality + ", birthDate= " + birthDate
                + ", titles= " + titles + "]";
    }
}
