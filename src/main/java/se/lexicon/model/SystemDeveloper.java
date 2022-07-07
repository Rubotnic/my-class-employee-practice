package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

    public final class SystemDeveloper extends Employee {


    public static  final double LANGUAGES_BONUS = 1500;
    public static  final double CERTIFICATES_BONUS = 1000;
    private String[] certificates;
    private String[] languages;


    public SystemDeveloper(int id, String name, double salary, LocalDate dateHire, String[] certificates, String[] languages) {
        super(id, name, salary, dateHire);
        this.certificates = certificates;
        this.languages = languages;
    }


    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        languages = languages;
    }


    @Override
    public void printDescription() {
        System.out.println(getName() + " have id nr. " + getId() + " and a total salary of " + calculateSalary() +
                ". His salary is increases because he have certificates " + Arrays.toString(certificates) + " and " + "works whit " + Arrays.toString(languages)+".");
    }


    @Override
    public double calculateSalary() {
        double systemDeveloperSalary = BASE_SALARY;

        double languageBonus = languages.length * LANGUAGES_BONUS;
        double certificateBonus = certificates.length * CERTIFICATES_BONUS;

        systemDeveloperSalary += languageBonus;
        systemDeveloperSalary += certificateBonus;

        setSalary(systemDeveloperSalary);
        return systemDeveloperSalary;
    }


    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", Languages=" + Arrays.toString(languages) +
                '}';
    }
}