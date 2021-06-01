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

public class TrajneriRepository extends EntMngClass implements TrajneriInterface {

    @Override
    public void create(Trajneri t) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Trajneri t) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Trajneri t) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Trajneri> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Trajneri.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Trajneri findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

