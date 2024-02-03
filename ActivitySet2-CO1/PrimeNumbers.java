// Print the first 50 prime numbers, 10 in a row

public class PrimeNumbers {
    public static void main(String args[]) {

        int count = 0;
        int num = 2;

        while(count<50){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } 
            }      
            if(isPrime==true){
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}
