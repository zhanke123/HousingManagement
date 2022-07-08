package Model.Bean;

public class System {
    String SEQNAME;
    Integer SEQ;
    Integer MAXSEQ;
    String DESC;
    String FREEUSE1;

    public String getSEQNAME() {
        return SEQNAME;
    }

    public void setSEQNAME(String SEQNAME) {
        this.SEQNAME = SEQNAME;
    }

    public Integer getSEQ() {
        return SEQ;
    }

    public void setSEQ(Integer SEQ) {
        this.SEQ = SEQ;
    }

    public Integer getMAXSEQ() {
        return MAXSEQ;
    }

    public void setMAXSEQ(Integer MAXSEQ) {
        this.MAXSEQ = MAXSEQ;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getFREEUSE1() {
        return FREEUSE1;
    }

    public void setFREEUSE1(String FREEUSE1) {
        this.FREEUSE1 = FREEUSE1;
    }

    @Override
    public String toString() {
        return "System{" +
                "SEQNAME='" + SEQNAME + '\'' +
                ", SEQ=" + SEQ +
                ", MAXSEQ=" + MAXSEQ +
                ", DESC='" + DESC + '\'' +
                ", FREEUSE1='" + FREEUSE1 + '\'' +
                '}';
    }
}
