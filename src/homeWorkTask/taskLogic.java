package homeWorkTask;


public class taskLogic {
    private int potatoSentence; //Attribute
    private int potatoCharacter; // attribute
    private int potatoWord; // attribute

    public taskLogic(){
        potatoSentence = 0;
        potatoCharacter = 0;
        potatoWord = 0;
    }

    public void setText(String input) {
        potatoSentence = potatoSentence + 1;
        potatoCharacter = potatoCharacter + input.length();
        potatoWord = potatoWord + input.split("\\s").length;
    }

    public int getCount() {
        return potatoSentence;
    }

    public int getCharCount() {
        return potatoCharacter;
    }

    public int getWordCount() { return potatoWord;
    }
}
