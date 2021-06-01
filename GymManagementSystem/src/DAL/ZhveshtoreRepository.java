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

public class ZhveshtoreRepository extends EntMngClass implements ZhveshtoreInterface {

    @Override
    public void create(Zhveshtore zh) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(zh);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Zhveshtore zh) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(zh);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Zhveshtore zh) throws FitnesiException {
         try{
            em.getTransaction().begin();
            em.remove(zh);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Zhveshtore> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Zhveshtore.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Zhveshtore findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

