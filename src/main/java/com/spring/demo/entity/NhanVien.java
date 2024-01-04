package com.spring.demo.entity;

import javax.persistence.*;

/**
 * @created: 04/01/2024 - 9:59 PM
 * @author: dungna
 */
@Entity
@Table(name = "nhanvien")
public class NhanVien {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "mucluong")
    private Integer mucLuong;

    @Column(name = "chucvu")
    private String chucVu;

    public NhanVien() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(Integer mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
