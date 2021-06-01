/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Flakron
 */

import java.util.List;
import BLL.Menagjeri;

public interface MenagjeriInterface {
    void create (Menagjeri m) throws FitnesiException;
    void edit (Menagjeri m) throws FitnesiException;
    void delete (Menagjeri m) throws FitnesiException; 
    List<Menagjeri> findALL () throws FitnesiException;
    Menagjeri findByID(Integer ID) throws FitnesiException;
    
}
