package clop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Christian Sipione
 *
 * @brief ThVisualizza.java: classe ThVisualizza che si occupa di visualizzare i
 * vari clop.
 */
public class ThVisualizza extends Thread {

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
     * @brief Metodo costruttore
     *
     * Metodo che inizializza la variabile ptr che serve per passare l'oggetto
     * della classe CcondividiDati.
     *
     * @param ptr parametro che serve per per richiamare i metodi della classe
     */
    public ThVisualizza(CcondividiDati ptr) {
        this.ptr = ptr;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che si occupa di stampare i passi di un cavallo.
     *
     * Metodo che manda in output il suono di un cavallo.
     */
    public void run() {
        try {
            while (true) {

                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                ptr.WaitVisualizza1();

                System.out.println(ptr.getC1());
                System.out.println(ptr.getC2());
                System.out.println(ptr.getC3());
                System.out.println(ptr.getC4());
                System.out.println(ptr.getC5());

                ptr.SignalVisualizza2();
            }
        } catch (InterruptedException ex) {
           
        }
    }
}
