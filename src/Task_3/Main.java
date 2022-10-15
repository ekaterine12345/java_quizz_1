package Task_3;

public class Main {
    public static void main(String[] args) {
        Fraction fraction_1 = new Fraction(5, 8);
        System.out.println(fraction_1);

        Fraction fraction_2 = new Fraction(-9, 15);
        System.out.println(fraction_2);

        //System.out.println(fraction_2);

        Fraction fraction_2_1 = fraction_2.reduceFraction();
        System.out.println(fraction_2_1);

        Fraction sumFrac = fraction_1.sumFraction(fraction_2);
        System.out.println(sumFrac);

        Fraction subFrac = fraction_1.sumFraction(fraction_2, false);
        System.out.println(subFrac);

        Fraction multiplyFrac = fraction_1.multiplyOrDivide(fraction_2);
        System.out.println(multiplyFrac);

        Fraction divideFrac = fraction_1.multiplyOrDivide(fraction_2, false);
        System.out.println(divideFrac);

    }
}