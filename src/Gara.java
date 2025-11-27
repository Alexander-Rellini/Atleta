import java.util.*;

public class Gara {

    public static void main(String[] args) {
        int MIN_LUNGH = 15;
        int MIN_PART = 2;
        int MAX_PART = 4;
        Scanner sc = new Scanner(System.in);
        int nPartecipanti;
        int lunghezzaGara;

        //file
        GestoreFile gestore = new GestoreFile("classifica.txt");
        gestore.leggiClassificaPrecedente();

        System.out.println("Benvenuto alla gara atletica");

        //Inserimento del numro di partecipanti
        do {
            System.out.print("Numero partecipanti: ");
            nPartecipanti = sc.nextInt();
            if (nPartecipanti < MIN_PART || nPartecipanti > MAX_PART) {
                System.out.printf("I partecipanti devono essere almeno %d e massimo %d\n", MIN_PART, MAX_PART);
            }
        } while(nPartecipanti < MIN_PART || nPartecipanti > MAX_PART);
        sc.nextLine();

        //Inserimento della lunghezza dell gara, non inferiore a 15
        do {
            System.out.printf("Lunghezza della gara (min %d metri): ", MIN_LUNGH);
            lunghezzaGara = sc.nextInt();
            if(lunghezzaGara < MIN_LUNGH)
                System.out.printf("La lunghezza del percorso deve essere di almeno %d metri", MIN_LUNGH);
        } while(lunghezzaGara < MIN_LUNGH);
        Atleta.LunghezzaGara = lunghezzaGara;

        Giudice giudice = new Giudice(nPartecipanti, gestore);
        List<Atleta> listaAtleti = new ArrayList<>();

        for (int i = 0; i < nPartecipanti; i++) {
            System.out.printf("Nome atleta %d: ", (i + 1));
            String nome = sc.next();

            System.out.printf("Numero atleta %d: ", (i + 1));
            int numero = sc.nextInt();

            listaAtleti.add(new Atleta(nome, numero, giudice));
        }

        //assegna un thread per ogni atleta
        for (int i = 0; i < listaAtleti.size(); i++) {
            Thread t = new Thread(listaAtleti.get(i));
            t.start();
        }
        sc.close();
    }
}

