package clop;

public class CcondividiDati {

    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che indica quante righe sono presenti nello schermo
     */
    private int elem;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo String [] che servirá per visualizzare i vari passi dei
     * cavalli.
     */
    private String[] schermo;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del primo cavallo.
     */
    private int c1;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del secondo
     * cavallo.
     */
    private int c2;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del terzo cavallo.
     */
    private int c3;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del quarto
     * cavallo.
     */
    private int c4;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del quinto
     * cavallo.
     */
    private int c5;

    /**
     * @author Christian Sipione
     *
     * @brief Metodo costruttore
     *
     * Metodo che inizializza le variabili c1,c2,c3,c4,c5 a 0.
     */
    public CcondividiDati() {
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = 0;
        this.c4 = 0;
        this.c5 = 0;
        this.elem = 0;
        this.schermo = new String[1000];
        for (int i = 0; i < 1000; i++) {
            schermo[i] = "";
        }
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c1.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC1() {
        c1++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c2.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC2() {
        c2++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c3.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC3() {
        c3++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c4.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC4() {
        c4++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c5.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC5() {
        c5++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC1() {
        return c1;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del secondo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC2() {
        return c2;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del terzo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC3() {
        return c3;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del quarto cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC4() {
        return c4;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del quinto cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC5() {
        return c5;
    }

    /**
     * @author Christian Sipione
     *
     * @brief: Metodo get di una posizione dell'attributo schermo
     *
     * Questo metodo si occupa di ritornare il valore contenuto in una
     * posizione, indicata dal parametro che gli viene passato, dell'attributo
     * schermo.
     *
     * @param posizione Valore usato come indice dell'array per identificare il
     * valore da ritornare
     *
     * @return Valore contenuto in una posizione dell'attributo schermo
     */
    public String getRiga(int posizione) {
        return schermo[posizione];
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo get dell'attributo elem
     *
     * questo metodo si occupa di ritornare il valore dell'attributo elem di
     * questa classe.
     *
     * @return Valore dell'attributo elem
     */
    public int getElem() {
        return elem;
    }

    /**
     * @author Christian Sipione
     *
     * @brief: Metodo che permette di visualizzare i clop dei cavalli
     *
     * In questo metodo viene fatto l'output a schermo dei valori contenuti in
     * schermo fino a quando si arriva al numero di linee salvate nello stesso
     * attributo.
     *
     */
    public void getSchermo() {
        for (int i = 0; i < elem; i++) {
            if (schermo[i].equals("")) {
                i = 10000;
            } else {
                System.out.println(schermo[i]);
            }
        }
    }

    /**
     * @author Christian Sipione
     *
     * @brief: Metodo che aggiunge una stringa
     *
     * @param str Stringa in cui è contenuto il valore della linea di testo da
     * memorizzare.
     */
    public void AddString(String str) {
        schermo[elem] = str;
        elem++;
    }

}
