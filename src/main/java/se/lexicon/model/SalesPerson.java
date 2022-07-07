package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

    public final class SalesPerson extends Employee {

    public static final double CLIENTS_BONUS = 500;
    public static final double AQUIREDCLIENTS_BONUS = 1000;
    private String[] clients;
    private String[] aquiredClients;


    public SalesPerson(int id, String name, double salary, LocalDate dateHire, String[] clients, String[] aquiredClients) {
        super(id, name, salary, dateHire);
        this.clients = clients;
        this.aquiredClients = aquiredClients;
    }


    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public String[] getClients() {
        return clients;
    }

    public String[] getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(String[] aquiredClients) {
        this.aquiredClients = aquiredClients;
    }


    @Override
    public void printDescription(){
        System.out.println(getName() + " have id nr. " + getId() + " and a total salary of " + calculateSalary() +
                ". His salary increases because of maintenance av client " + Arrays.toString(clients) + " and " + "new clients " + Arrays.toString(aquiredClients)+".");
}


    @Override
    public double calculateSalary() {

    double sellerSalary = BASE_SALARY;

    double clientBonus = clients.length * CLIENTS_BONUS;
    double quiredClientBonus = aquiredClients.length * AQUIREDCLIENTS_BONUS;

    sellerSalary += clientBonus;
    sellerSalary += quiredClientBonus;

        setSalary(sellerSalary);
        return sellerSalary;
    }


    @Override
    public String toString () {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + Arrays.toString(aquiredClients) +
                '}';
    }
}