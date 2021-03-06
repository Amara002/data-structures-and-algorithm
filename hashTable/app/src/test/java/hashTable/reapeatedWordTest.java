package hashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class reapeatedWordTest {
    @Test
    public void repeatedWordTest(){

        HashTable<String, Integer> test = new HashTable<String, Integer>();

        String paragraph1 = "Once upon a time, there was a brave princess who...";
        assertEquals("a", test.repeatedWord(paragraph1));

        String paragraph2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        assertEquals("it", test.repeatedWord(paragraph2));

        String paragraph3= "It was a queer,  sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York";
        assertEquals("summer", test.repeatedWord(paragraph3));

    }
    @Test
    public  void repeatedWordTestNoRepeat(){

        HashTable<String, Integer> test = new HashTable<String, Integer>();

        String paragraph = "Once upon a time";
        assertEquals("no repeated words", test.repeatedWord(paragraph));
    }
}
