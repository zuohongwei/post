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
 * 基准岗位和要素关系
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-19
 */
@TableName("ehrcuc_pos_pos_element")
@ApiModel("基准岗位和要素关系")
public class PosPosElement extends Model<PosPosElement> {

    private static final long serialVersionUID = 1L;

    /**
     * 基准岗位ID
     */
     @ApiModelProperty(value="基准岗位ID")
    @TableField("POS_ID")
    private Integer posId;
    /**
     * 子职责ID
     */
     @ApiModelProperty(value="子职责ID")
    @TableField("SKID")
    private Integer skid;
    /**
     * 创建人
     */
     @ApiModelProperty(value="创建人")
    @TableField("CREATED_BY")
    private BigDecimal createdBy;
    /**
     * 创建日期
     */
     @ApiModelProperty(value="创建日期")
    @TableField("CREATION_DATE")
    private Date creationDate;
    /**
     * 最后更新人
     */
     @ApiModelProperty(value="最后更新人")
    @TableField("LAST_UPDATED_BY")
    private BigDecimal lastUpdatedBy;
    /**
     * 最后更新日期
     */
     @ApiModelProperty(value="最后更新日期")
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE1")
    private String attribute1;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE2")
    private String attribute2;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE3")
    private String attribute3;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE4")
    private String attribute4;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE5")
    private String attribute5;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE6")
    private String attribute6;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE7")
    private String attribute7;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE8")
    private String attribute8;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE9")
    private String attribute9;
    /**
     * 预留字段
     */
     @ApiModelProperty(value="预留字段")
    @TableField("ATTRIBUTE10")
    private String attribute10;
    @TableField(exist = false)
    private Long mid;//专业ID
    @TableField(exist = false)
    private Long kid;//职责ID
    @TableField(exist = false)
    private String mname;//专业名称
    @TableField(exist = false)
    private String kname;//职责名称
    @TableField(exist = false)
    private String skname;//子职责名称
    @TableField(exist = false)
    private String inFlag;
    @TableField(exist = false)
    private String kstr;//职责列表

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getSkid() {
        return skid;
    }

    public void setSkid(Integer skid) {
        this.skid = skid;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public String getSkname() {
        return skname;
    }

    public void setSkname(String skname) {
        this.skname = skname;
    }

    public String getInFlag() {
        return inFlag;
    }

    public void setInFlag(String inFlag) {
        this.inFlag = inFlag;
    }

    public String getKstr() {
        return kstr;
    }

    public void setKstr(String kstr) {
        this.kstr = kstr;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "PosPosElement{" +
        ", posId=" + posId +
        ", skid=" + skid +
        ", createdBy=" + createdBy +
        ", creationDate=" + creationDate +
        ", lastUpdatedBy=" + lastUpdatedBy +
        ", lastUpdateDate=" + lastUpdateDate +
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
        "}";
    }
}
