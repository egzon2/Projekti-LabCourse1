/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Stafi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author qendrimrexhepi
 */
public class StafiComboBoxModel extends AbstractListModel<Stafi> implements ComboBoxModel<Stafi> {

    private List<Stafi> data;
    private Stafi selectedItem;
    
    public StafiComboBoxModel(){}
    
    public StafiComboBoxModel(List<Stafi> data){
        this.data = data;
    }
    
    public void add(List<Stafi> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Stafi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Stafi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}

