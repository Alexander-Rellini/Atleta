##GARA ATLETICA
Si deve realizzare un’applicazione Java multithreading che consenta di simulare una gara di velocità.
I partecipanti possono essere astronavi, atleti, auto. L’accesso alla gara di ogni partecipante è riservato e i dati di gestione sono memorizzati in un file. 
In particolare le password dei partecipanti potrebbero essere cifrate (ad esempio secondo il cifrario di Vigénere).
All’avvio del gioco si potrà scegliere il numero di partecipanti da far partire contemporaneamente ed il percorso su cui gareggeranno. Ogni percorso deve avere una lunghezza totale definita ed ogni secondo ogni partecipante potrà percorrere un tratto specifico in funzione della propria velocità.

##CLASSI
Questo progetto è composto da 4 clasi chiamate Atleta, Giudice, Gara che corrisponde al main e Gestore file. 

##DESCRIZIONE
Questo programma simula una gara atletica tra più atleti. Gli atleti sono rappresentati da thread che corrono simultaneamente, percorrendo il tratto di gara a velocità casuale. Ogni atleta può ritirarsi durante la gara e in questo caso viene salvato in un elenco. Alla fine vengono dichiarati il vincitore e il podio e la classifica finale viene salvata in un file di testo per tener traccia dei risultati.
