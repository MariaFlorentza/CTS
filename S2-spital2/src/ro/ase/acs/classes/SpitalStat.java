package ro.ase.acs.classes;

public class SpitalStat extends Spital{
    @Override
    protected void verificareSemneVitale() {
        System.out.println("Verificare semne vitale în spitalul de stat");
    }

    @Override
    protected boolean semneVitaleNormale() {
        return false;
    }

    @Override
    protected void verificareProgramareMedicFamilie() {
        System.out.println("Verificare programare medic familie în spitalul de stat");
    }

    @Override
    protected void intervenireEchipaMedici() {

    }

    @Override
    protected void verificareDisponibilitateInternare() {
        System.out.println("Verificare disponibilitate internare în spitalul de stat");

    }

    @Override
    protected boolean existaLocuriLibere() {
        return false;
    }

    @Override
    protected void cautareSptialeApropiate() {
        System.out.println("Căutare spitale apropiate în spitalul de stat");
    }
}
