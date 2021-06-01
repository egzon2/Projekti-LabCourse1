/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author Flakron
 */

import BLL.Klienti;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KlientiTableModel extends AbstractTableModel {

    List <Klienti> list;
    String [] cols = {"KID" , "TID" , "FID" , "Emri" , "Mbiemri" , "Gjinia" , "NrPersonal" , "Mosha" , "Qyteti" , "Adresa"};
    
    public KlientiTableModel(){}
    
    public KlientiTableModel(List<Klienti> list){
        this.list = list;
    }
    
    public void addList(List<Klienti> list){
        this.list = list; 
    }
    
    @Override
    public String getColumnName(int col){
            return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public void remove (int row){
        list.remove(row);
    }
    
    public Klienti getKlienti(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klienti k = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return k.getKid();
            case 1:
                return k.getTid();
            case 2:
                return k.getFid();
            case 3:
                return k.getEmri();
            case 4:
                return k.getMbiemri();
            case 5:
                return k.getGjinia();
            case 6:
                return k.getNrPersonal();
            case 7:
                return k.getMosha();
            case 8:
                return k.getQyteti();
            case 9:
                return k.getAdresa();
            default:
                return null;
        }
    }
    
}
