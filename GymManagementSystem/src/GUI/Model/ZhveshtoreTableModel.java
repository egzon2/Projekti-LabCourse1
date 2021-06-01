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

import BLL.Zhveshtore;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ZhveshtoreTableModel extends AbstractTableModel {

    List <Zhveshtore> list;
    String [] cols = {"ZHID" , "FID" , "Numri" , "Gjinia"};
    
    public ZhveshtoreTableModel(){}
    
    public ZhveshtoreTableModel(List<Zhveshtore> list){
        this.list = list;
    }
    
    public void addList(List<Zhveshtore> list){
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
    
    public Zhveshtore getZhveshtore(int index){
        return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zhveshtore zh = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return zh.getZhid();
            case 1:
                return zh.getFid();
            case 2:
                return zh.getNumri();
            case 3:
                return zh.getGjinia();
            default:
                return null;
        }
    }
    
}
