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
import BLL.Zhveshtore;

public interface ZhveshtoreInterface {
    void create (Zhveshtore zh) throws FitnesiException;
    void edit (Zhveshtore zh) throws FitnesiException;
    void delete (Zhveshtore zh) throws FitnesiException; 
    List<Zhveshtore> findALL () throws FitnesiException;
    Zhveshtore findByID(Integer ID) throws FitnesiException;
    
}
