// Написать программу вычисления n-ого треугольного числа.

public class Program {

    public static void main(String[] args) {

        System.out.print("n = ");
        java.util.Scanner in = new java.util.Scanner(System.in);        
        int n = in.nextInt();
        in.close();

        int count = 2;
        int tr_number = 1;
        
        if (n == 1)
            System.out.println("Треугольное число = 1");
        else {
            while (count <= n) {
                tr_number = tr_number + count;
                count++;
            }
            System.out.println("Треугольное число = " + tr_number);
        }
    }
}