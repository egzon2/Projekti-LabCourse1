/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author qendrimrexhepi
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BLL.Trajneri;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author qendrimrexhepi
 */
public class TrajneriComboBoxModel extends AbstractListModel<Trajneri> implements ComboBoxModel<Trajneri> {

    private List<Trajneri> data;
    private Trajneri selectedItem;
    
    public TrajneriComboBoxModel(){}
    
    public TrajneriComboBoxModel(List<Trajneri> data){
        this.data = data;
    }
    
    public void add(List<Trajneri> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Trajneri getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Trajneri)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}


