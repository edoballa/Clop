package clop;

/**
 * @author Christian Sipione
 *
 * @brief ThCavallo.java: classe ThCavallo che si occupa di simulare il suono di
 * un cavallo.
 */
public class ThCavallo extends Thread {

    /**
     * @author Christian Sipione
     *
     * @brief Oggetto di tipo CcondividiDati che serve per richiamare i metodi
     * della classe CcondividiDati.
     */
    private CcondividiDati ptr;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile boolean che serve per l'utilizzo del metodo sleep().
     */
    private boolean usaSleep;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile boolean che serve per l'utilizzo del metodo yield().
     */
    private boolean usaYield;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile Int che serve per passare quale cavallo si muove.
     */
    private int pos;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile Semaforo che serve per attuare la mutua esclusione.
     */
    Semaforo sem1;

    /**
     * @author Christian Sipione
     *
     * @brief Metodo costruttore
     *
     * Metodo che inizializza le variabili usaSleep e usaYield al valore scelto
     * che servono per utilizzare i metodi sleep() e yield() e le variabili che
     * servono per la gestione dei cavalli chiamate pos e ptr.
     *
     * @param usaSleep parametro che serve per l'utilizzo del metodo sleep().
     * @param usaYield parametro che serve per l'utilizzo del metodo yield().
     * @param pos parametro che serve per passare quale cavallo si muove.
     * @param ptr parametro che serve per per richiamare i metodi della classe
     * @param sem1 parametro che serve per applicare la mutuia esclusione
     * CcondividiDati.
     */
    public ThCavallo(boolean usaSleep, boolean usaYield, int pos, CcondividiDati ptr, Semaforo sem1) {
        this.usaSleep = usaSleep;
        this.usaYield = usaYield;
        this.pos = pos;
        this.ptr = ptr;
        this.sem1 = sem1;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che si occupa di stampare i passi di un cavallo.
     *
     * Metodo che manda in output il suono di un cavallo Inoltre se la variabile
     * usaSleep è vera richiama il meotodo sleep() e se la variabile usaYield è
     * vera richiama il meotodo yield() inoltre richiama i metodi della classe
     * CcondividiDati tramite la variabile ptr, in base alla posizione tramite
     * la variabile pos.
     */
    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                
                //if (usaSleep) {
                  //  Thread.sleep(100);
                //}
                //if (usaYield) {
                  //  Thread.yield();
                //}

                ptr.WaitVisualizza2();
                if (pos == 1) {
                    System.out.println("Clop" + pos);
                    sem1.Wait();
                    ptr.setC1();
                    sem1.Signal();
                }
                if (pos == 2) {
                    System.out.println("Clop" + pos);
                    sem1.Wait();
                    ptr.setC2();
                    sem1.Signal();
                }
                if (pos == 3) {
                    System.out.println("Clop" + pos);
                    sem1.Wait();
                    ptr.setC3();
                    sem1.Signal();
                }
                if (pos == 4) {
                    System.out.println("Clop" + pos);
                    sem1.Wait();
                    ptr.setC4();
                    sem1.Signal();
                }
                if (pos == 5) {
                    System.out.println("Clop" + pos);
                    sem1.Wait();
                    ptr.setC5();
                    sem1.Signal();
                }

                ptr.SignalVisualizza1();
            }

            ptr.SignalCorsaFinita();
            ptr.setVincitore(pos);

        } catch (Exception e) {

        }

        if (pos == 1) {
            ptr.SignalClop1();
        }
        if (pos == 2) {
            ptr.SignalClop2();
        }
        if (pos == 3) {
            ptr.SignalClop3();
        }
        if (pos == 4) {
            ptr.SignalClop4();
        }
        if (pos == 5) {
            ptr.SignalClop5();
        }
    }
}
