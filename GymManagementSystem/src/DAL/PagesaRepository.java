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

public class PagesaRepository extends EntMngClass implements PagesaInterface {

    @Override
    public void create(Pagesa pa) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.persist(pa);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Pagesa pa) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.merge(pa);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Pagesa pa) throws FitnesiException {
        try{
            em.getTransaction().begin();
            em.remove(pa);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new FitnesiException("Msg \n" + e.getMessage());
        }
    }

    public List<Pagesa> findALL() throws FitnesiException {
        try{
        return em.createNamedQuery("Pagesa.findAll").getResultList();
        }catch (Exception e){
            throw new FitnesiException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Pagesa findByID(Integer ID) throws FitnesiException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    }
    

