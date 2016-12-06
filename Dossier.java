
public class Dossier {
   private int numero;
   
   public void setNumero(int value) {
      this.numero = value;
   }
   
   public int getNumero() {
      return this.numero;
   }
   
   private String nom;
   
   public void setNom(String value) {
      this.nom = value;
   }
   
   public String getNom() {
      return this.nom;
   }
   
   private String prenom;
   
   public void setPrenom(String value) {
      this.prenom = value;
   }
   
   public String getPrenom() {
      return this.prenom;
   }
   
   private boolean resultat = false;
   
   public void setResultat(boolean value) {
      this.resultat = value;
   }
   
   public boolean isResultat() {
      return this.resultat;
   }
   
   /**
    * <pre>
    *           1..*     1..1
    * Dossier ------------------------- Accueil
    *           dossier        &lt;       accueil
    * </pre>
    */
   private Accueil accueil;
   
   public void setAccueil(Accueil value) {
      this.accueil = value;
   }
   
   public Accueil getAccueil() {
      return this.accueil;
   }
   
   }
