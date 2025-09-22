public class Fraction implements Comparable<Fraction> {
    int numerator;
    int denominator;

    // Constructor
    public Fraction(int num, int den) {
        if (den == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        if (den < 0) { num = -num; den = -den; } // make denominator positive
        int g = gcd(Math.abs(num), den);
        numerator = num / g;
        denominator = den / g;
    }

    // Addition
    public Fraction add(Fraction f) {
        return new Fraction(numerator * f.denominator + f.numerator * denominator, denominator * f.denominator);
    }

    // Subtraction
    public Fraction subtract(Fraction f) {
        return new Fraction(numerator * f.denominator - f.numerator * denominator, denominator * f.denominator);
    }

    // Multiplication
    public Fraction multiply(Fraction f) {
        return new Fraction(numerator * f.numerator, denominator * f.denominator);
    }

    // Division
    public Fraction divide(Fraction f) {
        if (f.numerator == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return new Fraction(numerator * f.denominator, denominator * f.numerator);
    }

    // Power
    public Fraction pow(int n) {
        if (n == 0) return new Fraction(1,1);
        int numPow = (int)Math.pow(numerator, Math.abs(n));
        int denPow = (int)Math.pow(denominator, Math.abs(n));
        if (n > 0) return new Fraction(numPow, denPow);
        else return new Fraction(denPow, numPow);
    }

    // Comparison
    public int compareTo(Fraction f) {
        return numerator * f.denominator - f.numerator * denominator;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Fraction)) return false;
        Fraction f = (Fraction)o;
        return numerator == f.numerator && denominator == f.denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // Helper: GCD
    private int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }
}
