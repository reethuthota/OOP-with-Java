// Define a class which contains method “DisplayColor” which takes one character as argument. Raise an exception, if the character is not an alphabet. If the alphabet is a color of the rainbow, display the color name. If it is any other alphabet, report an exception.
package Worksheet1;

import java.util.Scanner;

class ColourFinder {
    void DisplayColour(char colour) throws Exception {
        if (Character.isLetter(colour) == false) {
            throw new Exception("Not an alphabet");
        }
        switch(Character.toLowerCase(colour)){
            case 'v':
                System.out.println("Violet");
                break;

            case 'i':
                System.out.println("Indigo");
                break;

            case 'b':
                System.out.println("Blue");
                break;
            
            case 'g':
                System.out.println("Green");
                break;

            case 'y':
                System.out.println("Yellow");
                break;

            case 'o':
                System.out.println("Orange");
                break;

            case 'r':
                System.out.println("Red");
                break;

            default:
                throw new Exception("Not a colour of the rainbow");
        }
    }
}

public class RainbowColours {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char colour = scan.next().charAt(0);

        ColourFinder obj1 = new ColourFinder();
        try {
            obj1.DisplayColour(colour);
        } catch (Exception e) {
            System.out.println(e);
        }
       
        scan.close();
    }
}
