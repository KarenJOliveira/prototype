import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoModeloTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        VeiculoModelo modelo = new VeiculoModelo(
                "HB20",
                "Hyundai",
                new EspecificacaoMotor(1600, 120),
                2024
        );

        VeiculoModelo modeloClone = modelo.clone();
        modeloClone.setNomeModelo("HB20s");
        modeloClone.setAnoBase(2025);
        modeloClone.getMotor().setPotencia(130);

        assertEquals(
                "VeiculoModelo{nomeModelo='HB20', fabricante='Hyundai', motor=EspecificacaoMotor{cilindrada=1600, potencia=120}, anoBase=2024}",
                modelo.toString()
        );

        assertEquals(
                "VeiculoModelo{nomeModelo='HB20s', fabricante='Hyundai', motor=EspecificacaoMotor{cilindrada=1600, potencia=130}, anoBase=2025}",
                modeloClone.toString()
        );
    }
}
