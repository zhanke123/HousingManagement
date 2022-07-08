package Model.LogicBean;

import Mapper.Mapper;
import Model.Bean.Unit;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Model.LogicBean.InitialSqlSession.getSession;

public class UnitDB {
    public int UnitRegister(Unit Unit){//单位开户
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        int i = mapper.unitRegister(Unit);
        session.commit();
        session.close();
        if(i==1)return 1;
        return 0;
    }

    public int UnitDelete(String UnitNum){//单位销户
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        int i = mapper.deleteUnit(UnitNum);
        session.commit();
        session.close();
        if(i==1)return 1;
        return 0;
    }

    public int UnitUpdate(Unit unit){//单位信息更新
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        int i = mapper.updateUnit(unit);
        session.commit();
        session.close();
        if(i==1)return 1;
        return 0;
    }

    public Unit getUnitInfo(String UnitNum){//查询单位信息
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        Unit unit = mapper.findAll(UnitNum);
        session.commit();
        session.close();
        return unit;
    }

    public List<Unit> getAllInfo(){//获取全部数据
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        List<Unit> allInfo = mapper.getAllInfo();
        session.commit();
        session.close();
        return allInfo;
    }

    public List<Unit> SearchUnit(String UnitName){
        SqlSession session = getSession();
        Mapper mapper = session.getMapper(Mapper.class);
        List<Unit> units = mapper.dimSearch(UnitName);
        session.commit();
        session.close();
        return units;
    }
}
