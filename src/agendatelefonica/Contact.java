package agendatelefonica;

import java.time.LocalDate;


public class Contact {

    private String nume;
    private String prenume;
    private NrTel numarTelefon;
    private LocalDate dataNastere;
    

    public Contact(String nume, String prenume, NrTel numarTelefon, int day, int month, int year) {
        this.nume = nume;
        this.prenume = prenume;
        if(numarTelefon.toString().startsWith("07")) {
            this.numarTelefon = new NrMobil(numarTelefon.toString());
        } else if(numarTelefon.toString().startsWith("02") || numarTelefon.toString().startsWith("03")) {
            this.numarTelefon = new NrFix(numarTelefon.toString());
        }
        this.dataNastere = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return nume + " " +   prenume + ", " + this.numarTelefon.toString() + ", " + dataNastere; 
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        
        if(!(o instanceof Contact)) {
            return false;
        }
        
        Contact contact = (Contact) o;
        
        return this.dataNastere == contact.dataNastere &&
                this.numarTelefon == contact.numarTelefon &&
                this.nume.equals(contact.nume) &&
                this.prenume.equals(contact.prenume);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public NrTel getNumarTelefon() {
        return numarTelefon;
    }

    public LocalDate getDataNastere() {
        return dataNastere;
    }
    
    public void destroy() {
        this.nume = null;
        this.prenume = null;
        this.dataNastere = null;
        this.numarTelefon = null;
    }

}
