package Model.Bean;


import java.util.Date;

public class Unit {
    String UNITACCNUM;//单位公积金账号
    String UNITACCNAME;//单位名称
    String UNITADDR;//单位地址
    String ORGCODE;//组织机构代码
    String UNITCHAR;//单位类别
    String UNITKIND;//企业类型
    String SALARYDATE;//发薪日期
    String UNITPHONE;//联系电话
    String UNITLINKMAN;//单位联系人
    String UNITAGENTPAPNO;//经办人身份证号码
    String ACCSTATE;//账户状态
    String BALANCE;//公积金余额
    String BASENUMBER;//缴存基数
    String UNITPROP;//单位比例
    String PERPROP;//个人比例
    String UNITPAYSUM;//单位月应缴额
    String PERPAYSUM;//个人月应缴额
    Integer PERSNUM;//单位人数
    Date LASTPAYDATE;//最后汇缴月
    String INSTCODE;//公积金中心机构代码
    String OP;//柜员
    Date CREATDATE;//建立日期
    String REMARK;//备注

    public String getUNITACCNUM() {
        return UNITACCNUM;
    }

    public void setUNITACCNUM(String UNITACCNUM) {
        this.UNITACCNUM = UNITACCNUM;
    }

    public String getUNITACCNAME() {
        return UNITACCNAME;
    }

    public void setUNITACCNAME(String UNITACCNAME) {
        this.UNITACCNAME = UNITACCNAME;
    }

    public String getUNITADDR() {
        return UNITADDR;
    }

    public void setUNITADDR(String UNITADDR) {
        this.UNITADDR = UNITADDR;
    }

    public String getORGCODE() {
        return ORGCODE;
    }

    public void setORGCODE(String ORGCODE) {
        this.ORGCODE = ORGCODE;
    }

    public String getUNITCHAR() {
        return UNITCHAR;
    }

    public void setUNITCHAR(String UNITCHAR) {
        this.UNITCHAR = UNITCHAR;
    }

    public String getUNITKIND() {
        return UNITKIND;
    }

    public void setUNITKIND(String UNITKIND) {
        this.UNITKIND = UNITKIND;
    }

    public String getSALARYDATE() {
        return SALARYDATE;
    }

    public void setSALARYDATE(String SALARYDATE) {
        this.SALARYDATE = SALARYDATE;
    }

    public String getUNITPHONE() {
        return UNITPHONE;
    }

    public void setUNITPHONE(String UNITPHONE) {
        this.UNITPHONE = UNITPHONE;
    }

    public String getUNITLINKMAN() {
        return UNITLINKMAN;
    }

    public void setUNITLINKMAN(String UNITLINKMAN) {
        this.UNITLINKMAN = UNITLINKMAN;
    }

    public String getUNITAGENTPAPNO() {
        return UNITAGENTPAPNO;
    }

    public void setUNITAGENTPAPNO(String UNITAGENTPAPNO) {
        this.UNITAGENTPAPNO = UNITAGENTPAPNO;
    }

    public String getACCSTATE() {
        return ACCSTATE;
    }

    public void setACCSTATE(String ACCSTATE) {
        this.ACCSTATE = ACCSTATE;
    }

    public String getBALANCE() {
        return BALANCE;
    }

    public void setBALANCE(String BALANCE) {
        this.BALANCE = BALANCE;
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

    public String getPERPROP() {
        return PERPROP;
    }

    public void setPERPROP(String PERPROP) {
        this.PERPROP = PERPROP;
    }

    public String getUNITPAYSUM() {
        return UNITPAYSUM;
    }

    public void setUNITPAYSUM(String UNITPAYSUM) {
        this.UNITPAYSUM = UNITPAYSUM;
    }

    public String getPERPAYSUM() {
        return PERPAYSUM;
    }

    public void setPERPAYSUM(String PERPAYSUM) {
        this.PERPAYSUM = PERPAYSUM;
    }

    public Integer getPERSNUM() {
        return PERSNUM;
    }

    public void setPERSNUM(Integer PERSNUM) {
        this.PERSNUM = PERSNUM;
    }

    public Date getLASTPAYDATE() {
        return LASTPAYDATE;
    }

    public void setLASTPAYDATE(Date LASTPAYDATE) {
        this.LASTPAYDATE = LASTPAYDATE;
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

    public Date getCREATDATE() {
        return CREATDATE;
    }

    public void setCREATDATE(Date CREATDATE) {
        this.CREATDATE = CREATDATE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "UNITACCNUM='" + UNITACCNUM + '\'' +
                ", UNITACCNAME='" + UNITACCNAME + '\'' +
                ", UNITADDR='" + UNITADDR + '\'' +
                ", ORGCODE='" + ORGCODE + '\'' +
                ", UNITCHAR='" + UNITCHAR + '\'' +
                ", UNITKIND='" + UNITKIND + '\'' +
                ", SALARYDATE='" + SALARYDATE + '\'' +
                ", UNITPHONE='" + UNITPHONE + '\'' +
                ", UNITLINKMAN='" + UNITLINKMAN + '\'' +
                ", UNITAGENTPAPNO='" + UNITAGENTPAPNO + '\'' +
                ", ACCSTATE='" + ACCSTATE + '\'' +
                ", BALANCE=" + BALANCE +
                ", BASENUMBER=" + BASENUMBER +
                ", UNITPROP=" + UNITPROP +
                ", PERPROP=" + PERPROP +
                ", UNITPAYSUM=" + UNITPAYSUM +
                ", PERPAYSUM=" + PERPAYSUM +
                ", PERSNUM=" + PERSNUM +
                ", LASTPAYDATE=" + LASTPAYDATE +
                ", INSTCODE='" + INSTCODE + '\'' +
                ", OP='" + OP + '\'' +
                ", CREATDATE=" + CREATDATE +
                ", REMARK='" + REMARK + '\'' +
                '}';
    }
}
