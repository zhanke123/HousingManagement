package Service;

import Model.Bean.Personal;
import Model.Bean.System;
import Model.LogicBean.PersonalDB;
import Model.LogicBean.SystemDB;

import java.util.Date;
import java.util.List;

public class PersonalService {
    public PersonalDB getPersonalDB(){
        return new PersonalDB();
    }

    public int getSFZ(String SFZ){//获取身份证
        PersonalDB personalDB = getPersonalDB();
        int infoForSFZ = personalDB.getInfoForSFZ(SFZ);
        return infoForSFZ;
    }

    public Integer getACCNum(){//获取公积金帐号
        SystemDB systemDB = new SystemDB();
        System personalNum = systemDB.getSystemInfo("PERSONALNUM");
        if(personalNum.getSEQ()+1>=personalNum.getMAXSEQ()){
            return 0;
        }else{
            personalNum.setSEQ(personalNum.getSEQ()+1);
            systemDB.updateSystem(personalNum);
            return personalNum.getSEQ();
        }
    }

    public int PersonalAccount(Personal personal){//个人开户
        PersonalDB personalDB = getPersonalDB();
        int i = personalDB.PersonalRegister(personal);
        return i;
    }

    public int delAccount(String PersonalNum){//个人注销
        PersonalDB personalDB = getPersonalDB();
        int i = personalDB.PersonalDelete(PersonalNum);
        return i;
    }

    public int changePersonal(Personal personal){//个人修改
        PersonalDB personalDB = getPersonalDB();
        int i = personalDB.PersonalUpdate(personal);
        return i;
    }

    public Personal findPersonal(String PersonalNum){//查询个人信息
        PersonalDB personalDB = getPersonalDB();
        Personal personalInfo = personalDB.getPersonalInfo(PersonalNum);
        if(personalInfo==null){
            Personal personalInfoForSFZ = personalDB.getPersonalInfoForSFZ(PersonalNum);
            return personalInfoForSFZ;
        }
        return personalInfo;
    }


    public List<Personal> getAllPersonalInfo(){//查询所有个人信息
        PersonalDB personalDB = getPersonalDB();
        List<Personal> allInfo = personalDB.getAllInfo();
        return allInfo;
    }

    public void registerAll(String allInfo){
        String[] split = allInfo.split(",");
        for(String n : split){
            String[] s = n.split("-");
            String UNITACCNUM = s[0];
            String name = s[1];
            String number = s[2];
            String sendNumber = s[3];
            java.lang.System.out.println(UNITACCNUM+" "+name+ " "+number+ " "+sendNumber);
            Personal personal = new Personal();
            PersonalService personalService = new PersonalService();
            Integer accNum = personalService.getACCNum();
            personal.setACCNUM(Integer.toString(accNum));
            personal.setUNITACCNUM(UNITACCNUM);
            personal.setOPENDATE(new Date());
            personal.setPERACCSTATE("0");
            personal.setNAME(name);
            personal.setSFZ(number);
            personal.setBASENUMBER(sendNumber);
            personalService.PersonalAccount(personal);
        }
    }
}
