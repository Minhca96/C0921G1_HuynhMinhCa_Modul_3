package service;

import bean.BenhNhan;
import repository.IBenhNhanRepository;
import repository.Impl.BaseRepository;

import java.util.List;
import java.util.Map;

public interface IBenhNhanService {

    List<BenhNhan> getAll();

    Map<String,String> add(BenhNhan benhNhan);

    void delete(String maBenhNhan);

    BenhNhan getById(String maBenhNhan );

     Map<String,String> edit(BenhNhan benhNhan );
}
