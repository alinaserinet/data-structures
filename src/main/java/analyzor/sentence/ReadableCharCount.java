package analyzor.sentence;

import java.util.HashMap;
import java.util.Map;

public class ReadableCharCount {
    private final int[] counts;
    private final Map<Character, String> exceptions;
    public ReadableCharCount(int[] counts) {
        this.counts = counts;
        this.exceptions = new HashMap<>();
    }

    public ReadableCharCount addExceptions(char key, String value) {
        this.exceptions.put(key, value);
        return this;
    }

    @Override
    public String toString() {
        var result = new StringBuilder();
        for (int code = 0; code < this.counts.length; code++) {
            if (this.counts[code] == 0) continue;
            var hasException = this.exceptions.containsKey((char) code);
            if (hasException) {
                result.append(this.exceptions.get((char) code)).append(": ").append(counts[code]).append('\n');
                continue;
            }
            result.append((char) code).append(": ").append(counts[code]).append('\n');
        }
        return result.toString();
    }
}
