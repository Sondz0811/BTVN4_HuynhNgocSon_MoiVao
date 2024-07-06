/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author sonhuynh081104
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList();
        SinhVien sv1 = new SinhVien(1, "Ngoc Son", "IT", true);
        SinhVien sv2 = new SinhVien(2, "Nam Kha", "IT", true);
        SinhVien sv3 = new SinhVien(3, "Hoan Thien", "IT", true);
        SinhVien sv4 = new SinhVien(4, "Thanh Thuy", "IT", false);
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);
        for (SinhVien sinhVien : sv) {
            System.out.println("Thong tin sinh vien:" + sinhVien);
        }
        //xoa mot sinh vien ra khoi lop
        System.out.println(" ");
        sv.remove(2);
        System.out.println("Sinh vien index 3 thay the index 2 la:" + sv.get(2));
        for (SinhVien sinhVien : sv) {
            System.out.println("Danh sach sau khi xoa sinh vien:" + sinhVien);
        }
        //Sua thong tin sinh vien.
        System.out.println(" ");
        System.out.println("Sua thong tin sinh vien ma so 2: ");
        for (SinhVien sinhVien : sv) {
            if (Integer.valueOf(sinhVien.getId()).equals(2)) {
                sinhVien.setName("Nguyen Ngoc Thang");
                sinhVien.setMajor("Business");
                sinhVien.setGender(true);
                System.out.println("sau khi sua lai thong tin:" + sinhVien);
                break;
            }

        }
        //in ra toan bo sinh vien nam
        System.out.println("");
        System.out.println("in ra toan bo sinh vien nam: ");
        for (SinhVien sinhVien : sv) {
            if (sinhVien.getGender() == true) {
                System.out.println(sinhVien);
            }

        }
        //in ra toan bo sinh vien nu.
        System.out.println("");
        System.out.println("in ra toan bo sinh vien nu:");
        for (SinhVien sinhVien : sv) {
            if (sinhVien.getGender() == false) {
                System.out.println(sinhVien);
            }
        }
    }
}
