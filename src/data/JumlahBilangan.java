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
public class JumlahBilangan extends Bilangan{
    
    public void tampilHasilJumlah(){
        
        int jumlah = super.getX() + super.getY();
        System.out.println("Hasil Penjumlahan " + super.getX() + " + " + super.getY() + " = " + jumlah);
    }
}
