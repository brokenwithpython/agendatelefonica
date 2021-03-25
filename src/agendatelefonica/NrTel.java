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
public abstract class NrTel implements Comparable<String>{
    
    String nrTel;
    
    public NrTel(String nrTel) {
        
        if(validareNumar(nrTel) == true) {
            this.nrTel = nrTel; 
        }
        
        
    }
    
    private boolean validareNumar(String nrTel) {
        return (nrTel.length() == 10 && (nrTel.startsWith("07", 0) || nrTel.startsWith("02", 0) || nrTel.startsWith("03", 0))); 
    }
     
    private boolean equals(String nrTel1) {
        return (nrTel.equals(nrTel1));
    }
    
    @Override
    abstract public int compareTo(String nrTel1);
    
    
    @Override
    public String toString() {
        return nrTel; 
    }
    
    
        
}
