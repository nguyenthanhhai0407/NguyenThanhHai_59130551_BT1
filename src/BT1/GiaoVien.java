/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author HaiNguyen
 */
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;
    
    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return super.hienThiTT()+"\n"+"Môn dạy:"+monDay+"\n"+"Tổ bộ môn:"+toBoMon+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

    
}
