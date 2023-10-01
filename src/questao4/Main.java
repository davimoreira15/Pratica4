package questao4;

public class Main {

    public static void main(String[] args) {
        Celular celularA = new FabricanteCelularA();
        Celular celularB = new FabricanteCelularB();

        // Testando os objetos dos fabricantes
        celularA.ligar();
        celularA.usarCamera();
        celularA.controlarVolume();
        celularA.desligar();

        celularB.ligar();
        celularB.usarFoneDeOuvido();
        celularB.usarCamera();
        celularB.desligar();
    }



}
