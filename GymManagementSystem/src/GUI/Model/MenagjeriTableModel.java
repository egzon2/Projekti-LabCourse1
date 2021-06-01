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

import BLL.Menagjeri;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MenagjeriTableModel extends AbstractTableModel {

    List <Menagjeri> list;
    String [] cols = {"MID" , "SID" , "Emri" , "Mbiemri" , "Mosha" , "NrPersonal" , "NrTelefonit" , "Gjinia" , "Qyteti" , "Adresa"};
    
    public MenagjeriTableModel(){}
    
    public MenagjeriTableModel(List<Menagjeri> list){
        this.list = list;
    }
    
    public void addList(List<Menagjeri> list){
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
    
    public Menagjeri getMenagjeri(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Menagjeri m = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return m.getMid();
            case 1:
                return m.getSid();
            case 2:
                return m.getEmri();
            case 3:
                return m.getMbiemri();
            case 4:
                return m.getNrPersonal();
            case 5:
                return m.getNrTelefonit();
            case 6:
                return m.getGjinia();
            case 7:
                return m.getQyteti();
            case 8:
                return m.getAdresa();
            default:
                return null;
        }
    }
    
}
