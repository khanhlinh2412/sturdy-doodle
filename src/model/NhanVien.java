/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sethk
 */
public class NhanVien {

    private Integer maNv;
    private String maPb;
    private String hoTen;
    private String tenDangNhap;
    private String sdt;
    private String diaChi;
    private String email;
    private String ngaySinh;
    private String gioiTinh;

    public NhanVien() {
    }
    public NhanVien(Integer maNv, String maPb, String hoTen, String tenDangNhap, String sdt, String diaChi, String email, String ngaySinh, String gioiTinh) {
        this.maNv = maNv;
        this.maPb = maPb;
        this.hoTen = hoTen;
        this.tenDangNhap = tenDangNhap;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public Integer getMaNv() {
        return maNv;
    }

    public void setMaNv(Integer maNv) {
        this.maNv = maNv;
    }

    public String getMaPb() {
        return maPb;
    }

    public void setMaPb(String maPb) {
        this.maPb = maPb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNv=" + maNv + ", maPb=" + maPb + ", hoTen=" + hoTen + ", tenDangNhap=" + tenDangNhap + ", sdt=" + sdt + ", diaChi=" + diaChi + ", email=" + email + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + '}';
    }

}