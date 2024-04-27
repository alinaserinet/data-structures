package analyzor.sentence;

public class Main {
    public static void main(String[] args) {
        var counts = new CharCounter()
                .count("Hello this is a Test Text, \t using escape sequences \n \r.")
                .getCounts();
        var readableCounts = new ReadableCharCount(counts)
                .addExceptions(' ', "Space")
                .addExceptions('.', "Dot")
                .addExceptions('\t', "Horizontal Tab")
                .addExceptions('\n', "New line")
                .addExceptions('\r', "Carriage return")
                .addExceptions(',', "Comma");
        System.out.println(readableCounts);
    }
}
