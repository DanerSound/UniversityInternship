# UniversityInternship



This is my diary of university internship

Calcolo delle e Giorni del Tirocinio :

| Mese          | Ore | Giorni | 
|---------------|-----|--------|
| Settembre 2020|     |   8|
| Ottobre 2020  |     |        |
| Novembre 2020 |     |        |
| dicembre 2020 |     |        |
|               |     |        |

----
Diario :
----
## Settimana 1:
1. Day : 21/09/2020
 - All Day:
    * Assistito alla riparazione di una scheda.
    * Assistito alla creazione di una serie di test Per una scheda "Micro D"
      in Ambiente LABVIEW.
    * Participato ai Test in Laboratorio di una scheda che misura 
      la carica rimanente di una batteria. 
  
2. Day : 22/09/2020
 - Morning:8.30- 12.30
      * Introduzione di nozioni alla programmazione realTime
      * Presentazione degli ambienti di sviluppo STM32 cube e IAR_workbench
      * Prove di visualizzazione delle variabili con IAR in _modalità live_ 
      * spiegazione dei contesti in cui vengono usati gli interrupt e 
        prove di visualizzazione con l'oscilloscopio degli interrupt 
      * Breve spiegazione dei protocolli di funzionamento CAN (Controllo Area Network)
      * spiegazioni di funzionamento del primo progetto di Alessio M:
        Produzione di una scheda MOB.
    
 - Afternoon:8.30- 19.30
      * Lettura codice di un programma: Approfondimenti riguardanti le notazioni del codice aziendali 
      * breve prova su una scheda MOB:
      * assistito alla programmazione di schede per gestione di motori di potenza
      * imparato a crimpare il cavi FIT a 4 vie e assistito alla saldatura di un connettore seriale 
 
 3. Day : 23/09/2020
  - Morning: 8.30- 12.30
      * Assistito al colaudo di una scheda micro m, procedura sospessa per mancaza delle specifiche dal cliente
      * Inizio studio dei commandi AT per il nina B112 con il software "Terminal v1.9b"
      
  - Afternon 14.00- 18.30
      * Continuato a studiare i commandi AT 
      * Ricevuto in consegna Motore Brushless e schede di controllo: iniziato a leggere la documentazione associata
        per capire il loro funzionamento e cercare di accenderlo .
        
 4. Day : 24/09/2020
  - Morning 8.15- 12.30
      * Continuato lo studio del motore elettrico 
  - Afternon 14.00- 18.45
      * Accesso motore utilizzando i driver di base 
      
 5. Day : 25/09/2020
  - All Day:
      * Continuato lo studio del motore BL: cercato di definire un profilo con ST_Motor profile
 ----
 ## Settimana 2:
 
 6. Day: 28/09/2020
 - All Day:
     * Continuato lo studio del motore BL: cercato di definire un profilo con ST_Motor profile
     
 7. Day: 29/09/2020
 - All Day:
     * Continuato lo studio del motore BL: scoperto errori nella documentazione ufficiale, 
       trovato l'errore in un post del forum di 3 anni fa, sistemato e completato 
       la procedura di profiling del motore. 
     * Settaggio del motori usando St_motor motor workbench
     
 8. Day: 30/09/2020
 - All Day:
     * Continuato lo studio del motore BL: Cercato di impostare il programma St Motor control 
     
 9. Day: 01/10/2020
 - All Day:
     * Continuato lo studio del motore BL: Cercato di impostare il programma St Motor control 
     * definito il programma per lo svilluppo del progetto 

10. Day: 02/10/2020
 - All Day: 

     Ho capito che la documentazione ufficiale è pratticamente inutile perchè non è aggiornata
     * Continuato lo studio del motore BL : Ottenute le prime impostazioni di base con MC_workbench.    
----   
 ## Settimana 3:
 
11. Day: 05/10/2020
 - All Day:
     * Iniziato ad scrivere la mia documentazione/linee guida per la gestione del programma MOTOR CONTROL WORKBENCH
     * cercato di capire come aggiornare il firmware documentandomi dal forum ufficiale, la documentazione ufficiale non funziona.
     
12. Day: 06/10/2020 - CAMBIAMENTO DEL PROGETTO DI TIROCINIO: Dopo averlo concordato con il colloquio con il relatore
 - All Day: Creazione di un portale IoT per la gestione di un insieme di macchine
     * Iniziato documentarmi riguardo al protocolo usato dalle macchine per communicare il loro "stato" esse usano 
MQTT  
     * Definizione schema di progetto
     
13. Day: 07/10/2020 
 - All day: 
    * Inizio corso MQTT 
    * Analisi di alcuni TSDB: InfluxDB , DalmatierDB, Prometheus, RiakTS per la scelta del TSDB da adoperare. 
    La scelta migliore per questo contesto è _InfluxDB_ data la sua principale carateristica di essere "STAND-ALONE"
    * Inizio studio studio di Grafana come possibile Dasboard ( intermedia ? ) 
 
14. Day: 08/10/2020 
 - All day:
    * Analisi di alcuni DB: PostgreSQL, mySQL, OracleDB, MS-SQLdb, Per la scelta del DB da integrare insieme al TSDB
    La scelta migliero per questo contesto si è rilevata _PostgreSQL_ 
    * Analisi AWS ( Amazon Web Services ) e Azure ( Windows ) per la scelta del cloud più appropriato per il deploy
    La scelta migliore è _Azure_
    
15. Day: 09/10/2020
 - All day:
   * Studio dei particolari di influxDB
----   
 ## Settimana 4:

16. Day: 12/10/2020
 - All day:
   * Studio dei particolare di influxDB, primo tentativo di installazione su una macchina con ubuntu 18.04
   
17. Day: 13/10/2020
- All day:
   * mi è stato assegnato un progetto _alternativo_, che consiste nel creare due applicativi Java uno che genera valori casuali e unaltro che li riceve e li visualizza (con relativa interfaccia grafica), tutto quanto attraverso un indirizzo ip ( quindi gestione dei socket, risoluzione indirizzo ip) 
   Ho impostato l'iterfaccia grafica del Visualizzatore con

18. Day: 14/10/2020
- All day:
  * Implementazione dei Threat e relativi Socket per un collegamento Client-Server.

19. Day: 15/10/2020
- All day:
  * Completamento applicativo Java, Ho capito che Usare altri IDE al di fuori di Eclipse è il male assoluto.
  * Impostazioni di base di mosquitto: prima prova con le impostazioni di base.
  
20. Day: 16/10/2020 
- All day:
  * Studiato mosquitto per capire come interfacciarlo con il mio applicativo desktop 
  * ho capito che devo riscrivere il backend dell'interfaccia grafica per far si che funzioni. Ho inziato la riscrittura.
----   
 ## Settimana 5:
 
 21. Day: 19/10/2020
- All day:
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
 ## Settimana 6:
  
  
    
  
  

  
   
     
     
       
 
 
 

