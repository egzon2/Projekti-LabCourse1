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
import BLL.Fitnesi;

public class FitnesiRepository extends EntMngClass implements FitnesiInterface {

    @Override
    public void create(Fitnesi f) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Fitnesi f) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Fitnesi f) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Fitnesi> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Fitnesi.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Fitnesi findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

