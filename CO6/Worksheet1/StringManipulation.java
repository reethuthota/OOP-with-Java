package Worksheet1;
public class StringManipulation {
    public static void main(String[] args) {
        // Given strings
        String S1 = "hello";
        String S2 = "GOODBYE";
        String S3 = " spaces ";

        // Replace 'l' with 'L' in S1
        String modifiedS1 = S1.replace('l', 'L');
        System.out.println("Replace 'l' with 'L' in S1: " + modifiedS1);

        // Convert S1 to uppercase
        String upperCaseS1 = S1.toUpperCase();
        System.out.println("Convert S1 to uppercase: " + upperCaseS1);

        // Convert S2 to lowercase
        String lowerCaseS2 = S2.toLowerCase();
        System.out.println("Convert S2 to lowercase: " + lowerCaseS2);

        // Trim S3
        String trimmedS3 = S3.trim();
        System.out.println("Trim S3: \"" + trimmedS3 + "\"");

        // Print S1
        System.out.println("Print S1: " + S1);
    }
}
