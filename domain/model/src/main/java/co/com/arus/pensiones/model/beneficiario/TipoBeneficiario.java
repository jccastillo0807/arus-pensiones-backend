package co.com.arus.pensiones.model.beneficiario;

public enum TipoBeneficiario {
    HIJO("Hijo"),
    PADRE("Padre"),
    MADRE("Madre"),
    CONYUGUE("Cónyugue"),
    COMPANERO("Compañero sentimental");

    private final String descripcionTipoBeneficiario;

    TipoBeneficiario(String descripcionTipoBeneficiario) {
        this.descripcionTipoBeneficiario = descripcionTipoBeneficiario;
    }

    public String getDescripcionTipoBeneficiario() {
        return descripcionTipoBeneficiario;
    }
}
