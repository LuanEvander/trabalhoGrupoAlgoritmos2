public class EntrevistadoVetor {
    public Entrevistado[] entrevistadoRelatorio = new Entrevistado[300];
    private int qtdEntrevistados = 0, next = 0;

    public void setEntrevistadoVetor(Entrevistado[] entrevistadoRelatorio) {
        this.entrevistadoRelatorio = entrevistadoRelatorio;
    }

    public void add(Entrevistado entrevistado) {
        entrevistadoRelatorio[next] = entrevistado;
        next++;
    }

    public String stats1() {
        String str = "Total de entrevistados = ";
        
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                qtdEntrevistados++;
            }
        }
        return str + qtdEntrevistados;
    }

    public String stats2() {
        float sexoMasc = 0, sexoFem = 0, sexoOutro = 0;
        float porcentoMasc = 0, porcentoFem = 0, porcentoOutro = 0;
        
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                switch(entrevistadoRelatorio[i].getGenero()){
                    case 'm':
                        sexoMasc++;
                    break;
    
                    case 'f':
                        sexoFem++;
                    break;
    
                    case 'o':
                        sexoOutro++;
                    break;
                }
            }
        }
        porcentoMasc = (sexoMasc * 100) / entrevistadoRelatorio.length;
        porcentoFem = (sexoFem * 100) / entrevistadoRelatorio.length;
        porcentoOutro = (sexoOutro * 100) / entrevistadoRelatorio.length;

        String str = "\nPercentual de entrevistados por sexo:\n";
        String str1 = "Percentual de entrevistados identificados como masculino: " + porcentoMasc + "%\n";
        String str2 = "Percentual de entrevistados identificados como feminino: " + porcentoFem + "%\n";
        String str3 = "Percentual de entrevistados identificados como outro: " + porcentoOutro + "%";

        return str + str1 + str2 + str3;
    }
    
    public String stats3() {
    int ate15 = 0, entre16e29 = 0, entre30e59 = 0, acima60 = 0;
    for (int i = 0; i < entrevistadoRelatorio.length; i++) {
        if (entrevistadoRelatorio[i] != null) {
            switch (entrevistadoRelatorio[i].getIdade()) {
                case "Até 15 anos":
                    ate15++;
                    break;

                case "De 16 a 29 anos":
                    entre16e29++;
                    break;

                case "De 30 a 59 anos":
                    entre30e59++;
                    break;

                case "Acima de 60 anos":
                    acima60++;
                    break;
            }
        }
    }
    String str = "\nNúmero de entrevistados por faixa etária:\n";
    String str1 = "Até 15 anos: " + ate15 + "\n";
    String str2 = "Entre 16 e 29 anos: " + entre16e29 + "\n";
    String str3 = "Entre 30 e 59 anos: " + entre30e59 + "\n";
    String str4 = "Acima de 60 anos: " + acima60;

    return str + str1 + str2 + str3 + str4;
    }

    public String stats4() {
        float fundInc = 0, fundCom = 0, medInc = 0, medCom = 0, supInc = 0, supCom = 0;
        float porcentoFundInc = 0, porcentoFundCom = 0, porcentoMedInc = 0, porcentoMedCom = 0,
                porcentoSupInc = 0, porcentoSupCom = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                switch (entrevistadoRelatorio[i].getEscolaridade()) {
                    case "Ensino fundamental incompleto":
                        fundInc++;
                        break;

                    case "Ensino fundamental completo":
                        fundCom++;
                        break;

                    case "Ensino médio incompleto":
                        medInc++;
                        break;

                    case "Ensino médio completo":
                        medCom++;
                        break;

                    case "Ensino superior incompleto":
                        supInc++;
                        break;

                    case "Ensino superior completo":
                        supCom++;
                        break;
                }
            }
        }
        porcentoFundInc = (fundInc * 100) / entrevistadoRelatorio.length;
        porcentoFundCom = (fundCom * 100) / entrevistadoRelatorio.length;
        porcentoMedInc = (medInc * 100) / entrevistadoRelatorio.length;
        porcentoMedCom = (medCom * 100) / entrevistadoRelatorio.length;
        porcentoSupInc = (supInc * 100) / entrevistadoRelatorio.length;
        porcentoSupCom = (supCom * 100) / entrevistadoRelatorio.length;

        String str = "\nPercentual de entrevistados por escolaridade:\n";
        String str1 = "Ensino fundamental incompleto: " + porcentoFundInc + "%\n";
        String str2 = "Ensino fundamental completo: " + porcentoFundCom + "%\n";
        String str3 = "Ensino médio incompleto: " + porcentoMedInc + "%\n";
        String str4 = "Ensino médio completo: " + porcentoMedCom + "%\n";
        String str5 = "Ensino superior incompleto: " + porcentoSupInc + "%\n";
        String str6 = "Ensino superior completo: " + porcentoSupCom + "%";

        return str + str1 + str2 + str3 + str4 + str5 + str6;
    }

    public String stats5() {
        int supCom = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino superior completo")) {
                    supCom++;
                }
            }
        }
        String str = "\nEntrevistados que possuem o ensino superior completo: " + supCom;

        return str;
    }

    public String stats6() {
        float ate15 = 0, entre16e29 = 0, entre30e59 = 0, acima60 = 0;
        String maior;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getTecnologia().equals("Smartphone")) {
                    switch (entrevistadoRelatorio[i].getIdade()) {
                        case "Até 15 anos":
                            ate15++;
                            break;

                        case "De 16 a 29 anos":
                            entre16e29++;
                            break;

                        case "De 30 a 59 anos":
                            entre30e59++;
                            break;

                        case "Acima de 60 anos":
                            acima60++;
                            break;
                    }
                }
            }
        }

        if (ate15 > entre16e29) {
            if (ate15 > entre30e59) {
                if (ate15 > acima60) {
                    maior = "Até 15 anos";
                } else {
                    maior = "Acima de 60 anos";
                }
            } else if (entre30e59 > acima60) {
                maior = "De 30 a 59 anos";
            } else {
                maior = "Acima de 60 anos";
            }
        } else if (entre16e29 > entre30e59) {
            maior = "De 16 a 29 anos";
        } else {
            maior = "De 30 a 59 anos";
        }

        String str = "\n" + maior + " é a faixa etária que mais utiliza Smartphone.";

        return str;
    }

    public String stats7() {
        int pc = 0, note = 0, smartphone = 0, tablet = 0, nenhuma = 0;
        String menor;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getIdade().equals("Até 15 anos")) {
                    switch (entrevistadoRelatorio[i].getTecnologia()) {
                        case "Computador Pessoal":
                            pc++;
                            break;

                        case "Notebook ou Netbook":
                            note++;
                            break;

                        case "Smartphone":
                            smartphone++;
                            break;

                        case "Tablet":
                            tablet++;
                            break;

                        case "Nenhuma":
                            nenhuma++;
                            break;
                    }
                }
            }
        }

        if (pc < note) {
            if (pc < smartphone) {
                if (pc < tablet) {
                    if (pc < nenhuma) {
                        menor = "Computador Pessoal";
                    } else {
                        menor = "Nenhuma";
                    }
                } else if (tablet < nenhuma) {
                    menor = "Tablet";
                } else {
                    menor = "Nenhuma";
                }
            } else if (smartphone < tablet) {
                menor = "Smartphone";
            } else {
                menor = "Tablet";
            }
        } else if (note < tablet) {
            menor = "Notebook ou Netbook";
        } else {
            menor = "Tablet";
        }

        String str = "\n" + menor + " é tecnologia menos utilizada pelos entrevistados com idade até 15 anos.";

        return str;
    }

    public String stats8() {
        int alimentacao = 0, cultura = 0, educacao = 0, emprego = 0, lazer = 0, saude = 0,
                seguranca = 0, transporte = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                switch (entrevistadoRelatorio[i].getPrioridade()) {
                    case "Alimentação":
                        alimentacao++;
                        break;

                    case "Cultura":
                        cultura++;
                        break;

                    case "Educação":
                        educacao++;
                        break;

                    case "Emprego":
                        emprego++;
                        break;

                    case "Lazer":
                        lazer++;
                        break;

                    case "Saúde":
                        saude++;
                        break;

                    case "Segurança":
                        seguranca++;
                        break;

                    case "Transporte":
                        transporte++;
                        break;
                }
            }
        }
        String str = "\nNúmero de entrevistados por área prioritária:\n";
        String str1 = "Alimentação: " + alimentacao + "\n";
        String str2 = "Cultura: " + cultura + "\n";
        String str3 = "Educação: " + educacao + "\n";
        String str4 = "Emprego: " + emprego + "\n";
        String str5 = "Lazer: " + lazer + "\n";
        String str6 = "Saúde: " + saude + "\n";
        String str7 = "Segurança: " + seguranca + "\n";
        String str8 = "Transporte: " + transporte + "\n";

        return str + str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8;
    }

    public String report() {
        return stats1() + "\n" + stats2() + "\n" + stats3() + "\n" + stats4() + "\n" + stats5() + "\n" + stats6() + "\n" + stats7() + "\n" + stats8();
    }
}
