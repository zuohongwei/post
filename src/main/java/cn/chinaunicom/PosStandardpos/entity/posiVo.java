package cn.chinaunicom.PosStandardpos.entity;

/**省基准岗位维护查看职责
 * @author zhang_chi on 2018-11-15.
 * @version 1.0
 */
public class posiVo {
    private Integer posId;
    private Integer kid;
    private Integer skid;
    private String kstr;
    private String inFlag;

    @Override
    public String toString() {
        return "posiVo{" +
                "posId=" + posId +
                ", kid=" + kid +
                ", skid=" + skid +
                ", kstr='" + kstr + '\'' +
                ", inFlag='" + inFlag + '\'' +
                '}';
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getSkid() {
        return skid;
    }

    public void setSkid(Integer skid) {
        this.skid = skid;
    }

    public String getKstr() {
        return kstr;
    }

    public void setKstr(String kstr) {
        this.kstr = kstr;
    }

    public String getInFlag() {
        return inFlag;
    }

    public void setInFlag(String inFlag) {
        this.inFlag = inFlag;
    }
}
