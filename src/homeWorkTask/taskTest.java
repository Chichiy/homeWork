package homeWorkTask;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class taskTest {

    @Test
    public void TestGetSentenceCount(){
        // arrange
        taskLogic sentenceCount = new taskLogic();

        //act
        int expected = 0;
        int actual = sentenceCount.getCount();
        //assert
        assertEquals(expected,actual);

    }
    @Test
    public void TestGetSentenceCount2(){
        // arrange
        taskLogic sentenceCount = new taskLogic();
        sentenceCount.setText("Potato");
        //act
        int expected = 1;
        int actual = sentenceCount.getCount();
        //assert
        assertEquals(expected,actual);

    }
    @Test
    public void TestGetSentenceCount3(){
        // arrange
        taskLogic sentenceCount = new taskLogic();
        sentenceCount.setText("Potato");
        sentenceCount.setText("Potato");
        //act
        int expected = 2;
        int actual = sentenceCount.getCount();
        //assert
        assertEquals(expected,actual);

    }
    @Test
    public void TestGetCharacterCount(){
        // arrange
        taskLogic characterCount = new taskLogic();
        //act
        int expected = 0;
        int actual = characterCount.getCharCount();
        // assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestGetCharacterCount1(){
        // arrange
        taskLogic characterCount = new taskLogic();
        characterCount.setText("hej");
        //act
        int expected = 3;
        int actual = characterCount.getCharCount();
        // assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestGetCharacterCount2(){
        // arrange
        taskLogic characterCount = new taskLogic();
        characterCount.setText("potato");
        characterCount.setText("hej");
        characterCount.setText("hej");
        //act
        int expected = 12;
        int actual = characterCount.getCharCount();
        // assert
        assertEquals(expected,actual);
    }
    @Test
    public void TestGetWordCount(){
        //arrange
        taskLogic wordCount = new taskLogic();
        wordCount.setText("hej");
        //act
        int expected = 1;
        int actual = wordCount.getWordCount();
        //assert
        assertEquals(expected, actual);
    }
    @Test
    public void TestGetWordCount2(){
        //arrange
        taskLogic wordCount = new taskLogic();
        wordCount.setText("hej");
        wordCount.setText("hej");
        wordCount.setText("hej");
        //act
        int expected = 3;
        int actual = wordCount.getWordCount();
        //assert
        assertEquals(expected, actual);
    }
    @Test
    public void TestGetWordCount3(){
        //arrange
        taskLogic wordCount = new taskLogic();
        wordCount.setText("hej hej hej");
        //act
        int expected = 3;
        int actual = wordCount.getWordCount();
        //assert
        assertEquals(expected, actual);
    }
}

