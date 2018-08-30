package az.dea.beans;

import az.dea.util.DrinkCategory;
import az.dea.util.Status;

import java.util.Date;

public class Drinks {
    private long drinkId;
    private String name;
    private DrinkCategory drinkCategory;
    private Double price;
    private Double soldPrice;
    private Double discount;
    private Date soldDate;
    private Double capacity;
    private Status status;

    public Drinks() {
    }

    public Drinks(long drinkId, String name, DrinkCategory drinkCategory, Double price, Double soldPrice, Double discount, Date soldDate, Double capacity, Status status) {
        this.drinkId = drinkId;
        this.name = name;
        this.drinkCategory = drinkCategory;
        this.price = price;
        this.soldPrice = soldPrice;
        this.discount = discount;
        this.soldDate = soldDate;
        this.capacity = capacity;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkId=" + drinkId +
                ", name='" + name + '\'' +
                ", drinkCategory=" + drinkCategory +
                ", price=" + price +
                ", soldPrice=" + soldPrice +
                ", discount=" + discount +
                ", soldDate=" + soldDate +
                ", capacity=" + capacity +
                ", status=" + status +
                '}';
    }

    public long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(long drinkId) {
        this.drinkId = drinkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrinkCategory getDrinkCategory() {
        return drinkCategory;
    }

    public void setDrinkCategory(DrinkCategory drinkCategory) {
        this.drinkCategory = drinkCategory;
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

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
