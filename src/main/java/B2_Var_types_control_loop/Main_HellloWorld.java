/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B02_var_types_control_loops;

/**
 *
 * @author PC
 */
public class Main_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello Btec-D05-K12");

        int s = sum(2, 3);
        System.out.println(s);

        System.out.println(sum(4, 6));

        System.out.println(sum(3.5, 2.5));

        System.out.println(sum(3));
    }

    private static int sum(int a, int b) {

        System.out.println("int version");
        return a + b;
    }

    // overloading method
    private static double sum(double a, double b) {

        System.out.println("double version");
        return a + b;
    }

    // recursion (1 + 2 + ... + k)
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}