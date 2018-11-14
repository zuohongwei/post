package cn.chinaunicom.duty.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-01
 */
@TableName("ehrcuc_pos_ver")
@ApiModel("")
public class PosVer extends Model<PosVer> {

    private static final long serialVersionUID = 1L;

    @TableId("VERSION_ID")
    private Integer versionId;
    @TableField("VERSION_NAME")
    private String versionName;
    /**
     * 员工关键职责分配版本(EK)、职位体系版本（P）
     */
     @ApiModelProperty(value="员工关键职责分配版本(EK)、职位体系版本（P）")
    @TableField("VERSION_CATE")
    private String versionCate;
    @TableField("REFERENCE_ID")
    private Integer referenceId;
    @TableField("EFFETIVE_START_DATE")
    private Date effetiveStartDate;
    @TableField("EFFETIVE_END_DATE")
    private Date effetiveEndDate;
    @TableField("CREATED_BY")
    private Integer createdBy;
    @TableField("CREATION_DATE")
    private Date creationDate;
    @TableField("LAST_UPDATED_BY")
    private Integer lastUpdatedBy;
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;
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


    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCate() {
        return versionCate;
    }

    public void setVersionCate(String versionCate) {
        this.versionCate = versionCate;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Date getEffetiveStartDate() {
        return effetiveStartDate;
    }

    public void setEffetiveStartDate(Date effetiveStartDate) {
        this.effetiveStartDate = effetiveStartDate;
    }

    public Date getEffetiveEndDate() {
        return effetiveEndDate;
    }

    public void setEffetiveEndDate(Date effetiveEndDate) {
        this.effetiveEndDate = effetiveEndDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
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

    @Override
    protected Serializable pkVal() {
        return this.versionId;
    }

    @Override
    public String toString() {
        return "PosVer{" +
        ", versionId=" + versionId +
        ", versionName=" + versionName +
        ", versionCate=" + versionCate +
        ", referenceId=" + referenceId +
        ", effetiveStartDate=" + effetiveStartDate +
        ", effetiveEndDate=" + effetiveEndDate +
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
