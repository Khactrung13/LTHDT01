/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author Admin
 */
public class HinhTron {
    private double banKinh;

    public HinhTron() {
        
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhChuVi(){
        double chuVi = 2*Math.PI*this.banKinh;
        return chuVi;
    }
    
    public double tinhDienTich(){
        double dienTich = Math.PI*this.banKinh*this.banKinh;
        return dienTich;
    }
}
