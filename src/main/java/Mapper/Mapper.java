package Mapper;

import Model.Bean.Unit;

import java.util.List;

public interface Mapper {
    Unit findAll(String UnitAccNum);
    int unitRegister(Unit unit);
    int updateUnit(Unit unit);
    int deleteUnit(String UnitAccNum);
    List<Unit> getAllInfo();
    List<Unit> dimSearch(String UnitName);
}
