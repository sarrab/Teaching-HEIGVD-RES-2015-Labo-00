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
public class AbstractInstrument implements IInstrument {

    @Override
    public String play() {
        return "";
    }

    @Override
    public int getSoundVolume() {
        return soundVolume;
    }

    @Override
    public String getColor() {
        return color;
    }
    
    protected int soundVolume;
    protected String color;
    
    
}
