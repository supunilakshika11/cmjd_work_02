package com.gearrent.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEntities {
    public static void main(String[] args) {

        // 1. Equipment
        Equipment eq = new Equipment();
        eq.setEquipmentId("EQ001");
        eq.setBrand("Canon");
        eq.setModel("EOS R5");
        eq.setPurchaseYear(2023);
        eq.setBaseDailyPrice(new BigDecimal("150.00"));
        eq.setSecurityDeposit(new BigDecimal("500.00"));
        eq.setStatus("Available");
        eq.setBranchId(1);
        System.out.println("Equipment: " + eq.getBrand() + " " + eq.getModel());

        // 2. Branch
        Branch branch = new Branch();
        branch.setId(1);
        branch.setName("Colombo Branch");
        branch.setAddress("123 Main Street");
        branch.setContactNumber("011-1234567");
        branch.setEmail("colombo@gearrent.com");
        System.out.println("Branch: " + branch.getName());

        // 3. Category
        Category cat = new Category();
        cat.setId(1);
        cat.setName("Camera");
        cat.setDescription("Digital cameras");
        System.out.println("Category: " + cat.getName());

        // 4. Customer
        Customer cust = new Customer();
        cust.setId(1);
        cust.setFirstName("Supuni");
        cust.setLastName("Lakshika");
        cust.setEmail("supuni@example.com");
        cust.setPhoneNumber("0771234567");
        cust.setAddress("Colombo");
        cust.setLicenseNumber("B1234567");
        System.out.println("Customer: " + cust.getFirstName() + " " + cust.getLastName());

        // 5. Reservation
        Reservation res = new Reservation();
        res.setId(1);
        res.setCustomerId(cust.getId());
        res.setEquipmentId(1);
        res.setStartDate(LocalDate.of(2025, 12, 10));
        res.setEndDate(LocalDate.of(2025, 12, 15));
        res.setStatus("Confirmed");
        System.out.println("Reservation Status: " + res.getStatus());

        // 6. Rental
        Rental rent = new Rental();
        rent.setId(1);
        rent.setReservationId(res.getId());
        rent.setRentalDate(LocalDate.of(2025, 12, 10));
        rent.setReturnDate(LocalDate.of(2025, 12, 15));
        rent.setTotalAmount(new BigDecimal("750.00"));
        rent.setStatus("Ongoing");
        System.out.println("Rental Total: $" + rent.getTotalAmount());

        // 7. SystemUser
        SystemUser user = new SystemUser();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("admin123");
        user.setRole("Admin");
        user.setEmail("admin@gearrent.com");
        user.setActive(true);
        System.out.println("System User: " + user.getUsername() + " Role: " + user.getRole());
    }
}
