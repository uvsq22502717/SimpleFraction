public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);  // 1/2
        Fraction f2 = new Fraction(-3, 6); // -1/2

        // Test toString
        Fraction fTest = new Fraction(1, 2);
        assert fTest.toString().equals("Je suis une fraction.");

        // Arithmetic
        assert f1.add(f2).equals(new Fraction(0, 1));
        assert f1.subtract(f2).equals(new Fraction(1, 1));
        assert f1.multiply(f2).equals(new Fraction(-1, 4));
        assert f1.divide(f2).equals(new Fraction(-1, 1));

        // Power
        Fraction f3 = new Fraction(2, 3);
        assert f3.pow(2).equals(new Fraction(4, 9));
        assert f3.pow(-1).equals(new Fraction(3, 2));
        assert f3.pow(0).equals(new Fraction(1, 1));

        // Comparison
        assert f1.compareTo(f2) > 0;

        System.out.println("All tests passed!");
    }
}
