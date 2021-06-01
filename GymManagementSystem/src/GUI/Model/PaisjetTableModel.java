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

import BLL.Paisjet;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PaisjetTableModel extends AbstractTableModel {

    List <Paisjet> list;
    String [] cols = {"PSID" , "FID" , "NrSerik" , "Pershkrimi"};
    
    public PaisjetTableModel(){}
    
    public PaisjetTableModel(List<Paisjet> list){
        this.list = list;
    }
    
    public void addList(List<Paisjet> list){
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
    
    public Paisjet getPaisjet(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paisjet ps = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ps.getPsid();
            case 1:
                return ps.getFid();
            case 2:
                return ps.getNrSerik();
            case 3:
                return ps.getPershkrimi();
            default:
                return null;
        }
    }
    
}
