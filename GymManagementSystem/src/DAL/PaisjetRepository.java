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
import BLL.Paisjet;

public class PaisjetRepository extends EntMngClass implements PaisjetInterface {

    @Override
    public void create(Paisjet ps) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(ps);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Paisjet ps) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(ps);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Paisjet ps) throws FitnesiException {
       try{
            em.getTransaction().begin();
            em.remove(ps);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Paisjet> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Paisjet.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Paisjet findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

