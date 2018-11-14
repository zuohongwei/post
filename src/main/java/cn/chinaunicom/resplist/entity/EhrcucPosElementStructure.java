package cn.chinaunicom.resplist.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-01
 */
@TableName("ehrcuc_pos_element_structure")
@ApiModel("")
public class EhrcucPosElementStructure extends Model<EhrcucPosElementStructure> {

    private static final long serialVersionUID = 1L;

    @TableId("STRUCTURE_ID")
    private BigDecimal structureId;
    @TableField("VERSION_ID")
    private BigDecimal versionId;
    @TableField("ELEMENT_ID_PARENT")
    private BigDecimal elementIdParent;
    @TableField("ELEMENT_ID_CHILD")
    private BigDecimal elementIdChild;
    @TableField("CREATED_BY")
    private BigDecimal createdBy;
    @TableField("CREATION_DATE")
    private Date creationDate;
    @TableField("LAST_UPDATED_BY")
    private BigDecimal lastUpdatedBy;
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


    public BigDecimal getStructureId() {
        return structureId;
    }

    public void setStructureId(BigDecimal structureId) {
        this.structureId = structureId;
    }

    public BigDecimal getVersionId() {
        return versionId;
    }

    public void setVersionId(BigDecimal versionId) {
        this.versionId = versionId;
    }

    public BigDecimal getElementIdParent() {
        return elementIdParent;
    }

    public void setElementIdParent(BigDecimal elementIdParent) {
        this.elementIdParent = elementIdParent;
    }

    public BigDecimal getElementIdChild() {
        return elementIdChild;
    }

    public void setElementIdChild(BigDecimal elementIdChild) {
        this.elementIdChild = elementIdChild;
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

    @Override
    protected Serializable pkVal() {
        return this.structureId;
    }

    @Override
    public String toString() {
        return "EhrcucPosElementStructure{" +
        ", structureId=" + structureId +
        ", versionId=" + versionId +
        ", elementIdParent=" + elementIdParent +
        ", elementIdChild=" + elementIdChild +
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
