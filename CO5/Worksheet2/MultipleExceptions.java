// Using multiple catch statements perform actions for ArrayIndexOutofBoundException, ArithmeticException, NullPointerException, NumberFormatException, Exception.

package Worksheet2;

public class MultipleExceptions {
    public static void main(String args[]) {
        try {
            int a = 5;
            int b = 5/0;

            int arr[] = new int[5];
            arr[10] = a;

            String c = null;
            System.out.println(c.length());

            String d = "abc12";
            int num_d = Integer.parseInt(d);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
