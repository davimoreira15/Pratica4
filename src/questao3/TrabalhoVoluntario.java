package questao3;

public class TrabalhoVoluntario extends Projeto{

    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFIm, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFIm);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return this.tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return this.duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {
        return this.getDuracaoTrabalho() > 2;
    }

    public String imprimeProjeto() {
        String var10000 = this.getNomeProjeto();
        return "Nome: " + var10000 + "\n Descrição: " + this.getDescricao() + "\n Data inicio: " + this.getDataInicio() + "\n Data fim: " + this.getDataFim() + "\n Tipo Trabalho: " + this.getTipoTrabalho() + "\n Duração Trabalho: " + this.getDuracaoTrabalho();
    }



}
