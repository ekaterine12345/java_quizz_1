package Task_1;

public class Main {
    public static void main(String[] args) {

       double a=5.0, b=10.0, c=12;
       double ans1 =  Square_Equation(a, b, c);
       System.out.println(a+" "+b+" "+c+" "+ans1);

       a=3.0;
       b=15.0;
       c=2.5;
       ans1 = Square_Equation(a, b, c);
       System.out.println(a+" "+b+" "+c+" "+ans1);
    }

    public static double Square_Equation(double a, double b, double c){
        double D = b*b - 4*a*c;
       return D;
    }

}
