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
import BLL.Pagesa;

public interface PagesaInterface {
    void create (Pagesa pa) throws FitnesiException;
    void edit (Pagesa pa) throws FitnesiException;
    void delete (Pagesa pa) throws FitnesiException; 
    List<Pagesa> findALL () throws FitnesiException;
    Pagesa findByID(Integer ID) throws FitnesiException;
    
}
