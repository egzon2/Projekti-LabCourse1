/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Perdoruesi;
import java.util.List;

/**
 *
 * @author qendrimrexhepi
 */
public interface PerdoruesiInterface {
    void create(Perdoruesi p) throws FitnesiException;
    void edit(Perdoruesi p) throws FitnesiException;
    void delete(Perdoruesi p) throws FitnesiException;
    List<Perdoruesi> findALL() throws FitnesiException;
    Perdoruesi findByID(Integer ID) throws FitnesiException;
    Perdoruesi loginByUsernameAndPassword(String u, String p) throws FitnesiException;
}
