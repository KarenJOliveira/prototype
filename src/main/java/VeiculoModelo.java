public class VeiculoModelo implements Cloneable {

    private String nomeModelo;
    private String fabricante;
    private EspecificacaoMotor motor;
    private int anoBase;

    public VeiculoModelo(String nomeModelo, String fabricante, EspecificacaoMotor motor, int anoBase) {
        this.nomeModelo = nomeModelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.anoBase = anoBase;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public EspecificacaoMotor getMotor() {
        return motor;
    }

    public void setMotor(EspecificacaoMotor motor) {
        this.motor = motor;
    }

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    @Override
    public VeiculoModelo clone() throws CloneNotSupportedException {
        VeiculoModelo clone = (VeiculoModelo) super.clone();
        clone.motor = (EspecificacaoMotor) clone.motor.clone();  // deep clone
        return clone;
    }

    @Override
    public String toString() {
        return "VeiculoModelo{" +
                "nomeModelo='" + nomeModelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", motor=" + motor +
                ", anoBase=" + anoBase +
                '}';
    }
}

