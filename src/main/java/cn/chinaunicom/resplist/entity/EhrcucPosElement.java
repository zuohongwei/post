package cn.chinaunicom.resplist.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-01
 */
@TableName("ehrcuc_pos_element")
public class EhrcucPosElement extends Model<EhrcucPosElement> {

    private static final long serialVersionUID = 1L;

    @TableId("ELEMENT_ID")
    private Integer elementId;
    @TableField("ELEMENT_CODE")
    private String elementCode;
    @TableField("ELEMENT_NAME")
    private String elementName;
    @TableField("ELEMENT_TYPE")
    private String elementType;
    @TableField("DATE_FROM")
    private Date dateFrom;
    @TableField("DATE_TO")
    private Date dateTo;
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
    /**
     * 基准职级
     */
    @TableField("ATTRIBUTE5")
    private String attribute5;
    /**
     * 集团职级
     */
    @TableField("ATTRIBUTE6")
    private String attribute6;
    /**
     * 省职级 
     */
    @TableField("ATTRIBUTE7")
    private String attribute7;
    /**
     * 地市职级
     */
    @TableField("ATTRIBUTE8")
    private String attribute8;
    /**
     * 区县职级
     */
    @TableField("ATTRIBUTE9")
    private String attribute9;
    @TableField("ATTRIBUTE10")
    private String attribute10;
    @TableField("ATTRIBUTE11")
    private String attribute11;
    @TableField("ATTRIBUTE12")
    private String attribute12;


    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
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

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    @Override
    protected Serializable pkVal() {
        return this.elementId;
    }

    @Override
    public String toString() {
        return "EhrcucPosElement{" +
        ", elementId=" + elementId +
        ", elementCode=" + elementCode +
        ", elementName=" + elementName +
        ", elementType=" + elementType +
        ", dateFrom=" + dateFrom +
        ", dateTo=" + dateTo +
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
        ", attribute11=" + attribute11 +
        ", attribute12=" + attribute12 +
        "}";
    }
}
