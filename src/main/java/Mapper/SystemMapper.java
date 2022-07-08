package Mapper;

import Model.Bean.System;

public interface SystemMapper {
    System getInfo(String SEQNAME);
    int updateSystem(System system);
    int insertSystem(System system);
}
