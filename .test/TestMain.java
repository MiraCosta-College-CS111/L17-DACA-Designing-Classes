import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    @DisplayName("testToString")
    void testToString() {
        DACArecipient person = new DACArecipient();

        person.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        String string = person.toString();

        boolean result = (string.contains("Hernandez") && string.contains("Alex") && string.contains("25-6-567") && string.contains("Mexico") && string.contains("2451257") && string.contains("39567322") && string.contains("39567818") && string.contains("F"));

        assertEquals(true,result);
    }

    @Test
    @DisplayName("testEqualsMethodTrue")
    void testEqualsMethodTrue() {
        DACArecipient person1 = new DACArecipient();
        person1.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        DACArecipient person2 = new DACArecipient();
        person2.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        assertEquals(true,
                (person1.equals(person2)));
    }

    @Test
    @DisplayName("testEqualsMethodFalse")
    void testEqualsMethodFalse() {
        DACArecipient person1 = new DACArecipient();
        person1.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        DACArecipient person2 = new DACArecipient();
        person2.setAll("Gomez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        DACArecipient person3 = new DACArecipient();
        person3.setAll("Hernandez", "Mike", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        DACArecipient person4 = new DACArecipient();
        person4.setAll("Hernandez", "Alex", "25-4-567", "Brazil", 2451257, 39567322, 39567818, 'F');

        DACArecipient person5 = new DACArecipient();
        person5.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2401257, 39567322, 39567818, 'F');

        DACArecipient person6 = new DACArecipient();
        person6.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39067322, 39567818, 'F');

        DACArecipient person7 = new DACArecipient();
        person7.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567808, 'F');

        DACArecipient person8 = new DACArecipient();
        person8.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'M');

        boolean result = !(!person1.equals(person2)&&!person1.equals(person3)&&!person1.equals(person4)&&!person1.equals(person5)&&!person1.equals(person6)&&!person1.equals(person7)&&!person1.equals(person8));

        assertEquals(false,result);
    }

    @Test
    @DisplayName("testPrintCard")
    void testPrintCard() {

        String surname = "Walker";
        String givenName = "Catherine";
        String uscisNumber = "12-3-456";
        String countryOfOrigin = "Canada";
        int birthday = 2434852, validFromDate = 2450389, expirationDate = 2459953;
        char sex = 'F';

        /****** CONSTANTS ******/
        String ASCII_ART_0 ="    .----.    .----.  ",
                ASCII_ART_1 = "   (  --  \\  /  --  )",
                ASCII_ART_2 = "          |  |        ",
                ASCII_ART_3 = "         _/  \\_      ",
                ASCII_ART_4 = "        (_    _)      ",
                ASCII_ART_5 = "     ,    `--`    ,   ",
                ASCII_ART_6 = "     \\'-.______.-'/  ",
                ASCII_ART_7 = "      \\          /   ",
                ASCII_ART_8 = "       '.--..--.'     ",
                ASCII_ART_9 = "         `\"\"\"\"\"` ",
                ASCII_CREDIT ="   ascii art by: jgs    ";

        String TITLE_USA = "UNITED STATES OF AMERICA",
                TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#", LABEL_BIRTH_COUNTRY = "Country of Birth",
                LABEL_BIRTH_DATE = "Date of Birth",
                LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
                LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
        String card;

        card = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
        card += String.format("║%35s%35s║%n", TITLE_USA, "");
        card += String.format("║%60s%10s║%n", TITLE_EAC, "");
        card += String.format("║%-25s%-45S║%n", "", LABEL_SURNAME);
        card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
        card += String.format("║%-25s%-45S║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
        card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);

        card += String.format("║%-25s%-45S║%n", ASCII_ART_3, LABEL_USCIS_NUM);
        card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);

        card += String.format("║%-25s%-45S║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
        card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
        card += String.format("║%-25s%-15S%-30S║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
        card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, "04/19/1954", sex);
        card += String.format("║%-25s%-15S%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, "11/01/1996");
        card += String.format("║%-25s%-15S%-30s║%n", "", LABEL_EXPIRE_DATE, "01/08/2023");
        card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
        card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");

        DACArecipient person = new DACArecipient();
        person.setAll("Walker","Catherine",
                "12-3-456","Canada",2434852, 2450389, 2459953, 'F');

        assertEquals(card,person.printCard());
    }

}