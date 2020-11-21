/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG BILANGAN
 */
public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        int jumlah = super.getX() - super.getY();
        System.out.println("Hasil Selisih " + super.getX() + " - " + super.getY() + " = " + jumlah);
    }
    
}
