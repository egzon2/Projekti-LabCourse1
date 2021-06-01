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

import BLL.Puntori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PuntoriTableModel extends AbstractTableModel {

    List <Puntori> list;
    String [] cols = {"PID" , "SID" , "Emri" , "Mbiemri" , "Mosha" , "Gjinia" , "NrTelefonit" , "Qyteti" , "Adresa"};
    
    public PuntoriTableModel(){}
    
    public PuntoriTableModel(List<Puntori> list){
        this.list = list;
    }
    
    public void addList(List<Puntori> list){
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
    
    public Puntori getPuntori(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Puntori p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getPid();
            case 1:
                return p.getSid();
            case 2:
                return p.getEmri();
            case 3:
                return p.getMbiemri();
            case 4:
                return p.getMosha();
            case 5:
                return p.getGjinia();
            case 6:
                return p.getNrTelefonit();
            case 7:
                return p.getQyteti();
            case 8:
                return p.getAdresa();
            default:
                return null;
        }
    }
    
}
