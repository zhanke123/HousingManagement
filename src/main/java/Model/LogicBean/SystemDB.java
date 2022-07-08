package Model.LogicBean;

import Mapper.SystemMapper;
import Model.Bean.System;
import org.apache.ibatis.session.SqlSession;

import static Model.LogicBean.InitialSqlSession.getSession;

public class SystemDB {
    public System getSystemInfo(String SEQNAME){
        SqlSession session = getSession();
        SystemMapper mapper = session.getMapper(SystemMapper.class);
        System info = mapper.getInfo(SEQNAME);
        session.commit();
        session.close();
        return info;
    }

    public int updateSystem(System system){
        SqlSession session = getSession();
        SystemMapper mapper = session.getMapper(SystemMapper.class);
        int i = mapper.updateSystem(system);
        session.commit();
        session.close();
        return i;
    }

    public int insertSystem(System system){
        SqlSession session = getSession();
        SystemMapper mapper = session.getMapper(SystemMapper.class);
        int i = mapper.insertSystem(system);
        session.commit();
        session.close();
        return i;
    }
}
