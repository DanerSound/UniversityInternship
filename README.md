# UniversityInternship


This is my diary of university Internship

Calcolo delle e Giorni del Tirocinio :

| Mese           | Ore | Giorni | 
|----------------|-----|--------|
| Settembre 2020 |  64 |   8    |
| Ottobre 2020   |     |   31   |
| Novembre 2020  |     |   30   |
| Dicembre 2020  |     |   31   |
| Gennaio 2021   |     |   31   |
| Febbraio 2021  |     |        |
| Marzo 2021     |     |        |
| Aprile 2021    |  15 |   2    |

----
Diario :
----
## Settimana 1:
1. Day :
 - All Day: 21/09/2020
    * Assistito alla riparazione di una scheda.
    * Assistito alla creazione di una serie di test Per una scheda "Micro D"
      in Ambiente LABVIEW.
    * Participato ai Test in Laboratorio di una scheda che misura 
      la carica rimanente di una batteria. 
  
2. Day : 
 - All Day: 22/09/2020
      * Introduzione di nozioni alla programmazione realTime
      * Presentazione degli ambienti di sviluppo STM32 cube e IAR_workbench
      * Prove di visualizzazione delle variabili con IAR in _modalità live_ 
      * spiegazione dei contesti in cui vengono usati gli interrupt e 
        prove di visualizzazione con l'oscilloscopio degli interrupt 
      * Breve spiegazione dei protocolli di funzionamento CAN (Controllo Area Network)
      * spiegazioni di funzionamento del primo progetto di Alessio M:
        Produzione di una scheda MOB.
      * Lettura codice di un programma: Approfondimenti riguardanti le notazioni del codice aziendali 
      * breve prova su una scheda MOB:
      * assistito alla programmazione di schede per gestione di motori di potenza
      * imparato a crimpare il cavi FIT a 4 vie e assistito alla saldatura di un connettore seriale 
 
 3. Day : 
  - All Day : 23/09/2020
      * Assistito al colaudo di una scheda micro m, procedura sospessa per mancaza delle specifiche dal cliente
      * Inizio studio dei commandi AT per il nina B112 con il software "Terminal v1.9b"
      * Continuato a studiare i commandi AT 
      * Ricevuto in consegna Motore Brushless e schede di controllo: iniziato a leggere la documentazione associata
        per capire il loro funzionamento e cercare di accenderlo .
        
 4. Day : 
  - All Day : 24/09/2020 
      * Continuato lo studio del motore elettrico 
      * Accesso motore utilizzando i driver di base 
      
 5. Day : 
  - All Day: 25/09/2020
      * Continuato lo studio del motore BL: cercato di definire un profilo con ST_Motor profile
 ----
 ## Settimana 2:
 
 6. Day: 
 - All Day: 28/09/2020
     * Continuato lo studio del motore BL: cercato di definire un profilo con ST_Motor profile
     
 7. Day: 
 - All Day: 29/09/2020
     * Continuato lo studio del motore BL: scoperto errori nella documentazione ufficiale, 
       trovato l'errore in un post del forum di 3 anni fa, sistemato e completato 
       la procedura di profiling del motore. 
     * Settaggio del motori usando St_motor motor workbench
     
 8. Day: 
 - All Day: 30/09/2020
     * Continuato lo studio del motore BL: Cercato di impostare il programma St Motor control 
     
 9. Day: 
 - All Day: 01/10/2020
     * Continuato lo studio del motore BL: Cercato di impostare il programma St Motor control 
     * definito il programma per lo svilluppo del progetto 

10. Day: 
 - All Day: 02/10/2020 
     Ho capito che la documentazione ufficiale è pratticamente inutile perchè non è aggiornata
     * Continuato lo studio del motore BL : Ottenute le prime impostazioni di base con MC_workbench.    
----   
 ## Settimana 3:
 
11. Day: 
 - All Day: 05/10/2020
     * Iniziato ad scrivere la mia documentazione/linee guida per la gestione del programma MOTOR CONTROL WORKBENCH
     * cercato di capire come aggiornare il firmware documentandomi dal forum ufficiale, la documentazione ufficiale non funziona.
     
