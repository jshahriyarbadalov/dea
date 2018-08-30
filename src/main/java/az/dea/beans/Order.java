package az.dea.beans;

import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private long orderNumber;
    private Date orderDate;
    private List<Meal> meals;
    private List<Drinks> drinks;
    private User user;
    private Customer customer;
    private Double amount;
    private Double discountAmount;
    private Branch branch;
    private String address;


    public Order() {
    }

    public Order(long orderId, long orderNumber, Date orderDate, List<Meal> meals, List<Drinks> drinks,
                 User user, Customer customer, Double amount, Double discountAmount, Branch branch, String address) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.meals = meals;
        this.drinks = drinks;
        this.user = user;
        this.customer = customer;
        this.amount = amount;
        this.discountAmount = discountAmount;
        this.branch = branch;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", meals=" + meals +
                ", drinks=" + drinks +
                ", user=" + user +
                ", customer=" + customer +
                ", amount=" + amount +
                ", discountAmount=" + discountAmount +
                ", branch=" + branch +
                ", address='" + address + '\'' +
                '}';
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
