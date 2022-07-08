package Model.LogicBean;

import Mapper.Mapper;
import Mapper.PersonalMapper;
import Model.Bean.Personal;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Model.LogicBean.InitialSqlSession.getSession;

public class PersonalDB {

        public int PersonalRegister(Personal personal){//个人开户
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            int i = mapper.PersonalRegister(personal);
            session.commit();
            session.close();
            if(i==1)return 1;
            return 0;
        }

        public int PersonalDelete(String PersonalNum){//个人销户
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            int i = mapper.deletePersonal(PersonalNum);
            session.commit();
            session.close();
            if(i==1)return 1;
            return 0;
        }

        public int PersonalUpdate(Personal personal){//个人信息更新
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            int i = mapper.updatePersonal(personal);
            session.commit();
            session.close();
            if(i==1)return 1;
            return 0;
        }

        public Personal getPersonalInfo(String PersonalNum){//查询个人信息
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            Personal personal= mapper.findAll(PersonalNum);
            session.commit();
            session.close();
            return personal;
        }

        public Personal getPersonalInfoForSFZ(String PersonalNum){//身份证查询个人信息
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            Personal personal= mapper.findAllForSFZ(PersonalNum);
            session.commit();
            session.close();
            return personal;
        }

        public List<Personal> getAllInfo(){//查询所有人全部信息
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            List<Personal> allInfo = mapper.getAllInfo();
            session.commit();
            session.close();
            return allInfo;
        }

        public int getInfoForSFZ(String SFZ){
            SqlSession session = getSession();
            PersonalMapper mapper = session.getMapper(PersonalMapper.class);
            String infoForSFZ = mapper.getInfoForSFZ(SFZ);
            session.commit();
            session.close();
            if(infoForSFZ==null)return 0;
            else return 1;
        }
}