CAMBIAMENTO DEL PROGETTO DI TIROCINIO: 
Dopo averlo concordato con il colloquio con il relatore Creazione di un portale IoT per la gestione di un insieme di macchine

12. Day: 
 - All Day: 06/10/2020 
     * Iniziato documentarmi riguardo al protocolo usato dalle macchine per communicare il loro "stato" esse usano MQTT  
     * Definizione di un possibile schema di progetto
     
13. Day:  
 - All day: 07/10/2020 
    * Inizio corso MQTT 
    * Analisi di alcuni TSDB: InfluxDB , DalmatierDB, Prometheus, RiakTS per la scelta del TSDB da adoperare. 
    La scelta migliore per questo contesto è _InfluxDB_ data la sua principale carateristica di essere "STAND-ALONE"
    * Inizio studio studio di Grafana come possibile Dasboard ( intermedia ? ) 
 
14. Day: 
 - All day: 08/10/2020 
    * Analisi di alcuni DB: PostgreSQL, mySQL, OracleDB, MS-SQLdb, Per la scelta del DB da integrare insieme al TSDB
    La scelta migliero per questo contesto si è rilevata _PostgreSQL_ 
    * Analisi AWS ( Amazon Web Services ) e Azure ( Windows ) per la scelta del cloud più appropriato per il deploy
    La scelta migliore è _Azure_
    
15. Day: 
 - All day: 09/10/2020
   * Studio dei particolari di influxDB
----   
 ## Settimana 4:

16. Day: 
 - All day: 12/10/2020
   * Studio dei particolare di influxDB, primo tentativo di installazione su una macchina con ubuntu 18.04
   
17. Day: 
- All day: 13/10/2020
   * mi è stato assegnato un progetto _alternativo_, che consiste nel creare due applicativi Java uno che genera valori casuali e unaltro che li riceve e li visualizza (con relativa interfaccia grafica), tutto quanto attraverso un indirizzo ip ( quindi gestione dei socket, risoluzione indirizzo ip) 
   Ho impostato l'iterfaccia grafica del Visualizzatore con

18. Day: 
- All day: 14/10/2020
  * Implementazione dei Threat e relativi Socket per un collegamento Client-Server.

19. Day: 
- All day: 15/10/2020
  * Completamento applicativo Java, Ho capito che Usare altri IDE al di fuori di Eclipse è il male assoluto.
  * Impostazioni di base di mosquitto: prima prova con le impostazioni di base.
  
20. Day: 
- All day: 16/10/2020 
  * Studiato mosquitto per capire come interfacciarlo con il mio applicativo desktop 
  * ho capito che devo riscrivere il backend dell'interfaccia grafica per far si che funzioni. Ho inziato la riscrittura.
----   
 ## Settimana 5:
 
 21. Day: 
- All day: 19/10/2020
  * Completato l'applicativo Desktop "visualizzatore": questo applicativo è un subscriber che visualizza i messaggi del
    topic al cui si è inscritto.
 
 22. Day:
- All day: 20/10/2020
  * Cercato un driver per una vecchio cavo di CANUSB .
  * Generalizzato l'applicativo, per ricevere costantemente messaggi da parte dei rispettivi pubblisher.
    riscontratto alcuni problemi con l'interfaccia grafica. 
    
 22. Day:
- All day: 21/10/2020
  * Generalizzato ulteriormente: ho sistemato il problema della visualizzazione, stampando i messaggi come uno stack.
  * Aggiunta la funzionalità di potere scrivere su file, fatto refactoring.
  * ricevuto altre specifiche riguardo il progetto finale:
    Devo creare una interfaccia grafica, usando i java mdi form : con due modalità di funzionamento  Manuale e Automatico (speficiare i milliSecondi) 
    deve rappresentare i valori :
    
        * Corrente Motore: Trazione, Spazole, Aspirazione, Temperatura.
        * Tensione Alimentazione, 3 motori
        * velocita 
        * stato : OK / Errore (poter conoscere il codice errore)
        * (Futura aggiunta gestione dei log)  
        
 23. Day:
- All day: 22/10/2020
  * Studiato particolari delle interfacce grafiche Java MDI.
  * Iniziato a preparare la nuova interfaccia grafica per gestione Automatioca e Manuale delle macchine di test.

 24. Day: 
