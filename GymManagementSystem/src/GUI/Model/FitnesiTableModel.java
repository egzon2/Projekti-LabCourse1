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

import BLL.Fitnesi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FitnesiTableModel extends AbstractTableModel {

    List <Fitnesi> list;
    String [] cols = {"FID" , "Emri" , "NrTelefonit" , "Qyteti" , "Adresa" , "NrBiznesit"};
    
    public FitnesiTableModel(){}
    
    public FitnesiTableModel(List<Fitnesi> list){
        this.list = list;
    }
    
    public void addList(List<Fitnesi> list){
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
    
    public Fitnesi getFitnesi(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fitnesi f = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return f.getFid();
            case 1:
                return f.getEmri();
            case 2:
                return f.getNrTelefonit();
            case 3:
                return f.getQyteti();
            case 4:
                return f.getAdresa();
            case 5:
                return f.getNrBiznesit();
            default:
                return null;
        }
    }
    
}
