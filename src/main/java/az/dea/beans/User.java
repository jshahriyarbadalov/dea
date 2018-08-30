package az.dea.beans;

import az.dea.util.*;

import java.util.Date;
import java.util.List;

public class User {
    private long userId;
    private String username;
    private String password;
    private String fullname;
    private String name;
    private String surname;
    private List<Permission> specialPermissions;
    private String phone;
    private int age;
    private Long branchId;
    private Date birthDate;
    private Date registerDate;
    private UserType userType;
    private Status userStatus;
    private String email;
    private String homePhone;
    private String address;
    private Gender gender;
    private Nationality nationality;
    private Quality quality;
    private String description;
    private Double salary;
    private Double percentSalary;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialPermissions=" + specialPermissions +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", branchId=" + branchId +
                ", birthDate=" + birthDate +
                ", registerDate=" + registerDate +
                ", userType=" + userType +
                ", userStatus=" + userStatus +
                ", email='" + email + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", nationality=" + nationality +
                ", quality=" + quality +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", percentSalary=" + percentSalary +
                '}';
    }

    public User() {
    }

    public User(long userId, String username, String password, String fullname,
                String name, String surname, List<Permission> specialPermissions,
                String phone, int age, Long branchId, Date birthDate, Date registerDate,
                UserType userType, Status userStatus, String email, String homePhone,
                String address, Gender gender, Nationality nationality, Quality quality,
                String description, Double salary, Double percentSalary) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.name = name;
        this.surname = surname;
        this.specialPermissions = specialPermissions;
        this.phone = phone;
        this.age = age;
        this.branchId = branchId;
        this.birthDate = birthDate;
        this.registerDate = registerDate;
        this.userType = userType;
        this.userStatus = userStatus;
        this.email = email;
        this.homePhone = homePhone;
        this.address = address;
        this.gender = gender;
        this.nationality = nationality;
        this.quality = quality;
        this.description = description;
        this.salary = salary;
        this.percentSalary = percentSalary;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public List<Permission> getSpecialPermissions() {
        return specialPermissions;
    }

    public void setSpecialPermissions(List<Permission> specialPermissions) {
        this.specialPermissions = specialPermissions;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Status getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Status userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getPercentSalary() {
        return percentSalary;
    }

    public void setPercentSalary(Double percentSalary) {
        this.percentSalary = percentSalary;
    }
}
