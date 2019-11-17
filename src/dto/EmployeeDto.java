package dto;

import java.util.Date;

public class EmployeeDto {
    private String name;
    private String surname;
    private String occupation;
    private Date date;

    public EmployeeDto(String name, String surname, String occupation, Date date){
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
