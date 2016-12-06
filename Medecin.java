import java.util.Set;
import java.util.HashSet;

public class Medecin {
   /**
    * <pre>
    *           1..1     1..*
    * Medecin ------------------------- Accueil
    *           medecin        &lt;       accueil
    * </pre>
    */
   private Set<Accueil> accueil;
   
   public Set<Accueil> getAccueil() {
      if (this.accueil == null) {
         this.accueil = new HashSet<Accueil>();
      }
      return this.accueil;
   }
   
   public boolean modifierDossier(Dossier Dossier1) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
