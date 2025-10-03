public class Fraction {
    int numerator;
    int denominator;

    // constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // constructeur (numérateur + dénominateur)
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    // constructeur (juste numérateur)
    public Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    // constructeur sans argument
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}



