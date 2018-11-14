package cn.chinaunicom.duty.entity;

import java.util.Date;
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
 * @since 2018-11-08
 */
@TableName("ehrcuc_pos_emp_element")
@ApiModel("")
public class PosEmpElement extends Model<PosEmpElement> {

    private static final long serialVersionUID = 1L;

    @TableField("ASSIGMENT_ID")
    private Integer assigmentId;
    @TableField("VERSION_ID")
    private Integer versionId;
    @TableField("PERSON_ID")
    private Integer personId;
    @TableField("EBS_ASS_ID")
    private Integer ebsAssId;
    @TableField("ELEMENT_ID")
    private Integer elementId;
    @TableField("ROLE_ID")
    private String roleId;
    @TableField("OBJECT_ID")
    private Integer objectId;
    @TableField("WEIGHT")
    private Integer weight;
    @TableField("ANALYSE_CONCATENATE")
    private String analyseConcatenate;
    @TableField("USE_CONCATENATE")
    private String useConcatenate;
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
    @TableField("SUB_RESP_STR")
    private String subRespStr;


    public Integer getAssigmentId() {
        return assigmentId;
    }

    public void setAssigmentId(Integer assigmentId) {
        this.assigmentId = assigmentId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getEbsAssId() {
        return ebsAssId;
    }

    public void setEbsAssId(Integer ebsAssId) {
        this.ebsAssId = ebsAssId;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAnalyseConcatenate() {
        return analyseConcatenate;
    }

    public void setAnalyseConcatenate(String analyseConcatenate) {
        this.analyseConcatenate = analyseConcatenate;
    }

    public String getUseConcatenate() {
        return useConcatenate;
    }

    public void setUseConcatenate(String useConcatenate) {
        this.useConcatenate = useConcatenate;
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

    public String getSubRespStr() {
        return subRespStr;
    }

    public void setSubRespStr(String subRespStr) {
        this.subRespStr = subRespStr;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "PosEmpElement{" +
        ", assigmentId=" + assigmentId +
        ", versionId=" + versionId +
        ", personId=" + personId +
        ", ebsAssId=" + ebsAssId +
        ", elementId=" + elementId +
        ", roleId=" + roleId +
        ", objectId=" + objectId +
        ", weight=" + weight +
        ", analyseConcatenate=" + analyseConcatenate +
        ", useConcatenate=" + useConcatenate +
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
        ", subRespStr=" + subRespStr +
        "}";
    }
}
