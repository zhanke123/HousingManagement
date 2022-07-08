package Model.LogicBean;

import Mapper.ManagerMapper;
import org.apache.ibatis.session.SqlSession;

import static Model.LogicBean.InitialSqlSession.getSession;

public class ManagerDB {
    public String getPassword(String username){
        SqlSession session = getSession();
        ManagerMapper mapper = session.getMapper(ManagerMapper.class);
        String pass = mapper.getPassword(username);
        session.commit();
        session.close();
        return pass;
    }
}
