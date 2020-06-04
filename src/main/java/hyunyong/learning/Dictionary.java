package hyunyong.learning;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public int find(String word) {
        // TODO: implementation
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word))
                return i;
        }
        return -1;

    }

    public String get(int index) {
        // TODO: implementation
    return words[index];
    }
}
