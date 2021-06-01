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
import BLL.Paisjet;

public interface PaisjetInterface {
    void create (Paisjet ps) throws FitnesiException;
    void edit (Paisjet ps) throws FitnesiException;
    void delete (Paisjet ps) throws FitnesiException; 
    List<Paisjet> findALL () throws FitnesiException;
    Paisjet findByID(Integer ID) throws FitnesiException;
    
}
