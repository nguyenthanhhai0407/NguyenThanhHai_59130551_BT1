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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT3", "đá bóng", "Võ Chí", 21, "Cam Ranh", "0912342121");
        HocSinh HS2 = new HocSinh("58CNTT3", "game online", "Lê Nam", 22, "Nha Trang", "091234562");
        HocSinh HS3 = new HocSinh("60CNTT3", "chơi game", "Lê Đào", 20, "Cam Hòa", "0942234453");
        GiaoVien GV1 = new GiaoVien("Nhập môn lập trình", "Công nghệ phần mềm", "Lê Thị Bích Hằng", 28, "Nha Trang", "0999999999");
        GiaoVien GV2 = new GiaoVien("Kỹ thuật đồ họa", "Công nghệ phần mềm", "Bùi Chí Thành", 32, "Nha Trang", "0999999999");
        GiaoVien GV3 = new GiaoVien("Công nghệ XML", "Công nghệ phần mềm", "Phạm Thị Thu Thúy", 29, "Nha Trang", "0999999999");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        LH.themGVGD(GV1);
        LH.themGVGD(GV2);
        LH.themGVGD(GV3);
        
        LH.inDSHS();
        LH.inDSGVGD();
        // TODO code application logic here
    }
    
}
