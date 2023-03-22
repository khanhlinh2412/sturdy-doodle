/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.NhanVienService;
import NhanVienRepository.NhanVienRepository;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienServiceImp implements NhanVienService {

    private NhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public ArrayList<NhanVien> getAll() {
        return nhanVienRepository.getList();
    }

    @Override
    public String them(NhanVien nv) {
        if (nhanVienRepository.addNhanVien(nv)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String Open() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("QLNV.Data"));
            nhanVienRepository = (NhanVienRepository) ois.readObject();
            ois.close();
            return "Open file successfully";
        } catch (Exception e) {
            return "Open data error ! ";
        }
    }

    @Override
    public String Save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("QLNV.Data"));
            oos.writeObject(nhanVienRepository);
            oos.flush();
            oos.close();
            return "Save file successfully";
        } catch (Exception e) {
            return "Save data error ! ";
        }
    }

}
