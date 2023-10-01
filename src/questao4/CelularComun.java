package questao4;

abstract class CelularComun implements Celular{


    boolean enviarMensagem;
    boolean acessarInternet;
    boolean emails;
    boolean radio;
    boolean tv;
    boolean verificarSistemaArquivos;
    double preco;

    public void CelularComum(boolean enviarMensagem, boolean acessarInternet, boolean emails, boolean radio, boolean tv, boolean verificarSistemaArquivos, double preco) {
        this.enviarMensagem = enviarMensagem;
        this.acessarInternet = acessarInternet;
        this.emails = emails;
        this.radio = radio;
        this.tv = tv;
        this.verificarSistemaArquivos = verificarSistemaArquivos;
        this.preco = preco;
    }


    public CelularComun(boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, double v) {
    }
}
