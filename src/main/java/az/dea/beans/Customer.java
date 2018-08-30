package az.dea.beans;

import az.dea.util.CustomerType;
import az.dea.util.Gender;
import az.dea.util.Status;

import java.util.Date;
import java.util.List;

public class Customer {
    private long customerId;
    private String name;
    private String surname;
    private Date birthdate;
    private String phone;
    private String homePhone;
    private String address1;
    private String address2;
    private String email ;
    private Gender gender;
    private String description;
    private List<Order> orders;
    private CustomerType customerType;
    private Status status;

    public Customer() {
    }

    public Customer(long customerId, String name, String surname, Date birthdate,
                    String phone, String homePhone, String address1, String address2,
                    String email, Gender gender, String description, List<Order> orders,
                    CustomerType customerType, Status status) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.homePhone = homePhone;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.gender = gender;
        this.description = description;
        this.orders = orders;
        this.customerType = customerType;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", phone='" + phone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", description='" + description + '\'' +
                ", orders=" + orders +
                ", customerType=" + customerType +
                ", status=" + status +
                '}';
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
