package questao1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ContaPoupanca extends Conta{

    //conta poupanca é filha de conta


public void imprimeExtrato(){
    System.out.println("### Extrato da conta ###");

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date =  new Date();
    System.out.println("Saldo: "+this.getSaldo());
    System.out.println("Data: "+sdf.format(date));

}


}
