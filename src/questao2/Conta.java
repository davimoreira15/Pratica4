package questao2;

public interface Conta {
    //interface nao pode criar objetos nela
    //ela é abstrata
    //ela serve como modelo
    //pode ter metodos abstratos publicos
    //os atributos sao publicos
    //metodos que nao estao codificados
    //interface não tem construtor

    void depositar(double valor);
    void sacar (double valor);
    double getSaldo();

}
