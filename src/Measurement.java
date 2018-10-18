
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurapein
 */
public class Measurement {
    LocalDate datum;
    LocalDate uhrzeit;
    String kz;
    int gemessen;
    int erlaubt;
    
    public Measurement(LocalDate datum,LocalDate uhrzeit, String kz, int gemessen, int erlaubt){
        this.datum=datum;
        this.uhrzeit=uhrzeit;
        this.kz=kz;
        this.gemessen=gemessen;
        this.erlaubt=erlaubt;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public LocalDate getUhrzeit() {
        return uhrzeit;
    }

    public String getKz() {
        return kz;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }
    
    public int getUebertretung(){
        return gemessen-erlaubt;
    }
    
    public String getDatumStr(){
        return datum.toString();
    }
    
    public String getUhrzeitStr(){
        return uhrzeit.toString();
    }
    
    @Override
    public String toString(){
        return getDatumStr()+";"+getUhrzeitStr()+";"+getKz()+";"+getGemessen()+";"+getErlaubt();
    }
}
