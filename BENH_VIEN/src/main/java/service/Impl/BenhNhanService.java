package service.Impl;

import bean.BenhNhan;
import repository.IBenhNhanRepository;
import repository.Impl.BenhNhanRepository;
import service.IBenhNhanService;
import valuedate.Valuedata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BenhNhanService implements IBenhNhanService {
    IBenhNhanRepository iBenhNhanRepository = new BenhNhanRepository();

    @Override
    public List<BenhNhan> getAll() {
        return iBenhNhanRepository.getAll();
    }

    @Override
    public Map<String, String > add(BenhNhan benhNhan) {

        Map<String, String > map = new HashMap<>();
        if (!Valuedata.checkName(benhNhan.getTenBenhNhan())){
            map.put("key","TenBenhNhan sai dinh dang");
        }
        if (map.isEmpty()){
            iBenhNhanRepository.add(benhNhan);
        }
        return map;
    }

    @Override
    public void delete(String maBenhNhan) {
        iBenhNhanRepository.delete(maBenhNhan);
    }

    @Override
    public BenhNhan getById(String maBenhNhan) {
        return iBenhNhanRepository.getById(maBenhNhan);
    }

    @Override
    public Map<String,String> edit(BenhNhan benhNhan) {
        Map<String,String> messenger = new HashMap<>();

        if (!Valuedata.checkName(benhNhan.getTenBenhNhan())){
            messenger.put("key","dinh dang ten khong hop le");
        }
        if(Valuedata.checkName(benhNhan.getTenBenhNhan())){
            iBenhNhanRepository.edit(benhNhan);
        }

       return messenger;
    }


}
