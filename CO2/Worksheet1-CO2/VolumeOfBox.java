// Volume of a box using parameters and return value in method

import java.util.*;

class Volume {
    Scanner scanner = new Scanner(System.in);
    int length, width, height;

    void assign() {
        System.out.print("Enter height of box : ");
        height = scanner.nextInt();
        System.out.print("Enter length of box : ");
        length = scanner.nextInt();
        System.out.print("Enter width of box : ");
        width = scanner.nextInt();
        
        scanner.close();
    }

    int CalculateVolume() {
        int vol = length * width * height;
        return vol;
    }
}

public class VolumeOfBox {
    public static void main(String args[]) {
        Volume myBox = new Volume();
        myBox.assign();
        int vol = myBox.CalculateVolume();
        System.out.println("Volume of the given box : " + vol);
    }
    
}