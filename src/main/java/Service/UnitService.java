package Service;

import Model.Bean.Unit;
import Model.LogicBean.UnitDB;

import java.util.List;

public class UnitService {

    public UnitDB getUnitDB(){
        return new UnitDB();
    }

    public int UnitAccount(Unit unit){//单位开户
        UnitDB unitDB = getUnitDB();
        int i = unitDB.UnitRegister(unit);
        return i;
    }

    public int delAccount(String UnitNum){//单位注销
        UnitDB unitDB = getUnitDB();
        int i = unitDB.UnitDelete(UnitNum);
        return i;
    }

    public int changeUnit(Unit unit){//单位修改
        UnitDB unitDB = getUnitDB();
        int i = unitDB.UnitUpdate(unit);
        return i;
    }

    public Unit findUnit(String UnitNum){//查询单位信息
        UnitDB unitDB = getUnitDB();
        Unit unitInfo = unitDB.getUnitInfo(UnitNum);
        return unitInfo;
    }

    public List<Unit> getAllUnitInfo(){//查询所有单位信息
        UnitDB unitDB = getUnitDB();
        List<Unit> allInfo = unitDB.getAllInfo();
        return allInfo;
    }

    public List<Unit> SearchUnitInfo(String UnitName){//查询所有单位信息
        UnitDB unitDB = getUnitDB();
        List<Unit> UnitInfo = unitDB.SearchUnit(UnitName);
        return UnitInfo;
    }
}
