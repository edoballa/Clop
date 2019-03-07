package clop;

/**
 * @author Christian Sipione
 *
 * @brief Semaforo.java: classe Semaforo che si occupa di applicare la mutua
 * esclusione.
 */
public class Semaforo {

    /**
     * @author Christian Sipione
     *
     * @brief Variabile Int che serve per indicare quanti thread in sezione
     * critica possono essere eseguiti contemporaneamente.
     */
    int valore;

    /**
     * @author Christian Sipione
     *
     * @brief Metodo costruttore
     *
     * Metodo che inizializza le variabile valore.
     *
     * @param initial parametro che serve per inizializzare la variabile valore.
     */
    public Semaforo(int initial) {
        valore = initial;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che decrementa la variabile valore.
     *
     * Metodo che permette la mutua esclusione decrementando la variabile valore
     * se sono disponibili posti in coda, altrimenti mette il thread in coda
     * tramite il metodo wait().
     *
     */
    synchronized public void Wait() {
        while (valore == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        valore--;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che decrementa la variabile valore.
     *
     * Metodo che permette la mutua esclusione incrementando la variabile valore
     *
     */
    synchronized public void Signal() {
        valore++;
        notify();
    }

}
