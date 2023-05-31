package io.datajek.sprindatajpa;

import javax.persistence.*;
import java.sql.Date;

// @Table annotation is not needed if class and table in database are same
@Entity
@Table(name = "Player")
public class Player {
    // @Id is used to generate primary key and @GenerateValue automatically generates the value
    @Id
    @GeneratedValue
    private int id;
    private String name;
    // @Column is used to map the variable to a column. Not needed if names are same.
    @Column(name = "nationality")
    private String nationality;
    private Date birthDate;
    private int titles;

    public Player() {

    }

    public Player(int id, String name, String nationality, Date birthdate, int titles) {
        super();
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthdate;
        this.titles = titles;
    }

    // Constructor without ID
    public Player(String name, String nationality, Date birthdate, int titles) {
        super();
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthdate;
        this.titles = titles;
    }

    public int getId() {
        return id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getTitles() {
        return titles;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "\nPlayer [id= " + id + ", name= " + name + ", nationality= " + nationality + ", birthDate= " + birthDate
                + ", titles= " + titles + "]";
    }
}
