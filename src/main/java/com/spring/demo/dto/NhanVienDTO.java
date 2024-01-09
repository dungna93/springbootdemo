package com.spring.demo.dto;

/**
 * @created: 04/01/2024 - 10:15 PM
 * @author: dungna
 */
public class NhanVienDTO {

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Integer mucLuong;

    private String chucVu;

    private String nguoiTao;

    public NhanVienDTO() {
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

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }
}
