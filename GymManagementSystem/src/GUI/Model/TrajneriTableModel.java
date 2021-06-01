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

import BLL.Trajneri;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TrajneriTableModel extends AbstractTableModel {

    List <Trajneri> list;
    String [] cols = {"TID" , "SID" , "Emri" , "Mbiemri" , "Gjinia" , "Mosha" , "NrTelefonit" , "Qyteti" , "Adresa"};
    
    public TrajneriTableModel(){}
    
    public TrajneriTableModel(List<Trajneri> list){
        this.list = list;
    }
    
    public void addList(List<Trajneri> list){
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
    
    public Trajneri getTrajneri(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trajneri t = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return t.getTid();
            case 1:
                return t.getSid();
            case 2:
                return t.getEmri();
            case 3:
                return t.getMbiemri();
            case 4:
                return t.getGjinia();
            case 5:
                return t.getMosha();
            case 6:
                return t.getNrTelefonit();
            case 7:
                return t.getQyteti();
            case 8:
                return t.getAdresa();
            default:
                return null;
        }
    }
    
}
