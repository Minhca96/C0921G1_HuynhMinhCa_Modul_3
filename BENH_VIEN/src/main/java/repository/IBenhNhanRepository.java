package repository;

import bean.BenhNhan;

import java.util.List;

public interface IBenhNhanRepository {

    List<BenhNhan> getAll();

    void add(BenhNhan benhNhan);

    void delete(String maBenhNhan);

    BenhNhan getById(String maBenhNhan );

    void edit(BenhNhan benhNhan );


}
