public class Fraction {
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
    public int getNum(){
        return numerateur;
    }
    public int getDenom(){
        return denominateur;
    }
}   
