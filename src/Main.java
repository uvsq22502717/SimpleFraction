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

        // tester les constantes
        assert Fraction.ZERO.toString().equals("0/1");
        assert Fraction.UN.toString().equals("1/1");

        System.out.println("Constantes ZERO et UN testées avec succès !");

        // tester les getters (corrigé → f1)
        assert f1.getNumerator() == 3;
        assert f1.getDenominator() == 4;

        System.out.println("Getters testés avec succès !");

        // tester doubleValue
        assert f1.doubleValue() == 0.75;


        System.out.println("doubleValue() testée avec succès !");

        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(1, 3);

        Fraction sum = f4.add(f5);

        // 1/2 + 1/3 = 3/6 + 2/6 = 5/6
        assert sum.getNumerator() == 5;
        assert sum.getDenominator() == 6;

        System.out.println("Addition testée avec succès !");
        System.out.println(f4 + " + " + f5 + " = " + sum);

        Fraction f6 = new Fraction(2, 4);
        Fraction f7 = new Fraction(1, 2);

        assert f6.equals(f7); // 2/4 == 1/2
        assert !f6.equals(new Fraction(1, 3)); // 2/4 != 1/3

        System.out.println("Test d'égalité des fractions réussi !");

    }
}




