
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurapein
 */
public class VelocityTableModel extends AbstractTableModel{
    private ArrayList<Measurement> list=new ArrayList();
    private final String[] head={"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};
    public VelocityTableModel(ArrayList l) {
        this.list=l;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return head.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Measurement m=list.get(i);
        switch(i1){
            case 0:return m.getDatumStr();
                    break;
            case 1:return m.getUhrzeitStr();
                    break;
            case 2:return m.getKZ();
                    break;
            case 3:return m.getGemessen();
                    break;
            case 4:return m.getErlaubt();
                    break;
            case 5:return m.getUebertretung();
        }
        return null;
    }

    
    
}
