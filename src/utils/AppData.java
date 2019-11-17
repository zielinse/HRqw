package utils;

import DTO.DepartmentDTO;

import java.util.ArrayList;
import java.util.List;

public class AppData {

    public List<DepartmentDTO> getDepartment(){
        List<DepartmentDTO> departmentList = new ArrayList<>();
        DepartmentDTO hr = new DepartmentDTO( "HR", "Human Resourscers");
        departmentList.add(hr);
        DepartmentDTO it = new DepartmentDTO("IT", "Information Technology");
        departmentList.add(it);
        DepartmentDTO fin = new DepartmentDTO("FIN", "Finance");
        departmentList.add(fin);
        return departmentList;
    }

    public List<String> getOccupation(){
        List<String> occupationList = new ArrayList<>();
        occupationList.add("junior");
        occupationList.add("mid");
        occupationList.add("senior");
        return occupationList;
    }
}
