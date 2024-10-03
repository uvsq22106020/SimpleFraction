public class Fraction {
    private int numerateur;
    private int denominateur;
    public String toString() {
        return " je suis une fraction avec comme numerateur :" + numerateur + "et comme denominateur" + denominateur;
    }    
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le denominateur ne peut pas etre nul.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
   // Constructeur avec juste le numérateur (dénominateur égal à 1)
   public Fraction(int numerateur) {
    this(numerateur, 1);
    }
    // Constructeur sans argument (numérateur égal 0 et dénominateur égal à 1)
    public Fraction() {
        this(0, 1);
    }
}
