package se.lexicon.model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        SalesPerson sellerOne = new SalesPerson(2, "Super-seller Rune", 25000, LocalDate.parse("2022-02-20"),
                new String[]{"Dodge", "FIAT", "Volvo", "SAAB",},
                new String[]{"Ferrari", "Lexus", "Porsche", "Jaguar",});


        Employee employeeRune = new SalesPerson(2, "Super-seller Rune", 25000, LocalDate.parse("2022-02-20"),
                new String[]{"Client1", "Client2", "Client3", "Client4",},
                new String[]{"aquiredClient1", "aquiredClient2", "aquiredClient3", "aquiredClient4",});

        sellerOne.printDescription();


        SystemDeveloper developerOne = new SystemDeveloper(1, "Jack the gray", 25000, LocalDate.parse("2021-04-04"),
                new String[]{"OCA", "OCP", "OCE", "OCM"}, new String[]{"c++", "java", "python", "lua"});

        Employee employeeJack = new SystemDeveloper(1, "Jack the gray", 25000, LocalDate.parse("2021-04-04"),
                new String[]{"OCA", "OCP", "OCE", "OCM"}, new String[]{"c++", "java", "python", "lua"});

        developerOne.printDescription();

    }
}
