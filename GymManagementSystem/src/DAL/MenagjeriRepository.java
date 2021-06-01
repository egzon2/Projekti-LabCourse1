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
import BLL.Menagjeri;

public class MenagjeriRepository extends EntMngClass implements MenagjeriInterface {

    @Override
    public void create(Menagjeri m) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(m);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Menagjeri m) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(m);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Menagjeri m) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(m);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Menagjeri> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Menagjeri.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Menagjeri findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

