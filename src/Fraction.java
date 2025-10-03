public class Fraction {
    int numerator;      // numérateur
    int denominator;    // dénominateur

    // constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // constructeur avec numérateur et dénominateur
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    // constructeur avec juste le numérateur (dénominateur = 1)
    public Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    // constructeur sans argument (0/1)
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}