- All day: 23/10/2020
  * Studiato il servizio di [ThinkSpeak IOT](https://thingspeak.com/) per tirare su una versione beta della dashboard.
  * Ho cercato di tirare su il servizio con le impostazioni di base.
  * ho definito lo schema del progetto ma è una soluzione molto complicata per essere attuata in tempi brevi .
  
  ----   
 ## Settimana 6: Questa settimana ho iniziato a lavorare da casa perche forse sono stato esposto al virus del covid
 
 25. Day: 
- All day: 26/10/2020 : Questa settimana ho iniziato a lavorare da casa perche forse sono stato esposto al virus del covid
  * collegato un client di prova al portale : ho dovuto riescrivere il client per riadattarlo alle condizioni del portale.
  * ho cercato di completare l'interfaccia grafica dell'applicativo java. ho de grossi problemi con l'allinemanto e l'ordine
  
 26. Day: 
- All day: 27/10/2020
  * Completata interfaccia grafica per la gestione automatica delle macchine di test
  * Creato macchina di test, creato generatore di valori casuali. 
  * Inizio dello studio dello stato dell'Arte delle IoT dasboard

 27. Day: 
- All day: 28/10/2020
  * Raccolto informazione necessaria per il collegamento con il portale thinkspeak
  * Riscritto client, provato a trasferire dati (usando il terminale), 
    problemi con la generazione e gestione di un pool di thread concorrenti. 

 28. Day: 
- All day: 29/10/2020
  * Collegato interfaccia grafica svilluppata con netBeans con il codice scritto in eclipse:Ho riscontratto molto problemi
  eseguito primi test di rendering delle varie finestre MDI
     
 29. Day: 
- All day: 30/10/2020
  * Completato l'elavorato con l'invio autoamatico dei valori da parte di UN solo thread: 
    Ho visto che i thread sono più veloci del portale. l'invio manuale delle informazioni è la migliore scelta per i primi test.
  * Completato elavorato, creato canali di prova e widget associato.
  * fatto video dimostrativo DEMO .
  
 ----   
 ## Settimana 7: Questa ho continuato a lavorare da casa
 
 30. Day:
 - all day: 01/11/2020
   * Eseguito le prime prove di installazione di Mosquitto su cloud, sto usando il mio account personale di AWS perche Azure (windows)
  Non accetta' le carte prepagate.
   * Ho capito come collegare il broker al database in modo da aggirare il problema del iot-agent
   * Creato l'organizzazione private su github per gestion esclusiva dei progetti 
 
  31. Day:
 - all day: 02/11/2020
   * provato senza successo ad collegare mosquitto ad i client locale
   * studiato e provato a creare delle sottoretti su AWS
 
  32. Day:
 - all day: 03/11/2020
   * cercato di far funzionare il servizio in AWS 
 
  33. Day:
 - all day: 04/11/2020
   * cercato di far funzionare il servizio in AWS
   * riscritto il client subscriber e rioganizzazione
 
  34. Day:
 - all day: 05/11/2020
   * Studiato il portale thingspeak ulteriormente, creato moduli di supporto in _python_
   * Installato _mysql_ con l'ambiente di svillupo di _mysql-workbench_ per eseguire le prime prove di insierimento su db 
   * creato script python che mi permette di collegare al database.
 
  35. Day:
 - all day: 06/11/2020
   * creato da zero degli script in python che mi permettono di fare push su database: grazie a questi moduli riesco manipolare un database relazionale.
   * ricercando con più impegno ho trovato dei pluging e framework per pycharm che mi permettono una gestione più agevole delle basi di dati. 
 
 ----   
 ## Settimana 8: Questa ho continuato a lavorare da casa 
 
  36. Day:
 - all day: 09/11/2020
   * completato scrip e preparato la presentazione del giorno 10
   * approfondito alcuni aspetti dei servizi in could

  37. Day: GIORNO SVOLTO **IN PRESENZA PRESSO LA SEDE
 - all day: 10/11/2020 : svolto sono mezza giornata perche avevo una visita medica nel pomeriggio 
   * presentazione del lavoro svolto nelle ultime due settimane 
   * mi sono stati assegnati degli accessi un account aziendale per il could AWS
   * assegnato nuovo esercizio 
 
  38. Day:
 - all day: 11/11/2020 
   * recuperato account personale AWS 
   * concentratto su un analisi approfondita di thinspeak, 
   * definizione parziale di un template di valutazione 
 
  39. Day:
 - all day: 12/11/20
   * portato avanti analisi di thingspeak 
   * mi hanno chiamato dalla sede e assegnato un lavoro di analisi alternativo, per un progetto che serve a loro : il problema consiste nel capèire se si può trovare un gateway che riceve dati in LORAWAN e li rimanda a destinazione seguendo il protocollo mqtt

  40. Day:
 - all day: 13/11/20
   * portato avanti il lavoro di analisi, studio e attivazione in locale di node-red eseguito delle prove
   * costruito un semplice modello pub/sub 
   * cercato di capire le tesi che mi sono state fornite dal titolare in una precedente mail e guardato gli strumenti elencati nella mail arrivati nel pomeriggio 
     forse abbiamo trovato uno strumento che può risolvere quel problema.
 
 ----   
 ## Settimana 9:

  41. Day:
 - all day: 16/11/20
   * guardato ulteriormente il protocolo LORAWAN 
   * definito il template per il confronto delle piataforme interessate
   * completato l'analisi di thingSpeak e iniziato l'analisi di thingerIO
   
   42 Day:
 -  all day: 17/11/20
    * Completato una prima versione dell'analisi di thingerIO, iniziato l'analisi di thingsboard
    * scritto delle note per l'elaborato finale, 
    * iniziato foglio exel che racchiude i dati piu importanti dei primi 3 portali
   
   43 Day:
 - all day: 18/11/20
    * Riscritto l'analisi di Thingspeak, thinger.io, thingBoard :
    * 
    * iniziato a documentarmi su AWS per i servizi iot 
 
   44 Day:
 - all day: 19/11/20 
    * Studiato ulteriormente AWS: ho capito che dispone delle funzionalita apposta per la gestione dei servizi iot
     ( ovviamente a pagamento a me serve una versione di prova ).
    * Per mantenere uno schema di progetto semplice, ho riadattato lo schema originale:
      questo sfrutta i servizi: iot_core di AWS 
      
   45 Day:
 - all day: 20/11/20 
      * ristrutturato i documento scritti precedentemente 
    
      * creato uno nuovo schema di progetto dedicato per i cloud: analizzato il programma  di aws.
    
    
----   
 ## Settimana 10:

  46. Day: 
  - all day: 23/11/20
    * strutturato la presentazione della ricerca 
    * seguito due webinar riguarle le tecnologie iot
    * completato la preparazione delle richerche per il giorno dopo 
    
  47. Day:
  - all day: 24/11/20
    * riscritto parzialmente alcuni documenti  
    * preparato la presentazione del giorno 
    
  48. Day:
  - all day:  25/11/20
    * scritto delle note, per la relazione finale.
    * ultimato la ricerca riguardo i portali iot e servizi cloud 
    * ripetuto per la presentazione del pomeriggio
    * presentato nel tardo pomeriggio
    * iniziato l'approfondimento riguardo i prezzi di Azure e AWS
  
  49. Day:
  - all day: 26/11/20
    * ristrutturano gli schemi di progetto 
    * creato uno schema alternativo perche i prezzi di AWS e AZURE sono eccessivi per lo svillupo di una DEMO
    * completato scritto la relazione " Analisi di prezzi " per AWS
    * iniziato la ricerca per AZURE
    
  50. Day: 
  - all day: 27/11/20 
    * completato la ricerca su AZURE
    * ristrutturato gli schemi di lavoro 
    * approfondito l'analisi di influx e grafana
    * preparato la presentazione di pomeriggio 
    * dopo la presentazione assegnato un nuovo compito: 
      Approndire fino a che punto è possibile manipolare gli oggetti di grafana e 
      scoprire se è possibile collegar influxDB a power BI
      
 ----   
 ## Settimana 11:
 
  51. Day:
  - all day: 30/11/2020
    * ho iniziato ad scrivere le prime pagine del elaborato finale, ho definito una scaletta
    * iniziato la ricerca su Grafana e Power BI:
      Influx si può integrare con grafana, attraverso Odata
      ho installato grafana, e provato ad mettere un basboard di prova  
      
  52. Day:
  - all day: 01/12/2020
    * Aprofondito schema per l'elaborato finale
    * creato istanza di grafana 
    ho dei seri problemi per cercare di installare influx correttamente 
    
  53. Day
  - all day: 02/12/2020
    * ho cercato di far tornare influx 
    * la lavorato sul testo dell'elaborato finale, ho racolto del materiale
    * impostato lo schema di lavoro
    
  54. Day:
  - all day: 03/12/2020
    * trovato due articoli di IEEEE per l'elaborato finale
    * iniziato il refactoring dell'applicativo java per generare machine.
    
  55. Day:
  - all day: 04/12/2020
    * completato il refactoring del applicativo java
    * creato le istanze di telegraf, grafana, influx.
    
    
  ----   
 ## Settimana 12:
 
  56. Day:
  - all day: 07/12/2020
    * provato senza successo a collegare mosquitto a telegraf,
    * eseguito le prime prove di gestione del database influxdb
    
  57. Day:  
  - all day: 08/12/2020
    * creato il file config per mosquitto e telegraf
    * collegato broker a telegraf: riesco a mandare dati e visulizarli
    * preparato la presentazione di del giorno dopo
    
  58. Day:  _Dato che da siamo diventati zona arancione, da questa data è prevista la mi presenza in azienda più spesso._
  - all day: 09/12/2020
    * presentazione rimandata a domani per via delle consegne aziendali. 
    * cambiato schema di lavoro: mando ogni valore singolarmente .
    * firmato dei document riguardo la privacy, sicurezza, e varie .
    
  59. Day:
  - all day: 10/12/2020  
    * studiato la versione free di grafana, purtroppo non posso mettere i pluging. 
      che aumentano le funzionalità delle dashboard.
    * iniziato lo studio di microsftsql-server per la gestione degli utenti.
    * refattorizzato parzialmente il codicce dell'applicativo per mandare in automatico.
    * iniziato a scrivere la documentazione specifica di ogni singolo software che ho usato.
    * presentato e definito una prima versione dell'Elaborato finale.
    
  60. Day:
  - all day: 11/12/2020
    * Completato la documentazione di mosquitto broker
    * approfondito lo studio di grafana: 
      scoperto l'esistenza delle VARIABILI in Grafana, intesse come dei _placeholder_ :
      il valore della variabile sarà assegnato in un secondo momento attraverso un menù a tendina a run-time che aggiornerà il valore del Panel a cui è associato.
      Il panel deve essere impostato in modo tale che ascolti il cambiamento della variabile. Vanno impostate a modo.
    * cercato di creare degli utenti di prova a cui associare delle dashboard adhoc, 
      ma non ho capito come attivare il servizio SMTP di grafana e legarlo alla mia mail 
    * Migliorato la presentazione della documentazione. 
    
    
      ----   
 ## Settimana 13:
 
  61. Day:
  - all day: 14/12/2020 
    * sono andato avanti con la scrittura della documentazione specifica 
    * ho capito come generare variabili su grafana: l'obbietivo attuale è risucre ad impostare a modo per riuscire a gestire più macchine con una sola dashboard 
    sopratutto in questo modo riusciamo ad agregare  i dati di più macchine. 
  
  62. Day:
  - all day: 15/12/2020   
    * ancora tentativi per cercare di controllare le variabili di grafana 
    * mi hanno dato gli accessi di un virtual server privato: prima di poterlo usare devo mappare il contenuto, e vedere le caratteristiche 
      ho raccolto alcuni dati utili: ho visto che il server dispone da una piattarforma docker: per non creare confusione con i servizi attualmente che il 
      server espone mi appoggerò a docker cercherò di installare i miei container e far tornare il servizio. 
    * iniziato un corso di tre ore su docker: 
    * provato ad installare docker su linux-mint
   
   63. Day:
   - all day: 16/12/2020
     * ho installato docker, e provato a lanciare dei commandi: ho subito rotto un file di configurazione
     * ho seguito un corso per imparare ad usare docker
      a fine giornata ho seguito delle prove in maniera efficiente.
     * scritto delle note per l'eborato finale.
    
   64. Day:
   - all day: 17/12/2020
     * completato corso su docker:
     * sono risucito a mettere sul server, il mio broker personale e interagire con esso.
     * eseguito delle prove in locale sono riuscito a far comunicare tra loro i servizi di broker, telegraf, influx ed influxUI
     * ho provato a riportare lo stesso ragionamento anche online, ho trovato delle difficoltà che non avevo riscontrato prima
    
   65. Day:
   - all day: 18/12/2020
     * Ho portato i servizi online : mosquitto broker, telegraf, influxdb, e influxUI (una semplice interfaccia per la gestione di influx online)
     i problemi che si sono verificati ieri erano dovuto alla stanchezza dato che cerano delle righe nel file di configurazione che non tornavano 
     * scritto una documentazione parziale.  


----

PAUSA DI NATALE 21/12/2020 - 25/12/2020

     ----   
 ## Settimana 14:
 
   66. Day
   - all day: 28/12/2020 
     * ho scritto un po di documentazione 
     * fatto il punto della situazione
     * ho provato a risolvedere il problema delle variabili, senza avere successo.
     
   67. Day
   - all day: 29/12/2020
     * momentaneamente ho fermato la ricerca della creazione delle variabili su grafana
     * attivato il servizio di SMTP da grafana, abilitato l'alert e creazione degli utenti 
     * creazione dei teams e assegnazione le dashboard dedicate
     * creato il container di grafana riesco a puntarlo dall'esterno : problemi con la personalizzazione del servizio 
     
   68. Day
   - all day: 30/12/2020
     * ottimizzato la comunicazione tra i vari servizi
     * creato i vari team di lavoro con gi utenti assegnato le dashboard
     * scritto un po di documentazione
     
   69. Day
   - all day: 31/12/2020
     * preparato la presentazione di lunedi 04 gennaio 
     * definito i passi per le prossime iterazioni : gestione utenti/ dashboard personalizzate
     * cambiato colore alle dashboard
     
----

ANNO NUOVO : 2021

----

 ## Settimana 15:
 
   70. Day
   - all day: 04/01/2021
     * creato container posgresql, cerano alcuni problemi di conessione
     * installato il container pgAdmin e collegato al container server postgrest
     * eseguito delle prove di popolamento e alcune query 
     * seguito un tutorial per creare un login 
     
   71. Day
   - all day: 05/01/2021
     * scritto una pagina di login html css puri
     * scritto un funzione javascrip che mi valida id e password di un utente di prova
     * cercado di capire come creare il collegamento tra la pagina e il database docker, non ci sono riuscisto 
     * scritto un po di documentazione 
   
   72. Day
   - all day: 06/01/2021
     * guardato dei tutorial riguardo jscript node-js
     * guardato dei tutorial riguardo Bootstrap
     * scritto un po di documentazione
     
   73. Day  
   - all day: 07/01/2021
     * provato ad impostare bootstrap per il server 
     * scritto un po di documentazione 
      
   74. Day  
   - all day: 08/01/2021
     * provato ad impostare bootstrap per il server 
     * scritto un po di documentazione 
 
      ----  
 ## Settimana 16:

   75. Day  
   - all day: 11/01/2021
     * provato ad impostare bootstrap per il server 
     * scritto un po di documentazione
     * riguardo alcuni aspetti di docker 
     
   76. Day  
   - all day: 12/01/2021
     * creato un template di per una djangoapp  
     * presentato schermata di login 
     * deciso template bootstrap da usare 
     
   77. Day  
   - all day: 13/01/2021
     * seguito corso django
     * eseguito delle prove 

   78. Day  
   - all day: 14/01/2021
     * seguito corso django  
     * eseguito delle prove 
     
   79. Day  
   - all day: 15/01/2021
     * seguito corso django  
     * eseguito delle prove 
     
    
      ----  
 ## Settimana 17

   80.Day  
   - all day: 18/01/2021
     * seguito corso django  
     * eseguito delle prove 
     
   81.Day  
   - all day: 19/01/2021
     * riscritto alcuni appunti del corso  
     * scritto documentazione specifica 
   
   82.Day  
   - all day: 20/01/2021
     * creato path di redirect, costruito prima versione stabile della webapp 
     
   83.Day  
   - all day: 20/01/2021
     * riscritto alcuni appunti del corso
     * scritto documentazione specifica 
      
   84.Day  
   - all day: 22/01/2021
     * generalizzato le pagine di redirect, 
     * rifattorizzato il tema da usare
     * iniziato corso di test in django
  
   ----  
 ## Settimana 18
 
   85.Day  
   - all day: 25/01/2021
     * seguito corso django  
     * eseguito delle prove
     * lavorato sul portale
     
   86.Day  
   - all day: 26/01/2021
     * scritto la documentazione per influx db 
     * provato a creare il menu a tendina
     * scritto lista dei problemi da risolvere
   
   87.Day  
   - all day: 27/01/2021
     * creato menu a tendina richisto
     * rifattorizzato un po il codice
     
   88.Day  
   - all day: 28/01/2021
     * iniziato la ricerca di un pluging per creare il mirroring di influxdb con postgrest
     * riscrito alcuni appunti al pc 
     * cercato di capire bootstrap
      
   89.Day  
   - all day: 29/01/2021
     *  sistema alcuni aspetti del front-end
     *  ho ancora dei problemi con django e influx
     
     
 ----  
 ## Settimana 19
 
   90.Day  
   - all day: 01/02/2021
     PERMESSO 
     
     
   91.Day  
   - all day: 02/02/2021
     PERMESSO
     
   
   92.Day  
   - all day: 03/02/2021
     PERMESSO
     
     
   93.Day  
   - all day: 04/02/2021
     PERMESSO
     
      
   94.Day  
   - all day: 05/02/2021
      * scritto un po di documentazione 
      * analizzando la vechia interfaccai grafica ho capito che ci sono degli errori di impagninazine 
      * ho provato a recuperare ma non puo funzionare 
     
     
 ----  
 ## Settimana 20
 
   95.Day  
   - all day: 08/02/2021
     * scritto un po di documentazione
     * definito dei punti del progetto 
     * impostato schema base per il progetto "grafanaSED"
     * forse ho trovato il modo di far comunicare entrambi database
     
   96.Day  
   - all day: 09/02/2021
     * scritto un po di documentazione specifica
     * for se ho trovato un il modo di far comunicare, entrambi i database
     ma è complicato 
   
   97.Day  
   - all day: 10/02/2021
     * provato a cercare una interfaccia simille grafana
     * provato a far tornare l'idea di copiare i due database
     * discusione riguarda come procedere,
     * forse ho trovato i plugin
     * devo ripristirare i servizi 
     
   98.Day  
   - all day: 11/02/2021
     * ripristinato l'interfaccia di login 
     * ho capito come collegarmi ad entrambi database contemporaneamente 
     * ci sono dei problemi di login con influxdb
    
     
      
   99.Day  
   - all day: 12/02/2021
     * trovato un client per influxdb : 
       potrebbe risolvere il problema della copia del contenuto del database
     * ripristinato l'interfaccia principale
       perso tanto tempo nel cercare di generalizzare la barra laterale
    
  ----  
 ## Settimana 21
 
   100.Day  
   - all day: 15/02/2021
      * ripristinato l'interfaccia, fatto un po di refactoring 
      * approfonfita la conoscenza di bootstrap
      * iniziato un corso sul javascript
      
   100.Day  
   - all day: 16/02/2021
      * rifattorizzato ulteriormente l'interfaccia, generalizzato e migliorata 
      * ripresso corso docker, contiuato corso sul javscript
      
   101.Day  
   - all day: 17/02/2021
      * continuato la lavorare sull'interfaccia
      * scritto documentazione specifica


   102.Day  
   - all day: 18/02/2021
      * trovato il client giusto per parlare con influx e postgrest contemporaneamente
      * prime prove di comunicazione

   103.Day  
   - all day: 19/02/2021
      *  participato ad una call con un cliente svedese 
      *  risolto un problema con telegraf
      *  scritto documentazione specifica 

  ----  
 ## Settimana 22
 
   103.Day  
   - all day: 22/02/2021
      * lavorato un po sulla interfaccia grafica e il backend 
            
   104.Day  
   - all day: 23/02/2021
      * lavorato un po sull'interfaccia grafica
      * definito scheda di layout per il frontend
     
   105.Day  
   - all day: 24/02/2021
      * lavorato sul front-end

   106.Day  
   - all day: 25/02/2021
     * refactoring completo del fronted

   107.Day  
   - all day: 26/02/2021
     * scritto un po di documentazione specifica 
     * aggiunto il filtering dei clienti  

  ----  
 ## Settimana 23
 
   108.Day  
   - all day: 01/03/2021
      * lavorato sull'interfaccia grafica
            
   109.Day  
   - all day: 02/03/2021
      * lavorato sull'interfaccia grafica 
      * prime prove di iterazioni con il database
     
   110.Day  
   - all day: 03/03/2021
      * creazione dei modelli e iterazioni con il db: prove svolte con sucesso 

   111.Day  
   - all day: 04/03/2021
     * prove di iterazioni con il db : ho avuto dei problemi 

   112.Day  
   - all day: 05/03/2021
     * prove di itarazioni con modelli e database
     * recupero e personalizzazione di sed.manuletic da installare successivamente su un server
     locale
     
       ----  
 ## Settimana 24
 
   113.Day  
   - all day: 08/03/2021
      * lavorato sull'interfaccia grafica
      * installato installazione di sed.manuletic nel database aziendale
            
   114.Day  
   - all day: 09/03/2021
     * ancora prove sui modelli di django e con il db
     * prove di itarazioni con modelli e database
     
   115.Day  
   - all day: 10/03/2021
     * ultimato l'interfaccia grafica 
     * prove di itarazioni con modelli e database

   116.Day  
   - all day: 11/3/2021
     * prove di itarazioni con modelli e database

   117.Day  
   - all day: 12/03/2021
     * prove di itarazioni con modelli e database  
    
     ----  
 ## Settimana 25
 
   113.Day  
   - all day: 15/03/2021
      * lavorato sulla stensione dei modelli di django
      * ristruturato i file models
            
   114.Day  
   - all day: 16/03/2021
     * prove di iterazione con il db dato il nuovo models
     * prove di riscrittura 
     * scrittura di un po di documentazione
     
   115.Day  
   - all day: 17/03/2021
     * ho provato a estendere il modello dei gruop, 
     * ripresso le prove di iterazioni con il db
     * ripristinato la demo di "Manuletic" sul  nuovo server dell'azienda
       (perche fine settimana scorso i server di OVH hanno presso fuoco in Francia)

   116.Day  
   - all day: 18/3/2021
     * provato a creare la funzione per registrare nuovi contratti nel db
     * iniziato ad integrare le singole prove  

   117.Day  
   - all day: 19/03/2021
     * aggiornato database
     * generalizzato ulteriormente il fronted per gestire le chiamate degli utenti 
       riesco a raggingere ed stampare le tabelle di postgrest 

       ----  
 ## Settimana 26
 
   113.Day  
   - all day: 22/03/2021
      * aggiunta di template per anagrafica di clienti
      * refacotring dei alcuni metodi 
            
   114.Day  
   - all day: 23/03/2021
     * lavorato un po sulla grafica
     * iniziato refacoring della documentazione 
     
   115.Day  
   - all day: 24/03/2021
     * continuato scrittura e refacoring della documentazione
     * iniziato corso fullStack developer su udemy

   116.Day  
   - all day: 25/03/2021
     * completato documentazione specifica
     * seguito alcune lezioni del corso di fullstack developer su udemy
     * ho ripresso il lavoro sul portale la parte fronted

   117.Day  
   - all day: 26/03/2021
     * lavorato sul portale 

       ----  
 ## Settimana 27
 
   113.Day  
   - all day: 29/03/2021
      * rielaborato e modelli, aggiunti campi richiesti ed eseguitto delle prove
  
            
   114.Day  
   - all day: 30/03/2021
     * ristrutturato il portale, lavorato sulle funzioni di registrazione
     
   115.Day  
   - all day: 31/03/2021
     * generalizzato i modelli, ultimato frontend
     * inizio integrazione client influx

   116.Day  
   - all day: 01/04/2021
     * caricamentamento di alcuni valori sull'interfaccia grafica in forma statica

   117.Day  
   - all day: 02/04/2021
     * 
    
   
    
     
   
  

   
    


      
       
      
      
    
    
    
 
   
   
 

 
    
  
  

  
   
     
     
       
 
 
 

