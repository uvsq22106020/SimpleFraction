public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(11,7);
        Fraction fraction1 = new Fraction(2);
        Fraction fraction2 = new Fraction();

        assert fraction.toString() == "je suis une fraction avec comme numerateur :11 et comme denominateur : 7";
        assert fraction1.toString() == "je suis une fraction avec comme numerateur :2 et comme denominateur : 1";
        assert fraction2.toString() == "je suis une fraction avec comme numerateur :0 et comme denominateur : 1";
        System.out.println(fraction.toString());
        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());
        System.out.println(Fraction.UN.toString1());
        System.out.println(Fraction.ZERO.toString1());
        System.out.println("Numerateur : " + fraction.getNum());
        System.out.println("Denominateur : " + fraction.getDenom());
        System.out.println("Valeur de la fraction : "+ fraction.division());
    }
}

