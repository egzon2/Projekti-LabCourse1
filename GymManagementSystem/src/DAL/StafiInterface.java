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
import BLL.Stafi;

public interface StafiInterface {
    void create (Stafi s) throws FitnesiException;
    void edit (Stafi s) throws FitnesiException;
    void delete (Stafi s) throws FitnesiException; 
    List<Stafi> findALL () throws FitnesiException;
    Stafi findByID(Integer ID) throws FitnesiException;
    
}
