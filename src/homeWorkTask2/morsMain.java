package homeWorkTask2;

import java.util.Scanner;

public class morsMain {
    public static void main(String[] args) {

        //samt en klass som läser in text och skriver ut text (med en main-metod)
        Scanner scan = new Scanner(System.in);
        morsCode logic = new morsCode();

        System.out.println("Write the word or morse code u want translated!");

        logic.setText(scan.nextLine());
        System.out.println(logic.getEng());
        System.out.println(logic.getMos());

    }
}
