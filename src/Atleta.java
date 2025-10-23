import java.util.Scanner;
public class Atleta implements Runnable{
    int numero;
    String nome = "Alexander";
    double tempo = 0;
    double metri = 0;
    final double LUNGHEZZAGARA = 400;

    public Atleta run(int pNumero, String pNome) {
        numero= pNumero;
        nome= pNome;

    }


    @Override
    public void run(){
        while(metri<LUNGHEZZAGARA) {
        metri+= metripercorsi.nextdouble(bound:10);
        System.out.println("metri percorsi: ", metri);

            metri=metri+10;
        tempo=tempo+1;
        }
    }
}
