package ro.ase.acs.classes;

public class SpitalPrivat extends Spital{
    @Override
    protected void verificareSemneVitale() {
        System.out.println("Verificare semne vitale în spitalul privat");
    }

    @Override
    protected boolean semneVitaleNormale() {
        return false;
    }

    @Override
    protected void verificareProgramareMedicFamilie() {

    }

    @Override
    protected void intervenireEchipaMedici() {
        System.out.println("Intervenție echipei externe de medici în spitalul privat");
    }

    @Override
    protected void verificareDisponibilitateInternare() {
        System.out.println("Verificare disponibilitate internare în spitalul privat");
    }

    @Override
    protected boolean existaLocuriLibere() {
        return false;
    }

    @Override
    protected void cautareSptialeApropiate() {
        System.out.println("Căutare spitale apropiate în spitalul privat");
    }
}
