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

import BLL.Stafi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StafiTableModel extends AbstractTableModel {

    List <Stafi> list;
    String [] cols = {"SID" , "FID" , "Emri" , "Mbiemri" , "Mosha" , "NrPersonal" , "Pershkrimi"};
    
    public StafiTableModel(){}
    
    public StafiTableModel(List<Stafi> list){
        this.list = list;
    }
    
    public void addList(List<Stafi> list){
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
    
    public Stafi getStafi(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Stafi s = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return s.getSid();
            case 1:
                return s.getFid();
            case 2:
                return s.getEmri();
            case 3:
                return s.getMbiemri();
            case 4:
                return s.getMosha();
            case 5:
                return s.getNrPersonal();
            case 6:
                return s.getPershkrimi();
            default:
                return null;
        }
    }
    
}
