public class Fraction extends Number implements Comparable<Fraction>{
    private int numerateur;
    private int denominateur;
    public String toString() {
        return " je suis une fraction avec comme numerateur :" + numerateur + "et comme denominateur :" + denominateur;
    }    

    public String toString1(){
        return "Je suis une constante avec comme numerateur: " + numerateur + " et denominateur: " + denominateur;
    }
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le denominateur ne peut pas etre nul.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        // Réduction lors de la création de la fraction
        int gcd = gcd(numerateur, denominateur);
        this.numerateur = numerateur / gcd;
        this.denominateur = denominateur / gcd;
    }
   // Constructeur avec juste le numérateur (dénominateur égal à 1)
   public Fraction(int numerateur) {
    this(numerateur, 1);
    }
    // Constructeur sans argument (numérateur égal 0 et dénominateur égal à 1)
    public Fraction() {
        this(0, 1);
    }
    public static final Fraction UN = new Fraction(1,1);
    public static final Fraction ZERO = new Fraction(0,1);

    // Méthode pour additionner deux fractions
    public Fraction add(Fraction other) {
        int newNumerateur = this.numerateur * other.denominateur + other.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * other.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }    

    public int getNum(){
        return numerateur;
    }
    public int getDenom(){
        return denominateur;
    }
    public double division(){
        return (double) numerateur/denominateur;
    }
     // Surcharge de la méthode equals
     @Override
     public boolean equals(Object obj) {
         if (this == obj) {
             return true; // Vérifie si les références sont les mêmes
         }
         if (!(obj instanceof Fraction)) {
             return false; // Vérifie si l'objet est une instance de Fraction
         }
         Fraction other = (Fraction) obj;
         return this.numerateur == other.numerateur && this.denominateur == other.denominateur;
    }
    public int compareTo(Fraction other) {
        // Compare a/b avec c/d en utilisant le produit croisé
        return Integer.compare(this.numerateur * other.denominateur, other.numerateur * this.denominateur);
    }
 
     // Calcul du PGCD
     private int gcd(int a, int b) {
         while (b != 0) {
             int temp = b;
             b = a % b;
             a = temp;
         }
         return Math.abs(a); // Retourne la valeur absolue pour gérer les numérateurs négatifs
    }
    // Implémentation des méthodes de Number
    @Override
    public int intValue() {
        return (int) division(); // Conversion en entier
    }

    @Override
    public long longValue() {
        return (long) division(); // Conversion en long
    }

    @Override
    public float floatValue() {
        return (float) division(); // Conversion en float
    }

    @Override
    public double doubleValue() {
        return division(); // Conversion en double
    }


    @Override
    public short shortValue() {
        return (short) intValue(); // Conversion en short
    }
    
 }
  
