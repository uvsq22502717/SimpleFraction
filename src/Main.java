import java.math.BigDecimal;

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

        // tester egalite
        Fraction f6 = new Fraction(2, 4);
        Fraction f7 = new Fraction(1, 2);

        assert f6.equals(f7); // 2/4 == 1/2
        assert !f6.equals(new Fraction(1, 3)); // 2/4 != 1/3

        System.out.println("Test d'égalité des fractions réussi !");

        // tester comparison
        Fraction f8 = new Fraction(1, 2);
        Fraction f9 = new Fraction(3, 4);
        Fraction f10 = new Fraction(1, 2);

        // comparer f1 et f2
        assert f8.compareTo(f9) < 0;  // 1/2 < 3/4
        assert f9.compareTo(f8) > 0;  // 3/4 > 1/2
        assert f8.compareTo(f10) == 0; // 1/2 == 1/2

        System.out.println("Comparaison naturelle testée avec succès !");

        // Number extension
        Number aNumber = BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);

        // tester la compatibilité Number
        assert Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;

        System.out.println("Test avec Number réussi !");

    }
}




