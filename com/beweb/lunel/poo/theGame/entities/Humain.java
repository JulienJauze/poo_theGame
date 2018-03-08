/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;

/**
 *
 * @author julien
 */
public class Humain extends Personnage {
    
    public Humain(){
 
    }

    public Humain(String nom) {
        super(nom);
    }

    @Override
    public void initAttributs() {
        this.force = 10;
        this.pv = 82;
        this.endurance = 6;  
    }
    
    
    
    
    
}
