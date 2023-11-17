public class DeepCopyExample {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String copiedString = new String(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Copied String: " + copiedString);
    }
}

