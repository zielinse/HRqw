import DTO.DepartmentDTO;

public class AppClass {
    public static void main(String[] args){

        DepartmentDTO hr = new DepartmentDTO( "HR", "Human Resourscers");
        hr.setFullName("Human Resourscers");
        hr.setShortName("HR");
        DepartmentDTO it = new DepartmentDTO("IT", "Information Technology");
        it.setFullName("Information Technology");
        it.setShortName("IT");
        DepartmentDTO fin = new DepartmentDTO("FIN", "Finance");
        fin.setFullName("Finance");
        fin.setShortName("FIN");
    }
}
