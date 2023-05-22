package ro.ase.acs.flyweight;

public class Reteta {
    private String pacient;
    private String diagnosticPacient;
    private InformatiiSanatateGenerale informatiiSanatateGenerale;

    public Reteta(String pacient, String diagnosticPacient, InformatiiSanatateGenerale informatiiSanatateGenerale) {
        this.pacient = pacient;
        this.diagnosticPacient = diagnosticPacient;
        this.informatiiSanatateGenerale = informatiiSanatateGenerale;
    }

    public void printeazaReteta() {
        System.out.println("Pacient" + pacient);
        System.out.println("Diagnostic" + diagnosticPacient);
        System.out.println("Recomandari de sanatate" + informatiiSanatateGenerale);
    }
}
