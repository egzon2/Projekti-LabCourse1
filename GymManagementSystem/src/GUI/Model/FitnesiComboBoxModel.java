/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Fitnesi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author qendrimrexhepi
 */
public class FitnesiComboBoxModel extends AbstractListModel<Fitnesi> implements ComboBoxModel<Fitnesi> {

    private List<Fitnesi> data;
    private Fitnesi selectedItem;
    
    public FitnesiComboBoxModel(){}
    
    public FitnesiComboBoxModel(List<Fitnesi> data){
        this.data = data;
    }
    
    public void add(List<Fitnesi> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Fitnesi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Fitnesi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
