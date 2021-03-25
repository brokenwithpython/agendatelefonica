/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;
/**
 *
 * @author mcorneanu
 */
public final class NrMobil extends NrTel{

    String nrMobil;

    public NrMobil(String nrTel) {
            super(nrTel);
            this.nrMobil = nrTel;
    }


    @Override
    public int compareTo(String t) {
        
        for(int i = 2; i < 10; i++) {
            if(nrMobil.charAt(i) > t.charAt(i)) {
                return 1;
            } else if(nrMobil.charAt(i) < t.charAt(i)) {
                return -1;
            }
             
        }
        return 0;
    }
    
}
