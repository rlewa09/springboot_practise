package springdata.tennisplayer;

import java.sql.Date;

public class Player {
    private int id;
    private String name;
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
