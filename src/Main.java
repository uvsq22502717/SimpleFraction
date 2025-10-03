public class Main {
    public static void main(String[] args) {
        // constructeur (numérateur + dénominateur)
        Fraction f1 = new Fraction(3, 4);
        assert f1.toString().equals("3/4");

        // constructeur (juste numérateur)
        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("5/1");

        // constructeur sans argument
        Fraction f3 = new Fraction();
        assert f3.toString().equals("0/1");

        System.out.println("Tous les tests de constructeurs sont reussi !");
    }
}



