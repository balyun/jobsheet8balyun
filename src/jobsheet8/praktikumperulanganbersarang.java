/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

/**
 *
 * @author Client
 */
public class praktikumperulanganbersarang {
    public static void main(String[] args){

    // membuat variabel
    int x, y, z;

        // melakukan perulangan sebanyak x, y, dan z kali
        for(x =0; x <=1; x++){
            for( y =0; y <=3; y++){
                for( z =0; z<=3; z++) {
                System.out.format("Perulangan [x=%d, y=%d, z=%d] %n", x, y, z);
                }
            }
        }
    }
}
