/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clop;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Christian
 */
public class CcondividiDati {

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
    
    int vincitore;
    
    private Semaphore semClop1;
    private Semaphore semClop2;
    private Semaphore semClop3;
    private Semaphore semClop4;
    private Semaphore semClop5;
    
    private Semaphore semVisualizza1;
    private Semaphore semVisualizza2;
    private Semaphore semCorsaFinita;
    
    
    public CcondividiDati() {
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = 0;
        this.c4 = 0;
        this.c5 = 0;
        semClop1 = new Semaphore(0);
        semClop2 = new Semaphore(0);
        semClop3 = new Semaphore(0);
        semClop4 = new Semaphore(0);
        semClop5 = new Semaphore(0);
        
        semVisualizza1 = new Semaphore(0);
        semVisualizza2 = new Semaphore(1);
        
        semCorsaFinita=new Semaphore(0);
        
        vincitore=0;
        
    }
    
    public int getVincitore() {
        return vincitore;
    }
    
    public void setVincitore(int vincitore) {
        this.vincitore=vincitore;
    }
    public void WaitCorsaFinita() throws InterruptedException {
        semCorsaFinita.acquire();
    }
    
    
    
    public void WaitVisualizza1() throws InterruptedException {
        semVisualizza1.acquire();
    }
    
    public void WaitVisualizza2() throws InterruptedException {
        semVisualizza2.acquire();
    }
    
    public void WaitClop1() throws InterruptedException {
        semClop1.acquire();
    }
    
    public void WaitClop2() throws InterruptedException {
        semClop2.acquire();
    }
    
    public void WaitClop3() throws InterruptedException {
        semClop3.acquire();
    }
    
    public void WaitClop4() throws InterruptedException {
        semClop4.acquire();
    }
    
    public void WaitClop5() throws InterruptedException {
        semClop5.acquire();
    }
    
    public void SignalCorsaFinita() {
        semCorsaFinita.release();
    }
    
    public void SignalVisualizza1() throws InterruptedException {
        semVisualizza1.release();
    }
    
    public void SignalVisualizza2() throws InterruptedException {
        semVisualizza2.release();
    }
    
    public void SignalClop1() {
        semClop1.release();
    }
    
    public void SignalClop2() {
        semClop2.release();
    }
    
    public void SignalClop3() {
        semClop3.release();
    }
    
    public void SignalClop4() {
        semClop4.release();
    }
    
    public void SignalClop5() {
        semClop5.release();
    }
    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c1.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public synchronized void setC1() {
        c1++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c2.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public synchronized void setC2() {
        c2++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c3.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public synchronized void setC3() {
        c3++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c4.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public synchronized void setC4() {
        c4++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c5.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public synchronized void setC5() {
        c5++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public synchronized int getC1() {
        return c1;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public synchronized int getC2() {
        return c2;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public synchronized int getC3() {
        return c3;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public synchronized int getC4() {
        return c4;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public synchronized int getC5() {
        return c5;
    }
}
