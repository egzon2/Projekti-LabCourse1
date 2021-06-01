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
import BLL.Trajneri;

public interface TrajneriInterface {
    void create (Trajneri t) throws FitnesiException;
    void edit (Trajneri t) throws FitnesiException;
    void delete (Trajneri t) throws FitnesiException; 
    List<Trajneri> findALL () throws FitnesiException;
    Trajneri findByID(Integer ID) throws FitnesiException;
    
}
