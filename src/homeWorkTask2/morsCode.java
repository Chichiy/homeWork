package homeWorkTask2;

import java.util.HashMap;

public class morsCode {

    //Skriv programmet med minst en logikklass
    private String mosCode;
    private String engCode;

    public morsCode() {
        mosCode = "";
        engCode = "";
    }

    public void setText(String input) {


        //Använd den internationella morsekoden (se slide 4)
        HashMap<String, String> engToMos = new HashMap<>();
        engToMos.put("A", "*-");
        engToMos.put("B", "-***");
        engToMos.put("C", "-*-*");
        engToMos.put("D", "-**");
        engToMos.put("E", "*");
        engToMos.put("F", "**-*");
        engToMos.put("G", "--*");
        engToMos.put("H", "****");
        engToMos.put("I", "**");
        engToMos.put("J", "*---");
        engToMos.put("K", "-*-");
        engToMos.put("L", "*-**");
        engToMos.put("M", "--");
        engToMos.put("N", "-*");
        engToMos.put("O", "---");
        engToMos.put("P", "*--*");
        engToMos.put("Q", "--*-");
        engToMos.put("R", "*-*");
        engToMos.put("S", "***");
        engToMos.put("T", "-");
        engToMos.put("U", "**-");
        engToMos.put("V", "***-");
        engToMos.put("W", "*--");
        engToMos.put("X", "-**-");
        engToMos.put("Y", "-*--");
        engToMos.put("Z", "--**");
        engToMos.put(" ", "");

        HashMap<String, String> mosToEng = new HashMap<>();
        mosToEng.put("*-", "A");
        mosToEng.put("-***", "B");
        mosToEng.put("-*-*", "C");
        mosToEng.put("-**", "D");
        mosToEng.put("*", "E");
        mosToEng.put("**-*", "F");
        mosToEng.put("--*", "G");
        mosToEng.put("****", "H");
        mosToEng.put("**", "I");
        mosToEng.put("*---", "J");
        mosToEng.put("-*-", "K");
        mosToEng.put("*-**", "L");
        mosToEng.put("--", "M");
        mosToEng.put("-*", "N");
        mosToEng.put("---", "O");
        mosToEng.put("*--*", "P");
        mosToEng.put("--*-", "Q");
        mosToEng.put("*-*", "R");
        mosToEng.put("***", "S");
        mosToEng.put("-", "T");
        mosToEng.put("**-", "U");
        mosToEng.put("***-", "V");
        mosToEng.put("*--", "W");
        mosToEng.put("-**-", "X");
        mosToEng.put("-*--", "Y");
        mosToEng.put("--**", "Z");

        String inputOut = "";

        // Skriv ett program som gör om morsekod till engelska
        if (input.contains("*") || input.contains("-")) {
            String[] morse = input.split(" ");
            for (int i = 0; i < morse.length; i++) {
                inputOut += mosToEng.get(morse[i]);
            }
            if (inputOut.equals("null")) {

                System.out.println("Something when wrong please type ether letters or morse code");

            } else {

                engCode = inputOut;

            }
            //och engelska till morsekod
        } else {
            String[] eng = input.toUpperCase().split("");
            for (int i = 0; i < eng.length; i++) {
                inputOut += engToMos.get(eng[i]) + " ";
            }
            if (inputOut.contains("null")) {

                System.out.println("Something when wrong please type ether letters or morse code");

            } else {

                mosCode = inputOut;

            }
        }
    }

    public String getMos() {
        return mosCode;
    }

    public String getEng() {
        return engCode;
    }


    //Skapa minst två felhanteringar i systemet som fångar två saker som användaren kan göra
    // som går utanför det vanliga användandet av systeme

}