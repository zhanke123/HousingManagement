package Mapper;

import Model.Bean.Personal;

import java.util.List;

public interface PersonalMapper {
    Personal findAll(String AccNum);
    Personal findAllForSFZ(String AccNum);
    int PersonalRegister(Personal personal);
    int updatePersonal(Personal personal);
    int deletePersonal(String AccNum);
    List<Personal> getAllInfo();
    String getInfoForSFZ(String SFZ);
}
