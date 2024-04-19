package tests;

import control.CalculadoraIMC;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadoraIMC {

    CalculadoraIMC calc;

    @Before
    public void setup() {
        calc = new CalculadoraIMC();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    // menino 2 anos

    @Test
    public void meninoDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.80, 9.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.82, 10.0, 2,"masculino"));
    }


    @Test
    public void meninoDoisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.87, 14.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"masculino"));
    }


    // menino 4 anos

    @Test
    public void meninoQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.98, 13.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.96, 13.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.01, 18.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 19.0, 4,"masculino"));
    }


    // menino 6 anos

    @Test
    public void meninoSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.08, 16.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.13, 18.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.12, 23.0, 6,"masculino"));
    }

    // menino 8 anos

    @Test
    public void meninoOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 19.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.24, 22.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 26.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.27, 33.0, 8,"masculino"));
    }

    // menino 10 anos

    @Test
    public void meninoDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.33, 25.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 25.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 37.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.40, 44.0, 10,"masculino"));
    }

    // menino 12 anos

    @Test
    public void meninoDozeAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.42, 30.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.44, 32.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.49, 47.0, 12,"masculino"));
    }

    @Test
    public void meninoDozeAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.47, 53.0, 12,"masculino"));
    }

    // menina 2 anos

    @Test
    public void meninaDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.81, 9.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.82, 10.0, 2,"feminino"));
    }


    @Test
    public void meninaDoisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.87, 14.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"feminino"));
    }


    // menina 4 anos

    @Test
    public void meninaQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.98, 13.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.96, 13.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.02, 18.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 20.0, 4,"feminino"));
    }


    // menina 6 anos

    @Test
    public void meninaSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.07, 15.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.09, 16.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.12, 24.0, 6,"feminino"));
    }

    // menina 8 anos

    @Test
    public void meninaOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 19.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.25, 22.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 27.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.26, 33.0, 8,"feminino"));
    }

    // menina 10 anos

    @Test
    public void meninaDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.32, 24.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 25.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 39.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.40, 46.0, 10,"feminino"));
    }

    // menina 12 anos

    @Test
    public void meninaDozeAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.42, 30.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosPesoNormal() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.44, 31.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosSobrepeso() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.49, 49.0, 12,"feminino"));
    }

    @Test
    public void meninaDozeAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.47, 55.0, 12,"feminino"));
    }

    // adulto

    @Test
    public void adultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.65, 44.0, 25,"feminino"));
    }

    @Test
    public void adultoBaixoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.65, 46.0, 38,"feminino"));
    }

    @Test
    public void adultoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.76, 53.0, 54,"masculino"));
    }

    @Test
    public void adultoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.76, 57.0, 30,"masculino"));
    }

    @Test
    public void adultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.63, 50.0, 22,"feminino"));
    }

    @Test
    public void adultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.71, 73.0, 44,"masculino"));
    }

    @Test
    public void adultoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.69, 72.0, 39,"feminino"));
    }

    @Test
    public void adultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.80, 97.0, 33,"masculino"));
    }

    @Test
    public void adultoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.79, 97.0, 55,"masculino"));
    }

    @Test
    public void adultoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.81, 114.0, 26,"feminino"));
    }

    @Test
    public void adultoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.77, 110.0, 20,"feminino"));
    }

    @Test
    public void adultoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.89, 142.0, 31,"masculino"));
    }

    @Test
    public void adultoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.91, 146.0, 56,"feminino"));
    }

    // idoso

    @Test
    public void idosoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.73, 65.0, 66,"masculino"));
    }

    @Test
    public void idosoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.69, 63.0, 67,"masculino"));
    }

    @Test
    public void idosoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.68, 76.0, 70,"masculino"));
    }

    @Test
    public void idosoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.68, 77.0, 81,"masculino"));
    }

    @Test
    public void idosoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86.0, 63,"masculino"));
    }

    @Test
    public void idosoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 88.0, 68,"masculino"));
    }

    @Test
    public void idosoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.61, 90.0, 70,"masculino"));
    }

    @Test
    public void idosoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.72, 104.0, 65,"masculino"));
    }

    @Test
    public void idosoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.72, 115.0, 69,"masculino"));
    }

    @Test
    public void idosoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.71, 117.0, 68,"masculino"));
    }

    // idosa

    @Test
    public void idosaBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.67, 61.0, 69,"feminino"));
    }

    @Test
    public void idosaPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 64.0, 80,"feminino"));
    }

    @Test
    public void idosaPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.60, 69.0, 74,"feminino"));
    }

    @Test
    public void idosaSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.62, 71.0, 70,"feminino"));
    }

    @Test
    public void idosaSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.65, 87.0, 91,"feminino"));
    }

    @Test
    public void idosaObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.59, 81.0, 88,"feminino"));
    }

    @Test
    public void idosaObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.62, 97.0, 70,"feminino"));
    }

    @Test
    public void idosaObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.60, 95.0, 77,"feminino"));
    }

    @Test
    public void idosaObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.60, 107.0, 65,"feminino"));
    }

    @Test
    public void idosaObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.57, 104.0, 88,"feminino"));
    }
}