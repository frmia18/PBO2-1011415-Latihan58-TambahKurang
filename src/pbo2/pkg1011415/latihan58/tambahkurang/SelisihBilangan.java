/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011415.latihan58.tambahkurang;

/**
 *
 * @author Server SMKS AL QUDSY
 */
class SelisihBilangan extends Bilangan{
    public void tampilHasilSelisih() {
        int z = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() 
                + " = " + z);
    }
    
}
