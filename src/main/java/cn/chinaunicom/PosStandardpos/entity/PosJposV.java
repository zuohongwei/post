package cn.chinaunicom.PosStandardpos.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-06
 */
@TableName("ehrcuc_pos_jpos_v")
@ApiModel("VIEW")
public class PosJposV extends Model<PosJposV> {

    private static final long serialVersionUID = 1L;

    /**
     * 基准岗位ID
     */

    @TableField("POS_ID")
    private BigDecimal posId;
    /**
     * 岗位序列ID
     */
     @ApiModelProperty(value="岗位序列ID")
    @TableField("POS_CATE_ID")
    private Integer posCateId;
    @Excel(name = "岗位序列")
    @ApiModelProperty(value="岗位序列")
    @TableField("CNAME")
    private String cname;
    /**
     * 子序列ID
     */

    @TableField("POS_SUBCATE_ID")
    private Integer posSubcateId;
    @Excel(name = "子序列")
    @ApiModelProperty(value="子序列")
    @TableField("SNAME")
    private String sname;
    /**
     * 岗位名称
     */
    @Excel(name = "集团基准岗位名称")
     @ApiModelProperty(value="岗位名称")
    @TableField("POS_NAME")
    private String posName;
    @Excel(name = "省基准岗位名称")
    @TableField("PARENT_POS_NAME")
    private String parentPosName;
    @Excel(name = "是否核心")
    @TableField("CORE_FLAG")
    private String coreFlag;
    /**
     * 博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码
     */

     @ApiModelProperty(value="博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码")
    @TableField("DEGREE_CODE")
    private String degreeCode;
    @Excel(name = "学历要求")
    @TableField("EDUCATION_DEGREE")
    private String educationDegree;
    @TableField("LEVEL_CODE")
    private String levelCode;
    @Excel(name = "组织层级")
    @TableField("ORG_LEVEL")
    private String orgLevel;
    @TableField("KSTR")
    private byte[] kstr;
    @TableField("MFLAG")
    private String mflag;
    /**
     * 有效开始日期
     */
    @Excel(name = "开始时间")
     @ApiModelProperty(value="有效开始日期")
    @TableField("ACTIVE_START_DATE")
    private Date activeStartDate;
    /**
     * 有效结束日期
     */
    @Excel(name = "结束时间")
     @ApiModelProperty(value="有效结束日期")
    @TableField("ACTIVE_END_DATE")
    private Date activeEndDate;




    public void setPosId(BigDecimal posId) {
        this.posId = posId;
    }

    public Integer getPosCateId() {
        return posCateId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getPosId() {
        return posId;
    }

    public void setPosCateId(Integer posCateId) {
        this.posCateId = posCateId;
    }

    public void setPosSubcateId(Integer posSubcateId) {
        this.posSubcateId = posSubcateId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPosSubcateId() {
        return posSubcateId;
    }



    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getCoreFlag() {
        return coreFlag;
    }

    public void setCoreFlag(String coreFlag) {
        this.coreFlag = coreFlag;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    public byte[] getKstr() {
        return kstr;
    }

    public void setKstr(byte[] kstr) {
        this.kstr = kstr;
    }

    public String getMflag() {
        return mflag;
    }

    public void setMflag(String mflag) {
        this.mflag = mflag;
    }

    public Date getActiveStartDate() {
        return activeStartDate;
    }

    public void setActiveStartDate(Date activeStartDate) {
        this.activeStartDate = activeStartDate;
    }

    public Date getActiveEndDate() {
        return activeEndDate;
    }

    public void setActiveEndDate(Date activeEndDate) {
        this.activeEndDate = activeEndDate;
    }

    public String getParentPosName() {
        return parentPosName;
    }

    public void setParentPosName(String parentPosName) {
        this.parentPosName = parentPosName;
    }

    @Override
    protected Serializable pkVal() {
        return posId;
    }
    @Override
    public String toString() {
        return "PosJposV{" +
        ", posId=" + posId +
        ", posCateId=" + posCateId +
        ", cname=" + cname +
        ", posSubcateId=" + posSubcateId +
        ", sname=" + sname +
        ", posName=" + posName +
        ", coreFlag=" + coreFlag +
        ", degreeCode=" + degreeCode +
        ", educationDegree=" + educationDegree +
        ", levelCode=" + levelCode +
        ", orgLevel=" + orgLevel +
        ", kstr=" + kstr +
        ", mflag=" + mflag +
        ", activeStartDate=" + activeStartDate +
        ", activeEndDate=" + activeEndDate +
        "}";
    }
}
