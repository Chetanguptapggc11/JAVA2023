public class AppendStrings {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append strings to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");

        // Print the appended string
        System.out.println(stringBuffer.toString());
    }
}

