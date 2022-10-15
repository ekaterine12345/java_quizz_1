package Task_3;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Can not Create such Fraction");
            System.exit(1);
        }

        this.denominator = denominator;
        if (this.denominator <0) {this.numerator*=-1; this.denominator*=-1;}
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void multiplyFraction(int m){
        if (m==0) {
            System.out.println("Multiple number can not be zero!");
            System.exit(1);
        }
        else{
            numerator *= m;
            denominator *=m;
        }
    }

    public Fraction reduceFraction(){
        int num = this.numerator;
        int denom = this.denominator;
    int gcd = GCD(Math.abs(num), Math.abs(denom));
    num /= gcd;
    denom /= gcd;
    if (denom<0) {num*=-1; denom*=-1;}
    return new Fraction(num, denom);
    }

    private int GCD(int a, int b){
        int c;
        if (b>a) {c=a; a=b; b=c;}

        while (b!=0){
            c = b;
            b=a%b;
            a=c;
        }
        return a;
    }

    private int LCM(int a, int b){
        int gcd = GCD(a, b);
        return a*b/gcd;
    }


    public Fraction sumFraction(Fraction other, boolean ...sign) {
        int a = this.numerator;
        int b = this.denominator; //  a/b

        int c = other.numerator;
        int d = other.denominator; // c/d
        int common_denom = LCM(b, d);

        //System.out.println(sign);

        if (sign.length == 0 || sign[0]) {
            return new Fraction(common_denom / b * a + common_denom / d * c, common_denom); // true +
        }

            return new Fraction(common_denom / b * a - common_denom / d * c, common_denom); // false -


    }

    public Fraction multiplyOrDivide(Fraction other, boolean ...multipleOrDivideStatus){
        int a = this.numerator;
        int b = this.denominator; //  a/b

        int c = other.numerator;
        int d = other.denominator; // c/d
       // System.out.println(a+" "+b+" "+c+" "+d);

        if (multipleOrDivideStatus.length ==0 || multipleOrDivideStatus[0]) {
            return new Fraction(a*c, b*d); //true *
        }
            return new Fraction(a*d, b*c); // false /
    }


    @Override
    public String toString() {
        return "numerator = " +  numerator + "; denominator " + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Fraction)) return false;

        Fraction f_obj = (Fraction) obj;

        if (f_obj.numerator * this.denominator == this.numerator* f_obj.denominator) return true;

        return false;
    }
}
