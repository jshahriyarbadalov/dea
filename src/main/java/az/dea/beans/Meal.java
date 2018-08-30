package az.dea.beans;

import az.dea.util.MealCategory;
import az.dea.util.Status;

import java.util.Date;

public class Meal {
    private long mealId;
    private String name;
    private MealCategory mealCategory;
    private Double price;
    private Double soldPrice;
    private Double discount;
    private Date soldDate;
    private Double weight;
    private Status status;

    public Meal() {
    }

    public Meal(long mealId, String name, MealCategory mealCategory, Double price, Double soldPrice, Double discount, Date soldDate, Double weight, Status status) {
        this.mealId = mealId;
        this.name = name;
        this.mealCategory = mealCategory;
        this.price = price;
        this.soldPrice = soldPrice;
        this.discount = discount;
        this.soldDate = soldDate;
        this.weight = weight;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId=" + mealId +
                ", name='" + name + '\'' +
                ", mealCategory=" + mealCategory +
                ", price=" + price +
                ", soldPrice=" + soldPrice +
                ", discount=" + discount +
                ", soldDate=" + soldDate +
                ", weight=" + weight +
                ", status=" + status +
                '}';
    }

    public long getMealId() {
        return mealId;
    }

    public void setMealId(long mealId) {
        this.mealId = mealId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MealCategory getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(MealCategory mealCategory) {
        this.mealCategory = mealCategory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
