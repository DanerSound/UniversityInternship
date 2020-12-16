# UniversityInternship


This is my diary of university Internship

Calcolo delle e Giorni del Tirocinio :

| Mese           | Ore | Giorni | 
|----------------|-----|--------|
| Settembre 2020 |     |   8    |
| Ottobre 2020   |     |   31   |
| Novembre 2020  |     |   30   |
| Dicembre 2020  |     |        |
| Gennaio 2021   |     |        |
| Febbraio 2021  |     |        |
| Marzo 2021     |     |        |

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
     
CAMBIAMENTO DEL PROGETTO DI TIROCINIO: Dopo averlo concordato con il colloquio con il relatore     
Creazione di un portale IoT per la gestione di un insieme di macchine
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
    * ristrutturato i documento scritti precedentemente, 
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
    
    * 
    
    *
    
    * 
    
   65. Day:
   - all day: 18/12/2020
   
    * 
    
    *
    
    * 
    
----
PAUSA DI NATALE
----
    
   
      
      
     
   
  
  
    
   
    
    
   
  

   
    


      
       
      
      
    
    
    
 
   
   
 

 
    
  
  

  
   
     
     
       
 
 
 

