public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        f.numerator = 3;     
        f.denominator = 4;    

        // petits tests numerator denominator
        assert f.numerator == 3;
        assert f.denominator == 4;

        System.out.println("Tests réussis !");
        System.out.println(f);
    }
}


