package ro.ase.acs.classes;

public abstract class Spital {
    public void preluareCazMedical() {
        verificareSemneVitale();

        if (semneVitaleNormale()) {
            verificareProgramareMedicFamilie();
        } else {
            intervenireEchipaMedici();
        }

        verificareDisponibilitateInternare();
        if(!existaLocuriLibere()){
            cautareSptialeApropiate();
        }
    }
    protected abstract void verificareSemneVitale();
    protected abstract boolean semneVitaleNormale();
    protected abstract void verificareProgramareMedicFamilie();
    protected abstract void intervenireEchipaMedici();
    protected abstract void verificareDisponibilitateInternare();
    protected abstract boolean existaLocuriLibere();
    protected abstract void cautareSptialeApropiate();
}
