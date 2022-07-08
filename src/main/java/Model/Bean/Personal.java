package Model.Bean;

import java.util.Date;

public class Personal {
    String ACCNUM;// 个人公积金账号
    String UNITACCNUM;//	单位公积金账号
    String UINTNAME;
    Date OPENDATE;// 开户日期
    String BALANCE;// 公积金余额
    String PERACCSTATE;//	个人账户状态
    String BASENUMBER;//	缴存基数
    String UNITPROP;//	单位比例
    String INDIPROP;//	个人比例
    Date LASTPAYDATE;//	最后汇缴月
    String UNITMONPAYSUM;//	单位月应缴额
    String PERMONPAYSUM;//	个人月应缴额
    String YPAYAMT;//	本年汇补缴额
    String YDRAWAMT;//	年提取额
    String YINTERESTBAL;//	年度结息
    String INSTCODE;//	公积金中心机构代码
    String OP;//	柜员
    String SFZ;//身份证
    String NAME;
    String REMARK;

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getUINTNAME() {
        return UINTNAME;
    }

    public void setUINTNAME(String UINTNAME) {
        this.UINTNAME = UINTNAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSFZ() {
        return SFZ;
    }

    public void setSFZ(String SFZ) {
        this.SFZ = SFZ;
    }

    public String getACCNUM() {
        return ACCNUM;
    }

    public void setACCNUM(String ACCNUM) {
        this.ACCNUM = ACCNUM;
    }

    public String getUNITACCNUM() {
        return UNITACCNUM;
    }

    public void setUNITACCNUM(String UNITACCNUM) {
        this.UNITACCNUM = UNITACCNUM;
    }

    public Date getOPENDATE() {
        return OPENDATE;
    }

    public void setOPENDATE(Date OPENDATE) {
        this.OPENDATE = OPENDATE;
    }

    public String getBALANCE() {
        return BALANCE;
    }

    public void setBALANCE(String BALANCE) {
        this.BALANCE = BALANCE;
    }

    public String getPERACCSTATE() {
        return PERACCSTATE;
    }

    public void setPERACCSTATE(String PERACCSTATE) {
        this.PERACCSTATE = PERACCSTATE;
    }

    public String getBASENUMBER() {
        return BASENUMBER;
    }

    public void setBASENUMBER(String BASENUMBER) {
        this.BASENUMBER = BASENUMBER;
    }

    public String getUNITPROP() {
        return UNITPROP;
    }

    public void setUNITPROP(String UNITPROP) {
        this.UNITPROP = UNITPROP;
    }

    public String getINDIPROP() {
        return INDIPROP;
    }

    public void setINDIPROP(String INDIPROP) {
        this.INDIPROP = INDIPROP;
    }

    public Date getLASTPAYDATE() {
        return LASTPAYDATE;
    }

    public void setLASTPAYDATE(Date LASTPAYDATE) {
        this.LASTPAYDATE = LASTPAYDATE;
    }

    public String getUNITMONPAYSUM() {
        return UNITMONPAYSUM;
    }

    public void setUNITMONPAYSUM(String UNITMONPAYSUM) {
        this.UNITMONPAYSUM = UNITMONPAYSUM;
    }

    public String getPERMONPAYSUM() {
        return PERMONPAYSUM;
    }

    public void setPERMONPAYSUM(String PERMONPAYSUM) {
        this.PERMONPAYSUM = PERMONPAYSUM;
    }

    public String getYPAYAMT() {
        return YPAYAMT;
    }

    public void setYPAYAMT(String YPAYAMT) {
        this.YPAYAMT = YPAYAMT;
    }

    public String getYDRAWAMT() {
        return YDRAWAMT;
    }

    public void setYDRAWAMT(String YDRAWAMT) {
        this.YDRAWAMT = YDRAWAMT;
    }

    public String getYINTERESTBAL() {
        return YINTERESTBAL;
    }

    public void setYINTERESTBAL(String YINTERESTBAL) {
        this.YINTERESTBAL = YINTERESTBAL;
    }

    public String getINSTCODE() {
        return INSTCODE;
    }

    public void setINSTCODE(String INSTCODE) {
        this.INSTCODE = INSTCODE;
    }

    public String getOP() {
        return OP;
    }

    public void setOP(String OP) {
        this.OP = OP;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "ACCNUM='" + ACCNUM + '\'' +
                ", UNITACCNUM='" + UNITACCNUM + '\'' +
                ", OPENDATE=" + OPENDATE +
                ", BALANCE=" + BALANCE +
                ", PERACCSTATE='" + PERACCSTATE + '\'' +
                ", BASENUMBER=" + BASENUMBER +
                ", UNITPROP=" + UNITPROP +
                ", INDIPROP=" + INDIPROP +
                ", LASTPAYDATE=" + LASTPAYDATE +
                ", UNITMONPAYSUM=" + UNITMONPAYSUM +
                ", PERMONPAYSUM=" + PERMONPAYSUM +
                ", YPAYAMT=" + YPAYAMT +
                ", YDRAWAMT=" + YDRAWAMT +
                ", YINTERESTBAL='" + YINTERESTBAL + '\'' +
                ", INSTCODE='" + INSTCODE + '\'' +
                ", OP='" + OP + '\'' +
                '}';
    }

}
