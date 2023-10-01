package questao3;

public class DistribuicaoAlimento extends Projeto {




    private String descAlimento;
    private float qtde;


    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }




    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if (getDataFim() == "")
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "nome : " + getNomeProjeto() + "\n Descrição: " + getDescricao() + "\n Data incio: " +  getDataInicio()
                + "\nData fim: " + getDataFim() + "\n Descrição alimento: " + getDescAlimento() + "\n Quantidade: " + getQtde();
    }
}
