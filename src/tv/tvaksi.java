/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author windows 10
 */
public class tvaksi {
    public static void main(String[] args) {
        class_tv adam = new class_tv();
        class_tv memed = new class_tv();
        class_tv ujang = new class_tv();
        
        System.out.println("tv adam");
        adam.merek="samsung";
        adam.harga=10000000;
        adam.jenis="LCD";
        adam.ukuran="21 inch";
        adam.warna="hitam";
        
        System.out.println("tv memed");
        memed.merek="LG";
        memed.harga=15000000;
        memed.jenis="LED";
        memed.ukuran="31 inch";
        memed.warna="putih";
        
        System.out.println("tv ujang");
        ujang.merek="Toshiba";
        ujang.harga=10000000;
        ujang.jenis="LED";
        ujang.ukuran="24 inch";
        ujang.warna="silver";
        
        adam.nonton();
        memed.nonton();
        ujang.nonton();
    }
}
