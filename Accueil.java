import java.util.Set;
import java.util.HashSet;

public class Accueil {
   /**
    * <pre>
    *           1..1     1..*
    * Accueil ------------------------- Dossier
    *           accueil        &gt;       dossier
    * </pre>
    */
   private Set<Dossier> dossier;
   
   public Set<Dossier> getDossier() {
      if (this.dossier == null) {
         this.dossier = new HashSet<Dossier>();
      }
      return this.dossier;
   }
   
   /**
    * <pre>
    *           1..*     1..1
    * Accueil ------------------------- Medecin
    *           accueil        &gt;       medecin
    * </pre>
    */
   private Medecin medecin;
   
   public void setMedecin(Medecin value) {
      this.medecin = value;
   }
   
   public Medecin getMedecin() {
      return this.medecin;
   }
   
   public boolean consultation(Testeur t1) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Dossier retournerDossier(String/*No type specified*/ Dossier) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
