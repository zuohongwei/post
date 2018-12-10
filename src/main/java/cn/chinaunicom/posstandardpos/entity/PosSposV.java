package cn.chinaunicom.posstandardpos.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-22
 */
@TableName("ehrcuc_pos_spos_v")
@ApiModel("VIEW")
public class PosSposV extends Model<PosSposV> {

    private static final long serialVersionUID = 1L;

    /**
     * 基准岗位ID
     */
     @ApiModelProperty(value="基准岗位ID")
    @TableField("POS_ID")
    private BigDecimal posId;
    /**
     * 所属部门ID
     */
     @ApiModelProperty(value="所属部门ID")
    @TableField("ORG_ID")
    private BigDecimal orgId;
    /**
     * 岗位序列ID
     */
     @ApiModelProperty(value="岗位序列ID")
    @TableField("POS_CATE_ID")
    private BigDecimal posCateId;
    @TableField("CNAME")
    private String cname;
    /**
     * 子序列ID
     */
     @ApiModelProperty(value="子序列ID")
    @TableField("POS_SUBCATE_ID")
    private BigDecimal posSubcateId;
    @TableField("SNAME")
    private String sname;
    @TableField("PARENT_POS_ID")
    private BigDecimal parentPosId;
    /**
     * 岗位名称
     */
     @ApiModelProperty(value="岗位名称")
    @TableField("PARENT_POS_NAME")
    private String parentPosName;
    /**
     * 岗位名称
     */
     @ApiModelProperty(value="岗位名称")
    @TableField("POS_NAME")
    private String posName;
    @TableField("CORE_FLAG")
    private String coreFlag;
    /**
     * 博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码
     */
     @ApiModelProperty(value="博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码")
    @TableField("DEGREE_CODE")
    private String degreeCode;
    /**
     * 值集含义
     */
     @ApiModelProperty(value="值集含义")
    @TableField("EDUCATION_DEGREE")
    private String educationDegree;
    @TableField("LEVEL_CODE")
    private String levelCode;
    @TableField("ORG_LEVEL")
    private String orgLevel;
    @TableField("KSTR")
    private byte[] kstr;
    /**
     * 有效开始日期
     */
     @ApiModelProperty(value="有效开始日期")
    @TableField("ACTIVE_START_DATE")
    private Date activeStartDate;
    /**
     * 有效结束日期
     */
     @ApiModelProperty(value="有效结束日期")
    @TableField("ACTIVE_END_DATE")
    private Date activeEndDate;


    public BigDecimal getPosId() {
        return posId;
    }

    public void setPosId(BigDecimal posId) {
        this.posId = posId;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public BigDecimal getPosCateId() {
        return posCateId;
    }

    public void setPosCateId(BigDecimal posCateId) {
        this.posCateId = posCateId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public BigDecimal getPosSubcateId() {
        return posSubcateId;
    }

    public void setPosSubcateId(BigDecimal posSubcateId) {
        this.posSubcateId = posSubcateId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public BigDecimal getParentPosId() {
        return parentPosId;
    }

    public void setParentPosId(BigDecimal parentPosId) {
        this.parentPosId = parentPosId;
    }

    public String getParentPosName() {
        return parentPosName;
    }

    public void setParentPosName(String parentPosName) {
        this.parentPosName = parentPosName;
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

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "PosSposV{" +
        ", posId=" + posId +
        ", orgId=" + orgId +
        ", posCateId=" + posCateId +
        ", cname=" + cname +
        ", posSubcateId=" + posSubcateId +
        ", sname=" + sname +
        ", parentPosId=" + parentPosId +
        ", parentPosName=" + parentPosName +
        ", posName=" + posName +
        ", coreFlag=" + coreFlag +
        ", degreeCode=" + degreeCode +
        ", educationDegree=" + educationDegree +
        ", levelCode=" + levelCode +
        ", orgLevel=" + orgLevel +
        ", kstr=" + kstr +
        ", activeStartDate=" + activeStartDate +
        ", activeEndDate=" + activeEndDate +
        "}";
    }
}
