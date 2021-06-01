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
public class FitnesiException extends Exception {
    public FitnesiException (){
            }
    public FitnesiException (String msg){
        super (msg);
    }
}
