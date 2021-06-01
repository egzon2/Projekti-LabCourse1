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

public class PuntoriRepository extends EntMngClass implements PuntoriInterface {

    @Override
    public void create(Puntori p) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Puntori p) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Puntori p) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Puntori> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Puntori.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Puntori findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

