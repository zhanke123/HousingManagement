
import Model.LogicBean.SystemDB;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import Mapper.SystemMapper;
import Model.Bean.System;

import static Model.LogicBean.InitialSqlSession.getSession;

public class test {
    @Test
    public static void main(String[] args) {
//        SqlSession session = getSession();
//        Mapper mapper = session.getMapper(Mapper.class);
//        List<Unit> units = mapper.dimSearch("%ﬂŸ¡®%");
//        for(Unit unit :units){
//            System.out.println(unit.toString());
//        }

//        SqlSession session = getSession();
//        PersonalMapper mapper = session.getMapper(PersonalMapper.class);
//        List<Personal> allInfo = mapper.getAllInfo();
//        for(Personal personal :allInfo){
//            System.out.println(personal.toString());
//        }

        SystemDB systemDB = new SystemDB();
        System unitaccnum = systemDB.getSystemInfo("UNITACCNUM");
        java.lang.System.out.println(unitaccnum.toString());
    }
}
