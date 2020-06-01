package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DictionaryTest {

    @Test
    void testDictionary() {
        String[] words = {"Hello", "World", "Sky", "T1", "Faker", "Teddy", "Doinb"};
        Dictionary dictionary = new Dictionary(words);

        int index = dictionary.find("Faker");
        Assertions.assertEquals(index, 4);
        Assertions.assertEquals(dictionary.get(index), "Faker");
    }
}