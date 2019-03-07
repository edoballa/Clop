/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clop;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Gruppo2_Es1_b {

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che si occupa di inizializzare i thread.
     *
     * Metodo che inizializza i thread th,th2,th3,th4,th5 che poi vengono
     * lanciati attraverso il metodo start().Il programma termina quando i
     * thread hanno simulato 50 clop, e sono stati visualizzati dal th6.
     */
    public static void main(String[] args) {
        try {
            Semaforo sem1 = new Semaforo(1);
            CcondividiDati c = new CcondividiDati();

            ThCavallo th = new ThCavallo(true, true, 1, c, sem1);
            ThCavallo th2 = new ThCavallo(true, true, 2, c, sem1);
            ThCavallo th3 = new ThCavallo(true, true, 3, c, sem1);
            ThCavallo th4 = new ThCavallo(true, true, 4, c, sem1);
            ThCavallo th5 = new ThCavallo(true, true, 5, c, sem1);
            ThVisualizza th6 = new ThVisualizza(c);
            th.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();
            th6.start();

            
            
            c.WaitCorsaFinita();
            
            th.interrupt();
            th2.interrupt();
            th3.interrupt();
            th4.interrupt();
            th5.interrupt();
            th6.interrupt();
            
            c.WaitClop1();
            c.WaitClop2();
            c.WaitClop3();
            c.WaitClop4();
            c.WaitClop5();
            //th.join();
            //th2.join();
            //th3.join();
            //th4.join();
            //th5.join();
            

            System.out.println("Il vincitore è il: "+c.getVincitore()+" cavallo");
            System.out.println("Programma terminato.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Gruppo2_Es1_b.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
