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
import BLL.Klienti;

public interface KlientiInterface {
    void create (Klienti k) throws FitnesiException;
    void edit (Klienti k) throws FitnesiException;
    void delete (Klienti k) throws FitnesiException; 
    List<Klienti> findALL () throws FitnesiException;
    Klienti findByID(Integer ID) throws FitnesiException;
    
}
