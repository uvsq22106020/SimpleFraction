public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(11,7);
        Fraction fraction1 = new Fraction(2);
        Fraction fraction2 = new Fraction();
        Fraction result = fraction1.add(fraction2);

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
        System.out.println(fraction1 + " + " + fraction2 + " = " + result);
        System.out.println(fraction1 + " est égal à " + fraction2 + " : " + fraction1.equals(fraction2)); 
        System.out.println(fraction1 + " est égal à " + fraction + " : " + fraction1.equals(fraction)); 
        System.out.println(fraction + " est égal à " + fraction2 + " : " + fraction.equals(fraction2)); 
        System.out.println(fraction1 + " est inférieur à " + fraction + " : " + (fraction1.compareTo(fraction) < 0)); 
        System.out.println(fraction1 + " est supérieur à " + fraction2 + " : " + (fraction1.compareTo(fraction2) > 0));
        System.out.println("Valeur entière : " + fraction.intValue());
        System.out.println("Valeur longue : " + fraction.longValue());
        System.out.println("Valeur flottante : " + fraction.floatValue());
        System.out.println("Valeur double : " + fraction.doubleValue());
        System.out.println("Valeur courte : " + fraction.shortValue());
         // Création d'une instance de BigDecimal
         Number aNumber = java.math.BigDecimal.ONE; // Représente 1.0
         Number anotherNumber = new Fraction(1, 2); // Représente 0.5
 
         // Vérification de l'assertion
         assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
 
         // Si l'assertion passe, afficher un message de succès
         System.out.println("L'assertion a réussi, la somme est correcte : " + 
                            (aNumber.doubleValue() + anotherNumber.doubleValue()));
    }

}

