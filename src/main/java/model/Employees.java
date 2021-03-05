package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employees {

    @Id
    @Column
    @GeneratedValue
    private Integer badgeID;

    @Column
    private String rank;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Department_ID")
    private Departments departments;

    @OneToMany(mappedBy = "employees")
    List<Files> filesList;

    public List<Files> getFilesList() {
        return filesList;
    }

    public void setFilesList(List<Files> filesList) {
        this.filesList = filesList;
    }

    public Employees() {
    }

    public Employees(String rank, String firstName, String lastName) {
        this.rank = rank;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getBadgeID() {
        return badgeID;
    }

    public void setBadgeID(Integer badgeID) {
        this.badgeID = badgeID;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "badgeID=" + badgeID +
                ", rank='" + rank + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
