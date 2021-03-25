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
public class NrFix extends NrTel{
    
    String nrFix;

    public NrFix(String nrTel) {
            super(nrTel);
            this.nrFix = nrTel;
    }


    @Override
    public int compareTo(String t) {
        
        for(int i = 2; i < 10; i++) {
            if(nrFix.charAt(i) > t.charAt(i)) {
                return 1;
            } else if(nrFix.charAt(i) < t.charAt(i)) {
                return -1;
            }
             
        }
        return 0;
    }
    
}