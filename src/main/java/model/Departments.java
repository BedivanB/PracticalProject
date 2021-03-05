package model;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Department_ID")
    private Integer departmentID;

    @Column(name = "Department_Name")
    private String departmentName;

    @OneToMany(mappedBy = "departments")
    private List<Employees> employeesList;

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public Departments() {
    }

    public Departments(Integer departmentID, String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
