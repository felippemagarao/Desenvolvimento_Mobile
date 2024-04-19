package control;

public class CalculadoraIMC {

    public String calcularImc(double altura, double peso, int idade, String sexo) {

        double imc = peso / Math.pow(altura,2);

        if (idade >= 65) {
            if (sexo.equals("masculino")){
                if (imc <= 21.9) {
                    return "Baixo peso";
                } else if ( imc >= 22 && imc <= 27) {
                    return "Peso normal";
                } else if (imc >= 27.1 && imc <= 30) {
                    return "Sobrepeso";
                } else if (imc >= 30.1 && imc <= 35) {
                    return "Obesidade grau I";
                } else if (imc >= 35.1 && imc <= 39.9) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else if (sexo.equals("feminino")) {
                if (imc <= 21.9) {
                    return "Baixo peso";
                } else if ( imc > 21.9 && imc <= 27) {
                    return "Peso normal";
                } else if (imc > 27 && imc <= 32) {
                    return "Sobrepeso";
                } else if (imc > 32 && imc <= 37) {
                    return "Obesidade grau I";
                } else if (imc > 37 && imc <= 41.9) {
                    return "Obesidade grau II";
                } else {
                    return "Obesidade grau III (obesidade mórbida)";
                }
            } else {
                return "Err";
            }
        } else if (idade >= 20) {
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if ( imc >= 16 && imc < 17) {
                return "Baixo peso grave";
            } else if (imc > 17 && imc < 18.5) {
                return "Baixo peso";
            } else if (imc >= 18.5 && imc <= 25) {
                return "Peso normal";
            } else if (imc > 25 && imc <= 30) {
                return "Sobrepeso";
            } else if (imc > 30 && imc < 35) {
                return "Obesidade grau I";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            if (sexo.equals("masculino")){
                if (idade == 2 && imc <= 14.7) {
                    return "Baixo peso";
                } else if (idade == 2 && imc > 14.7 && imc <= 18.2) {
                    return "Peso normal";
                } else if (idade == 2 && imc >= 18.2 && imc <= 19.2) {
                    return "Sobrepeso";
                } else if (idade == 2 && imc > 19.2){
                    return "Obesidade";
                }

                else if (idade == 4 && imc <= 14) {
                    return "Baixo peso";
                } else if (idade == 4 && imc > 14 && imc <= 16.9) {
                    return "Peso normal";
                } else if (idade == 4 && imc > 16.9 && imc <= 17.8) {
                    return "Sobrepeso";
                } else if (idade == 4 && imc > 17.8){
                    return "Obesidade";
                }

                else if (idade == 6 && imc <= 13.8) {
                    return "Baixo peso";
                } else if (idade == 6 && imc > 13.8 && imc <= 17) {
                    return "Peso normal";
                } else if (idade == 6 && imc > 17 && imc <= 18.3) {
                    return "Sobrepeso";
                } else if (idade == 6 && imc > 18.3){
                    return "Obesidade";
                }

                else if (idade == 8 && imc <= 13.8) {
                    return "Baixo peso";
                } else if (idade == 8 && imc > 13.8 && imc <= 17.8) {
                    return "Peso normal";
                } else if (idade == 8 && imc > 17.8 && imc <= 20) {
                    return "Sobrepeso";
                } else if (idade == 8 && imc > 20){
                    return "Obesidade";
                }

                else if (idade == 10 && imc <= 14.2) {
                    return "Baixo peso";
                } else if (idade == 10 && imc > 14.2 && imc <= 19.2) {
                    return "Peso normal";
                } else if (idade == 10 && imc > 19.2 && imc <= 22) {
                    return "Sobrepeso";
                } else if (idade == 10 && imc > 22){
                    return "Obesidade";
                }

                else if (idade == 12 && imc <= 15) {
                    return "Baixo peso";
                } else if (idade == 12 && imc > 15 && imc <= 21) {
                    return "Peso normal";
                } else if (idade == 12 && imc > 21 && imc <= 24) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }

            } else if (sexo.equals("feminino")) {
                if (idade == 2 && imc <= 14.2) {
                    return "Baixo peso";
                } else if (idade == 2 && imc >= 14.2 && imc <= 18) {
                    return "Peso normal";
                } else if (idade == 2 && imc >= 18 && imc <= 19.1) {
                    return "Sobrepeso";
                } else if (idade == 2 && imc > 19.1){
                    return "Obesidade";
                }

                else if (idade == 4 && imc <= 13.8) {
                    return "Baixo peso";
                } else if (idade == 4 && imc > 13.8 && imc <= 16.8) {
                    return "Peso normal";
                } else if (idade == 4 && imc > 16.8 && imc <= 18) {
                    return "Sobrepeso";
                } else if (idade == 4 && imc > 18){
                    return "Obesidade";
                }

                else if (idade == 6 && imc <= 13.4) {
                    return "Baixo peso";
                } else if (idade == 6 && imc > 13.4 && imc <= 17.1) {
                    return "Peso normal";//uibiubuyb
                } else if (idade == 6 && imc > 17.1 && imc <= 18.7) {
                    return "Sobrepeso";
                } else if (idade == 6 && imc > 18.7){
                    return "Obesidade";
                }

                else if (idade == 8 && imc <= 13.6) {
                    return "Baixo peso";
                } else if (idade == 8 && imc > 13.6 && imc <= 18.2) {
                    return "Peso normal";
                } else if (idade == 8 && imc > 18.2 && imc <= 20.6) {
                    return "Sobrepeso";
                } else if (idade == 8 && imc > 20.6){
                    return "Obesidade";
                }

                else if (idade == 10 && imc <= 14.1) {
                    return "Baixo peso";
                } else if (idade == 10 && imc > 14.1 && imc <= 20) {
                    return "Peso normal";
                } else if (idade == 10 && imc > 20 && imc <= 23) {
                    return "Sobrepeso";
                } else if (idade == 10 && imc > 23){
                    return "Obesidade";
                }

                else if (idade == 12 && imc <= 14.9) {
                    return "Baixo peso";
                } else if (idade == 12 && imc > 14.9 && imc <= 21.8) {
                    return "Peso normal";
                } else if (idade == 12 && imc > 21.8 && imc <= 25) {
                    return "Sobrepeso";
                } else {
                    return "Obesidade";
                }

            } else {
                return "Err";
            }
        }
    }
}