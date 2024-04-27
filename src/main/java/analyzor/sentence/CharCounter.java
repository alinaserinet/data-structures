package analyzor.sentence;

import java.util.Arrays;

public class CharCounter {
    private final int[] counts;
    public CharCounter(){
        this.counts = new int[256];
    }

    @SuppressWarnings("UnusedReturnValue")
    public CharCounter count(String sentence) {
        var characters = sentence.toCharArray();
        for (char character: characters) {
            this.counts[character]++;
        }
        return this;
    }

    public int[] getCounts(){
        return this.counts;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.counts);
    }
}
