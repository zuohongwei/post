package cn.chinaunicom.posstandardpos.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 值集信息表
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-08
 */
@TableName("hades_lookups")
@ApiModel("值集信息表")
public class Lookups extends Model<Lookups> {

    private static final long serialVersionUID = 1L;

    /**
     * 值集信息Id
     */
     @ApiModelProperty(value="值集信息Id")
    @TableId("LOOKUP_ID")
    private BigDecimal lookupId;
    /**
     * 值集类型
     */
     @ApiModelProperty(value="值集类型")
    @TableField("LOOKUP_TYPE")
    private String lookupType;
    /**
     * 值集代码
     */
     @ApiModelProperty(value="值集代码")
    @TableField("LOOKUP_CODE")
    private String lookupCode;
    /**
     * 值集含义
     */
     @ApiModelProperty(value="值集含义")
    @TableField("MEANING")
    private String meaning;
    /**
     * 是否启用
     */
     @ApiModelProperty(value="是否启用")
    @TableField("ENABLED_FLAG")
    private String enabledFlag;
    /**
     * 有效起始时间
     */
     @ApiModelProperty(value="有效起始时间")
    @TableField("START_DATE_ACTIVE")
    private Date startDateActive;
    /**
     * 有效结束时间
     */
     @ApiModelProperty(value="有效结束时间")
    @TableField("END_DATE_ACTIVE")
    private Date endDateActive;
    /**
     * 解释说明
     */
     @ApiModelProperty(value="解释说明")
    @TableField("DESCRIPTION")
    private String description;
    @TableField("CREATE_BY")
    private BigDecimal createBy;
    @TableField("CREATE_DATE")
    private Date createDate;
    @TableField("UPDATE_BY")
    private BigDecimal updateBy;
    @TableField("UPDATE_DATE")
    private Date updateDate;
    @TableField("ATTRIBUTE1")
    private String attribute1;
    @TableField("ATTRIBUTE2")
    private String attribute2;
    @TableField("ATTRIBUTE3")
    private String attribute3;
    @TableField("ATTRIBUTE4")
    private String attribute4;
    @TableField("ATTRIBUTE5")
    private String attribute5;
    @TableField("ATTRIBUTE6")
    private String attribute6;
    @TableField("ATTRIBUTE7")
    private String attribute7;
    @TableField("ATTRIBUTE8")
    private String attribute8;
    @TableField("ATTRIBUTE9")
    private String attribute9;
    @TableField("ATTRIBUTE10")
    private String attribute10;
    /**
     * 值集序号
     */
     @ApiModelProperty(value="值集序号")
    @TableField("ROW_NUM")
    private BigDecimal rowNum;
    /**
     * 值集国家
     */
     @ApiModelProperty(value="值集国家")
    @TableField("TAG")
    private String tag;
    /**
     * 分组名称
     */
     @ApiModelProperty(value="分组名称")
    @TableField("GROUP_NAME")
    private String groupName;
    /**
     * 父级节点代码
     */
     @ApiModelProperty(value="父级节点代码")
    @TableField("PARENT_CODE")
    private String parentCode;


    public BigDecimal getLookupId() {
        return lookupId;
    }

    public void setLookupId(BigDecimal lookupId) {
        this.lookupId = lookupId;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Date getStartDateActive() {
        return startDateActive;
    }

    public void setStartDateActive(Date startDateActive) {
        this.startDateActive = startDateActive;
    }

    public Date getEndDateActive() {
        return endDateActive;
    }

    public void setEndDateActive(Date endDateActive) {
        this.endDateActive = endDateActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCreateBy() {
        return createBy;
    }

    public void setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public BigDecimal getRowNum() {
        return rowNum;
    }

    public void setRowNum(BigDecimal rowNum) {
        this.rowNum = rowNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    protected Serializable pkVal() {
        return this.lookupId;
    }

    @Override
    public String toString() {
        return "Lookups{" +
        ", lookupId=" + lookupId +
        ", lookupType=" + lookupType +
        ", lookupCode=" + lookupCode +
        ", meaning=" + meaning +
        ", enabledFlag=" + enabledFlag +
        ", startDateActive=" + startDateActive +
        ", endDateActive=" + endDateActive +
        ", description=" + description +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", attribute1=" + attribute1 +
        ", attribute2=" + attribute2 +
        ", attribute3=" + attribute3 +
        ", attribute4=" + attribute4 +
        ", attribute5=" + attribute5 +
        ", attribute6=" + attribute6 +
        ", attribute7=" + attribute7 +
        ", attribute8=" + attribute8 +
        ", attribute9=" + attribute9 +
        ", attribute10=" + attribute10 +
        ", rowNum=" + rowNum +
        ", tag=" + tag +
        ", groupName=" + groupName +
        ", parentCode=" + parentCode +
        "}";
    }
}
