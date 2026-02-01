public class task10 {
    static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }
    
    public static void main(String[] args) {
        // Test cases
        String test1 = "Hello World";
        String test2 = "Java Programming";
        String test3 = "Single";
        String test4 = "The quick brown fox";
        
        System.out.println("Test 1: \"" + test1 + "\" -> " + secondWordUpper(test1));
        System.out.println("Test 2: \"" + test2 + "\" -> " + secondWordUpper(test2));
        System.out.println("Test 3: \"" + test3 + "\" -> " + secondWordUpper(test3));
        System.out.println("Test 4: \"" + test4 + "\" -> " + secondWordUpper(test4));
    }
}


