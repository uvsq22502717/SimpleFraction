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

    // Double
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    // Addition
    public Fraction add(Fraction other) {
        // addition : a/b + c/d = (a*d + b*c) / (b*d)
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    
    // Egqlite
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;           
        if (obj == null) return false;         
        if (!(obj instanceof Fraction)) return false; 

        Fraction other = (Fraction) obj;
        // comparison a*d == b*c
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}



