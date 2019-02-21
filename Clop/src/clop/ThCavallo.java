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
     * CcondividiDati.
     */
    public ThCavallo(boolean usaSleep, boolean usaYield, int pos, CcondividiDati ptr) {
        this.usaSleep = usaSleep;
        this.usaYield = usaYield;
        this.pos = pos;
        this.ptr = ptr;
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
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                ptr.AddString("Clop" + pos);
                if (usaSleep) {
                    Thread.sleep(100);
                }
                if (usaYield) {
                    Thread.yield();
                }
                if (pos == 1) {
                    ptr.setC1();
                }
                if (pos == 2) {
                    ptr.setC2();
                }
                if (pos == 3) {
                    ptr.setC3();
                }
                if (pos == 4) {
                    ptr.setC4();
                }
                if (pos == 5) {
                    ptr.setC5();
                }
            }
        } catch (Exception e) {

        }
    }
}
