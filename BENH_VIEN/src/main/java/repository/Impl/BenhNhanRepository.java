package repository.Impl;

import bean.BenhAn;
import bean.BenhNhan;
import repository.IBenhNhanRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepository implements IBenhNhanRepository {
    @Override
    public List<BenhNhan> getAll() {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("select * from benhNhan bn join benhAn ba on bn.maBenhAn=ba.maBenhAn");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                BenhNhan benhNhan = new BenhNhan(
                        rs.getString("maBenhNhan"),
                        rs.getString("tenBenhNhan"),
                        rs.getString("ngayNhapVien"),
                        rs.getString("ngayRaVien"),
                        rs.getString("lyDoNhapVien"),
                        new BenhAn(rs.getString("maBenhAn"))
                );
                benhNhanList.add(benhNhan);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return benhNhanList;
    }

    @Override
    public void add(BenhNhan benhNhan) {
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("insert into benhNhan values (?,?,?,?,?,?)");
            statement.setString(1,benhNhan.getMaBenhNhan());
            statement.setString(2,benhNhan.getTenBenhNhan());
            statement.setString(3,benhNhan.getNgayNhapVien());
            statement.setString(4,benhNhan.getNgayNhapVien());
            statement.setString(5,benhNhan.getLyDoNhapVien());
            statement.setString(6,benhNhan.getMaBenhAn().getMaBenhAn());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(String maBenhNhan) {
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("delete from benhnhan where maBenhNhan=?");
            statement.setString(1,maBenhNhan);
            statement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public BenhNhan getById(String maBenhNhan) {
        BenhNhan benhNhan= null;
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("select * from benhnhan where maBenhNhan=?");
            statement.setString(1,maBenhNhan);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                 benhNhan = new BenhNhan(

                        rs.getString("maBenhNhan"),
                        rs.getString("tenBenhNhan"),
                        rs.getString("ngayNhapVien"),
                        rs.getString("ngayRaVien"),
                        rs.getString("lyDoNhapVien"),
                        new BenhAn(rs.getString("maBenhAn")));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return benhNhan ;
    }

    @Override
    public void edit(BenhNhan benhNhan) {
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("update  benhnhan set tenBenhNhan=?,ngayNhapVien=?,ngayRaVien=?,lyDoNhapVien=?,maBenhAn=? where maBenhNhan=?");

            statement.setString(1,benhNhan.getTenBenhNhan());
            statement.setString(2,benhNhan.getNgayNhapVien());
            statement.setString(3,benhNhan.getNgayNhapVien());
            statement.setString(4,benhNhan.getLyDoNhapVien());
            statement.setString(5,benhNhan.getMaBenhAn().getMaBenhAn());
            statement.setString(6,benhNhan.getMaBenhNhan());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
