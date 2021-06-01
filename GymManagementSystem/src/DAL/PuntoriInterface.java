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
import BLL.Puntori;

public interface PuntoriInterface {
    void create (Puntori p) throws FitnesiException;
    void edit (Puntori p) throws FitnesiException;
    void delete (Puntori p) throws FitnesiException; 
    List<Puntori> findALL () throws FitnesiException;
    Puntori findByID(Integer ID) throws FitnesiException;
    
}
