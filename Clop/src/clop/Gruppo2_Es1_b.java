package clop;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Christian Sipione
 *
 * @brief Gruppo2_Es1_b.java: classe main che si occupa di gestire i vari
 * thread.
 */
public class Gruppo2_Es1_b {

    /**
     * @author Christian Sipione
     *
     * @brief Variabile static Int che serve per scegliere ll cavallo su cui
     * punatre.
     */
    static int cav = 0;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile static Int che serve per scegleire quanto puntare.
     */
    static int punt = 0;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile static Int che serve per calcolare il cavallo vincitore.
     */
    static int max = 0;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile static Int che rappresenta il cavallo vincitore.
     */
    static int CavalloVincitore;
    /**
     * @author Christian Sipione
     *
     * @brief Variabile static String che serve per terminare la gara.
     */
    static String t = ".";
    /**
     * @author Christian Sipione
     *
     * @brief Oggetto di tipo static CcondividiDati che serve per richiamare i
     * metodi della classe CcondividiDati.
     */
    static CcondividiDati c = new CcondividiDati();

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che si occupa di inizializzare i thread.
     *
     * Metodo che inizializza i thread th,th2,th3,th4,th5 che poi vengono
     * lanciati attraverso il metodo start() in seguito si sceglie su quale
     * cavallo punatre tramite la variabile cav e quanto puntare tramite la
     * variabile punt. Qunado si vuole terminare la gara premendo Invio
     * terminano i thread rappresentata dalla variabile t e richiamado i metodi
     * interrupt(). Alla fine si sceglie il cavallo vincitore utilizando la
     * variabile max e il vincirtore viene rappresentato dalla variabile
     * CavalloVincitore. Quando l'utente premerà il tasto invio verranno
     * interrotti i thread e successivamente verrà effettuato l'output del
     * risultato(vincita o perdita).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        while (!((cav >= 1) && (cav <= 5))) {
            System.out.println("Su quale cavallo punti? da 1 a 5");
            cav = input.nextInt();
        }
        while (!((punt >= 1))) {
            System.out.println("Quanto vuoi puntare?");
            punt = input.nextInt();
        }

        ThCavallo th = new ThCavallo(true, true, 1, c);
        ThCavallo th2 = new ThCavallo(true, true, 2, c);
        ThCavallo th3 = new ThCavallo(true, true, 3, c);
        ThCavallo th4 = new ThCavallo(true, true, 4, c);
        ThCavallo th5 = new ThCavallo(true, true, 5, c);
        th.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        System.out.println("Premi invio quando vuoi terminare");
        boolean finito = false;
        while (!finito) {
            try {
                c.getSchermo();
                String s = console.readLine();
                if (s.equals("")) {
                    finito = true;
                } else {
                    clearConsole();
                }
            } catch (IOException ex) {
                Logger.getLogger(Gruppo2_Es1_b.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        clearConsole();
        th.interrupt();
        th2.interrupt();
        th3.interrupt();
        th4.interrupt();
        th5.interrupt();
        c.getSchermo();
        max = c.getC1();
        CavalloVincitore = 1;
        if (max < c.getC2()) {
            max = c.getC2();
            CavalloVincitore = 2;
        }
        if (max < c.getC3()) {
            max = c.getC3();
            CavalloVincitore = 3;
        }
        if (max < c.getC4()) {
            max = c.getC4();
            CavalloVincitore = 4;
        }
        if (max < c.getC5()) {
            max = c.getC5();
            CavalloVincitore = 5;
        }

        System.out.println("Ha vinto il cavallo " + CavalloVincitore);
        if (CavalloVincitore == cav) {
            System.out.println("HAI VINTO  " + punt * 3 + " €");
        }
        if (CavalloVincitore != cav) {
            System.out.println("Hai perso");
        }
        System.out.println("Programma terminato.");
    }

    /**
     * @author Christian Sipione
     *
     * @brief: Metodo usato per pulire la console
     *
     * Metodo in cui viene dichiarata una stringa che andrà ad assumere il nome
     * del sistema operativo. Se la stringa associa l'o.s. a windows usa il
     * comando cls altrimenti clear.
     *
     */
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("cmd", "/c", "clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {

        }
    }
}
