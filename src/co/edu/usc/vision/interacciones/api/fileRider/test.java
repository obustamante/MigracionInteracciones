package co.edu.usc.vision.interacciones.api.fileRider;

import co.edu.usc.vision.interacciones.api.dao.model.DrugbankMapper;
import co.edu.usc.vision.interacciones.utiles.BdUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class test {


    public void insertarDatos () throws IOException {

        SqlSession session = BdUtils.getSession();

        DrugbankMapper mapper = session.getMapper(DrugbankMapper.class);
        mapper.selectByPrimaryKey("");


        BdUtils.closeSession();

    }



}
