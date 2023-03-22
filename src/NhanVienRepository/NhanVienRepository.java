/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVienRepository;


import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class NhanVienRepository {
    private DbConnection dbConnection;
    
    public ArrayList<NhanVien> getList(){
        ArrayList <NhanVien> lst= new ArrayList<>();
        String sql="SELECT tenPhongBan,manv,hoTen,gTinh,ngSinh,dThoai,dChi,email FROM NHANVIEN "
                + " INNER JOIN PhongBan on Phongban.maPb= NhanVien.maPb";
        try(Connection con = dbConnection.getConnection();
              PreparedStatement ps = con.prepareStatement(sql)  ) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNv(rs.getInt("manv"));
                nv.setMaPb(rs.getString("tenPhongBan"));
                nv.setHoTen(rs.getString("hoTen"));
                nv.setGioiTinh(rs.getString("gTinh"));
                nv.setNgaySinh(rs.getString("ngSinh"));
                nv.setSdt(rs.getString("dThoai"));
                nv.setDiaChi(rs.getString("dChi"));
                nv.setEmail(rs.getString("email"));
                lst.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    public boolean addNhanVien(NhanVien nv){
        String sql =" insert into NhanVien(manv,maPb,hoTen,gTinh,ngSinh,dThoai,dChi,email)"
                        + " values(?,?,?,?,?,?,?,?)";
        try (Connection con = dbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)){
            ps.setObject(1,nv.getMaNv());
            ps.setObject(2, nv.getMaPb());
            ps.setObject(3, nv.getHoTen());
            ps.setObject(4, nv.getGioiTinh());
            ps.setObject(5, nv.getNgaySinh());
            ps.setObject(6, nv.getSdt());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.getEmail());
            int result = ps.executeUpdate();
              return  result>0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
       public static void main(String[] args) {
        NhanVienRepository nhanVienRepository = new NhanVienRepository();
        ArrayList<NhanVien> list = nhanVienRepository.getList();
        for (NhanVien nv : list) {
            System.out.println(nv.toString());
        }
    }
    
}
