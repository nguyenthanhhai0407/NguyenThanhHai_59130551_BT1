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
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String hienThiTT() {
        return super.hienThiTT()+"\n"+"Lớp:"+lop+"\n"+"nangKhieu:"+nangKhieu+"\n"; //To change body of generated methods, choose Tools | Templates.
    } 
}
