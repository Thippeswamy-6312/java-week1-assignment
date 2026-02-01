public class task10 {
    static String secondWordUpper(String str) {
        if (str == null) return "LESS";
        String[] words = str.trim().split("\\s+");
        if (words.length < 2 || words[1].isEmpty()) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        String[] tests = {
            "hello world",
            "one",
            "  leading space second",
            "multiple   words here",
            "",
            null
        };

        for (String t : tests) {
            System.out.println("Input: " + String.valueOf(t) + " -> " + secondWordUpper(t));
        }
    }
}

