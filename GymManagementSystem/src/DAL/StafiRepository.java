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

public class StafiRepository extends EntMngClass implements StafiInterface {

    @Override
    public void create(Stafi s) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Stafi s) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Stafi s) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Stafi> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Stafi.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Stafi findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

