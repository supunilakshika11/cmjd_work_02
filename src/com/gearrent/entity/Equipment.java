package com.gearrent.entity;
import java.math.BigDecimal;

public class Equipment {
    private int id;
    private String equipmentId; // unique string code
    private int categoryId;
    private String brand;
    private String model;
    private int purchaseYear;
    private BigDecimal baseDailyPrice;
    private BigDecimal securityDeposit;
    private String status; // Available, Reserved, Rented
    private int branchId;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEquipmentId() { return equipmentId; }
    public void setEquipmentId(String equipmentId) { this.equipmentId = equipmentId; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPurchaseYear() { return purchaseYear; }
    public void setPurchaseYear(int purchaseYear) { this.purchaseYear = purchaseYear; }

    public BigDecimal getBaseDailyPrice() { return baseDailyPrice; }
    public void setBaseDailyPrice(BigDecimal baseDailyPrice) { this.baseDailyPrice = baseDailyPrice; }

    public BigDecimal getSecurityDeposit() { return securityDeposit; }
    public void setSecurityDeposit(BigDecimal securityDeposit) { this.securityDeposit = securityDeposit; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getBranchId() { return branchId; }
    public void setBranchId(int branchId) { this.branchId = branchId; }
}
