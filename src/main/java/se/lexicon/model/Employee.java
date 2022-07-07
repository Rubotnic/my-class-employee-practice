package se.lexicon.model;

import java.time.LocalDate;

    public abstract class Employee {

        public static final double BASE_SALARY = 25_000;
        private int id;
        private String name;
        private double salary;
        private LocalDate dateHire;


        public Employee(int id, String name, double salary, LocalDate dateHire) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateHire = dateHire;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHire() {
        return dateHire;
    }

    public void setDateHire(LocalDate dateHire) {
        this.dateHire = dateHire;
    }

        public abstract void printDescription();

        public abstract double calculateSalary();


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateHire=" + dateHire +
                '}';
    }
}