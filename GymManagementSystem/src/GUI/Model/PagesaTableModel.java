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

import BLL.Pagesa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PagesaTableModel extends AbstractTableModel {

    List <Pagesa> list;
    String [] cols = {"PAID" , "KID" , "PagesaDitore" , "PagesaJavore" , "PagesaMujore" , "OfertaTreMujore" , "OfertaGjashtMujore" , "OfertaVjetore"};
    
    public PagesaTableModel(){}
    
    public PagesaTableModel(List<Pagesa> list){
        this.list = list;
    }
    
    public void addList(List<Pagesa> list){
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
    
    public Pagesa getPagesa(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pagesa pa = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return pa.getPaid();
            case 1:
                return pa.getKid();
            case 2:
                return pa.getPagesaDitore();
            case 3:
                return pa.getPagesaJavore();
            case 4:
                return pa.getPagesMujore();
            case 5:
                return pa.getOfertaTreMujore();
            case 6:
                return pa.getOfertaGjashtMujore();
            case 7:
                return pa.getOfertaVjetore();
            default:
                return null;
        }
    }
    
}
