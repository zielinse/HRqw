package dto;

import DTO.DepartmentDTO;

import java.util.Date;

public class EmployeeDto {
    private String name;
    private String surname;
    private String occupation;
    private Date date;
    private DepartmentDTO department;


    public EmployeeDto(String name, String surname, String occupation, Date date, DepartmentDTO department) {
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.date = date;
        this.department = department;
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

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

}

