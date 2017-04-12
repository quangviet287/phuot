package vn.dtu.daphuot.dao.manager;

import vn.dtu.daphuot.dao.entity.DiaDiemChiTiet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by teivg on 2/28/2017.
 */
public class DiadiemManager {

    public List<DiaDiemChiTiet> searchDiaDiem(String diadiem){
        List<DiaDiemChiTiet> diaDiemChiTiets = new ArrayList<DiaDiemChiTiet>();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/phuot-vietnam?useUnicode=true&characterEncoding=utf8", "root", "root");
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM diadiem_chitiet WHERE iddiadiem IN (SELECT id FROM diadiem WHERE name like ?)");
            stmt.setString(1, "%"+diadiem+"%");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()) {
                DiaDiemChiTiet diaDiemChiTiet = new DiaDiemChiTiet();
                System.out.println(rs.getString("id")+"  "+rs.getString("iddiadiem")+" "+ rs.getString("ten")+"  "+rs.getString("mota") +" "+ rs.getString("vitri"));
                diaDiemChiTiet.setId(rs.getString("id"));
                diaDiemChiTiet.setIddiadiem(rs.getString("iddiadiem"));
                diaDiemChiTiet.setTen(rs.getString("ten"));
                diaDiemChiTiet.setMota(rs.getString("mota"));
                diaDiemChiTiet.setVitri(rs.getString("vitri"));
                diaDiemChiTiet.setHinhanh(rs.getString("hinhanh"));
                diaDiemChiTiets.add(diaDiemChiTiet);
            }

            con.close();
        }catch(Exception e) {

            e.printStackTrace();
        }
        return diaDiemChiTiets;
    }

}
