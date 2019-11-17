package dao;

import dto.EmployeeDto;

public class EmployeeDao {
    public void display (EmployeeDto employee){
        System.out.println(" | " + employee.getName() + " |");
        System.out.println(" " + employee.getSurname() + " |");
        System.out.println(" " + employee.getOccupation() + " |");
        System.out.println(" " + employee.getDate() + " |");
    }
}
