/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author admin
 */
public class Trumpet extends AbstractInstrument{
    public Trumpet(){
        this.color="golden";
        this.soundVolume=9;
    }
    public String play(){
        return "pouet";
    }
    
}
