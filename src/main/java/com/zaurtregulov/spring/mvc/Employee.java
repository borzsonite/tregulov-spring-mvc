package com.zaurtregulov.spring.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be min 2 symbols")
    private String name;
    //@NotEmpty(message = "Surname must not be empty")
    @NotBlank(message = "Surname must not be empty")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1001, message = "must be less than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use pattern xxx-xx-xx")
    private String phoneNumber;
    private String email;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBand() {
        return carBand;
    }

    public void setCarBand(String carBand) {
        this.carBand = carBand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("MB", "Mersedes Bentz");
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English","EN");
        languageList.put("Duchland","DE");
        languageList.put("French","FR");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
