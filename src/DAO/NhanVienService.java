/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.*;
import model.NhanVien;

/**
 *
 * @author sethk
 */
public interface NhanVienService {

    public ArrayList<NhanVien> getAll();

    public String them(NhanVien nv);

    public String Open();

    public String Save();

}
