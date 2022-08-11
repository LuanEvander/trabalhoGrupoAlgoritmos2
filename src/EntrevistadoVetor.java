//Classe EntrevistadoVetor é feita para armazenar os dados de Entrevistado em um vetor e fazer as operações definidas no enunciado
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

    /**
     * @return Total de entrevistados:
     * recebe os dados do arquvio csv e faz a contagem de total de entrevistados.
     * @author Kauã Henrico
     */

    public String stats1() {
        String str = "Dado Nº 1 - Total de entrevistados = ";
        //Aqui é feita a contagem de total de entrevistados de uma em uma linha do arquivo csv
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                qtdEntrevistados++;
            }
        }
        //Aqui é feita a concatenação da string com o total de entrevistados
        return str + qtdEntrevistados;
    }

    /**
     * @return Total de entrevistados por gênero:
     * Faz a contagem total de entrevistados por gênero.
     * 
     */

    public String stats2() {
        float sexoMasc = 0, sexoFem = 0, sexoOutro = 0;
        float porcentoMasc = 0, porcentoFem = 0, porcentoOutro = 0;
        //Aqui é feita a contagem de total de entrevistados por gênero de uma em uma linha do arquivo csv
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                //Aqui é feita a contagem de total de entrevistados de cada sexo e adcionando 1 a cada vez que o sexo for encontrado
                if (entrevistadoRelatorio[i].getGenero() == 'm') sexoMasc++;
                if (entrevistadoRelatorio[i].getGenero() == 'f') sexoFem++;
                if (entrevistadoRelatorio[i].getGenero() == 'o') sexoOutro++;
            }
        }
        //Aqui é feita a conta para indentidicar a porcentagem de cada sexo e logo em seguida é feita a concatenação da string com o total de entrevistados por gênero
        porcentoMasc = (sexoMasc * 100) / entrevistadoRelatorio.length;
        porcentoFem = (sexoFem * 100) / entrevistadoRelatorio.length;
        porcentoOutro = (sexoOutro * 100) / entrevistadoRelatorio.length;

        String str = "\nDados Nº 2 - Percentual de entrevistados por sexo:\nPercentual de entrevistados identificados como masculino: " + porcentoMasc + "%\nPercentual de entrevistados identificados como feminino: " + porcentoFem + "%\nPercentual de entrevistados identificados como outro: " + porcentoOutro + "%";


        return str;
    }
    
    /**
     * @return Total de entrevistados por faixa etária:
     * Faz a contagem total de entrevistados por faixa etária.
     * @author Luan Evander
     */

    public String stats3() {
        int ate15 = 0, entre16e29 = 0, entre30e59 = 0, acima60 = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                    //aqui é feita a contagem de total de entrevistados de cada faixa etária e adcionando 1 a cada vez que a faixa etária for encontrada
                    if (entrevistadoRelatorio[i].getIdade().equals("Até 15 anos")) ate15++;
                    if (entrevistadoRelatorio[i].getIdade().equals("De 16 a 29 anos")) entre16e29++;
                    if (entrevistadoRelatorio[i].getIdade().equals("De 30 a 59 anos")) entre30e59++;
                    if (entrevistadoRelatorio[i].getIdade().equals("Acima de 60 anos")) acima60++;
            }
        }

        String str = "\nDados Nº 3 - Número de entrevistados por faixa etária:\nAté 15 anos: " + ate15 + "\nDe 16 e 29 anos: " + entre16e29 + "\nDe 30 e 59 anos: " + entre30e59 + "\nAcima de 60 anos: " + acima60;

        return str;
    }

    /**
     * @return Total de entrevistados por escolaridade:
     * Faz a contagem total de entrevistados por escolaridade.
     * @author Luan Evander
     */

    public String stats4() {
        float fundInc = 0, fundCom = 0, medInc = 0, medCom = 0, supInc = 0, supCom = 0;
        float porcentoFundInc = 0, porcentoFundCom = 0, porcentoMedInc = 0, porcentoMedCom = 0,
                porcentoSupInc = 0, porcentoSupCom = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino fundamental incompleto")) fundInc++;
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino fundamental completo")) fundCom++;
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino médio incompleto")) medInc++;
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino médio completo")) medCom++;
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino superior incompleto")) supInc++;
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino superior completo")) supCom++;
            }
        }
        porcentoFundInc = (fundInc * 100) / entrevistadoRelatorio.length;
        porcentoFundCom = (fundCom * 100) / entrevistadoRelatorio.length;
        porcentoMedInc = (medInc * 100) / entrevistadoRelatorio.length;
        porcentoMedCom = (medCom * 100) / entrevistadoRelatorio.length;
        porcentoSupInc = (supInc * 100) / entrevistadoRelatorio.length;
        porcentoSupCom = (supCom * 100) / entrevistadoRelatorio.length;

        String str = "\nDados Nº 4 - Percentual de entrevistados por escolaridade:\nEnsino fundamental incompleto: " + porcentoFundInc + "%\nEnsino fundamental completo: " + porcentoFundCom + "%\nEnsino médio incompleto: " + porcentoMedInc + "%\nEnsino médio completo: " + porcentoMedCom + "%\nEnsino superior incompleto: " + porcentoSupInc + "%\nEnsino superior completo: " + porcentoSupCom + "%";


        return str;
    }

    /**
     * @return Numero de entrevistados com ensino superior completo:
     * Faz a contagem total de entrevistados com ensino superior completo.
     * @author edelin Chaves
     */

    public String stats5() {
        int supCom = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getEscolaridade().equals("Ensino superior completo")) {
                    supCom++;
                }
            }
        }
        String str = "\nDado Nº 5 - Entrevistados que possuem o ensino superior completo: " + supCom;

        return str;
    }

    /**
     * @return A faixa etária que mais utiliza smartphones:
     * Faz a contagem total de entrevistados por faixa etária e retorna a faixa etária que mais utiliza smartphones.
     * @author Kauã Henrico
     */

    public String stats6() {
        float ate15 = 0, entre16e29 = 0, entre30e59 = 0, acima60 = 0;
        String maior;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getTecnologia().equals("Smartphone")) {
                    if (entrevistadoRelatorio[i].getIdade().equals("Até 15 anos") ) ate15++;
                    if (entrevistadoRelatorio[i].getIdade().equals("De 16 a 29 anos") ) entre16e29++;
                    if (entrevistadoRelatorio[i].getIdade().equals("De 30 a 59 anos") ) entre30e59++;
                    if (entrevistadoRelatorio[i].getIdade().equals("Acima de 60 anos") ) acima60++;
                }
            }
        }
        // aqui é feita a comparação de qual faixa etária possui mais entrevistados com smartphone
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

        String str = "\nDado Nº 6 - " + maior + " é a faixa etária que mais utiliza Smartphone.";

        return str;
    }

    /**
     * @return A tecnologia que é menos utilizada pelos entrevistados de até 15 anos:
     * Faz a contagem total de entrevistados por tecnologia e retorna a tecnologia que é menos utilizada pelos entrevistados de até 15 anos.
     * @author Luan Evander
     */

    public String stats7() {
        int pc = 0, note = 0, smartphone = 0, tablet = 0, nenhuma = 0;
        String menor;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getIdade().equals("Até 15 anos")) {
                    if (entrevistadoRelatorio[i].getTecnologia().equals("Computador Pessoal")) pc++;
                    if (entrevistadoRelatorio[i].getTecnologia().equals("Notebook")) note++;
                    if (entrevistadoRelatorio[i].getTecnologia().equals("Smartphone")) smartphone++;
                    if (entrevistadoRelatorio[i].getTecnologia().equals("Tablet")) tablet++;
                    if (entrevistadoRelatorio[i].getTecnologia().equals("Nenhuma")) nenhuma++;
                }
            }
        }
        // aqui é feita a comparação de qual tecnologia é menos utilizada pelos entrevistados de até 15 anos
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

        String str = "\nDado Nº 7 - " + menor + " é tecnologia menos utilizada pelos entrevistados com idade até 15 anos.";

        return str;
    }

    /**
     * @return Numero de entrevistados por área prioritária:
     * Faz a contagem total de entrevistados por área prioritária.
     * @author Luan Evander
     */

    public String stats8() {
        int alimentacao = 0, cultura = 0, educacao = 0, emprego = 0, lazer = 0, saude = 0,
                seguranca = 0, transporte = 0;
        for (int i = 0; i < entrevistadoRelatorio.length; i++) {
            if (entrevistadoRelatorio[i] != null) {
                if (entrevistadoRelatorio[i].getPrioridade().equals("Alimentação")) alimentacao++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Cultura")) cultura++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Educação")) educacao++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Emprego")) emprego++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Lazer")) lazer++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Saúde")) saude++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Segurança")) seguranca++;
                if (entrevistadoRelatorio[i].getPrioridade().equals("Transporte")) transporte++;
            }
        }
        
        String str = "\nDados Nº 8 - Número de entrevistados por área prioritária:\nAlimentação: " + alimentacao + "\nCultura: " + cultura + "\nEducação: " + educacao + "\nEmprego: " + emprego + "\nLazer: " + lazer + "\nSaúde: " + saude + "\nSegurança: " + seguranca + "\nTransporte: " + transporte + "\n";

        return str;
    }

    public String report() {
        return stats1() + "\n" + stats2() + "\n" + stats3() + "\n" + stats4() + "\n" + stats5() + "\n" + stats6() + "\n" + stats7() + "\n" + stats8();
    }
}
