package homeWorkTask;
import java.util.Scanner;
public class taskMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        taskLogic potatsent = new taskLogic();
        taskLogic potatchara = new taskLogic();
        taskLogic potatoWord = new taskLogic();

        System.out.println("Potato potato Skriv något");
        String potato = scan.nextLine();

        while (!(potato.equals("stop"))) {
            potatsent.setText(potato);
            potatchara.setText(potato);
            potatoWord.setText(potato);
            System.out.println("Potato potato Skriv något eller stop");
            potato = scan.nextLine();
        }

        System.out.println("du har skrivit \n"
                 + potatchara.getCharCount() + " antal tecken! \n"
                 + potatsent.getCount() + " antal meningar!\n"
                 + potatoWord.getWordCount() + " antal ord! ;)");

    }

}
