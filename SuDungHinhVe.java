/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author Admin
 */
public class SuDungHinhVe {
    public static void main(String[] args) {
        System.out.println("Chu vi va dien tich hinh tron");
        HinhTron ht = new HinhTron();
        ht.setBanKinh(12);
        System.out.println("Chu vi = "+ht.tinhChuVi());
        System.out.println("Dien tich ="+ht.tinhDienTich());
        
        System.out.println("Chu vi va dien tich hinh chu nhat");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(12);
        hcn.setChieuRong(5);
        System.out.println("Chu vi = "+hcn.tinhChuVi());
        System.out.println("Dien tich ="+hcn.tinhDienTich());
    }
}
