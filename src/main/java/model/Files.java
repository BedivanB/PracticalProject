package model;

import javax.persistence.*;

@Entity
public class Files {

    @Id
    @Column(name = "File_ID")
    @GeneratedValue
    private Integer fileID;

    @Column(name = "Citizen_SSN")
    private String citizenSSN;

    @Column(name = "Legal_Framework")
    private String legalFramework;

    @Column(name = "Crime_Address")
    private String crimeAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Badge_ID")
    private Employees employees;

    public Files() {
    }

    public Files(String citizenSSN, String legalFramework, String crimeAddress) {
        this.citizenSSN = citizenSSN;
        this.legalFramework = legalFramework;
        this.crimeAddress = crimeAddress;
    }

    public Integer getFileID() {
        return fileID;
    }

    public void setFileID(Integer fileID) {
        this.fileID = fileID;
    }

    public String getCitizenSSN() {
        return citizenSSN;
    }

    public void setCitizenSSN(String citizenSSN) {
        this.citizenSSN = citizenSSN;
    }

    public String getLegalFramework() {
        return legalFramework;
    }

    public void setLegalFramework(String legalFramework) {
        this.legalFramework = legalFramework;
    }

    public String getCrimeAddress() {
        return crimeAddress;
    }

    public void setCrimeAddress(String crimeAddress) {
        this.crimeAddress = crimeAddress;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Files{" +
                "fileID=" + fileID +
                ", citizenSSN='" + citizenSSN + '\'' +
                ", legalFramework='" + legalFramework + '\'' +
                ", crimeAddress='" + crimeAddress + '\'' +
                ", employees=" + employees +
                '}';
    }
}
