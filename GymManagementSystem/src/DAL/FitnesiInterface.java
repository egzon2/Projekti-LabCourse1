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
import BLL.Fitnesi;

public interface FitnesiInterface {
    void create (Fitnesi f) throws FitnesiException;
    void edit (Fitnesi f) throws FitnesiException;
    void delete (Fitnesi f) throws FitnesiException; 
    List<Fitnesi> findALL () throws FitnesiException;
    Fitnesi findByID(Integer ID) throws FitnesiException;
    
}
