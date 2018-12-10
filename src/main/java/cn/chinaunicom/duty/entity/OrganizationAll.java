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
 * 组织信息表
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
@TableName("ehrbase_organization_all")
@ApiModel("组织信息表")
public class OrganizationAll extends Model<OrganizationAll> {

    private static final long serialVersionUID = 1L;

    /**
     * 组织Id
     */
     @ApiModelProperty(value="组织Id")
    @TableId("ORGANIZATION_ID")
    private Integer organizationId;
    /**
     * 组织名称
     */
     @ApiModelProperty(value="组织名称")
    @TableField("NAME")
    private String name;
    /**
     * 组织类型
     */
     @ApiModelProperty(value="组织类型")
    @TableField("TYPE")
    private String type;
    /**
     * 直接子部门数量
     */
     @ApiModelProperty(value="直接子部门数量")
    @TableField("SUB_COUNT")
    private Integer subCount;
    /**
     * 在组织树中的层次
     */
     @ApiModelProperty(value="在组织树中的层次")
    @TableField("LEV")
    private Integer lev;
    /**
     * 父组织Id
     */
     @ApiModelProperty(value="父组织Id")
    @TableField("ORGANIZATION_ID_PARENT")
    private Integer organizationIdParent;
    /**
     * 组织有效起始时间
     */
     @ApiModelProperty(value="组织有效起始时间")
    @TableField("DATE_FROM")
    private Date dateFrom;
    /**
     * 组织有效结束时间
     */
     @ApiModelProperty(value="组织有效结束时间")
    @TableField("DATE_TO")
    private Date dateTo;
    /**
     * 组织排序号
     */
     @ApiModelProperty(value="组织排序号")
    @TableField("CNC_ORG_SORT_CODE")
    private String cncOrgSortCode;
    /**
     * 南方/北方/子公司
     */
     @ApiModelProperty(value="南方/北方/子公司")
    @TableField("CNC_SOUTH_NORTH")
    private String cncSouthNorth;
    /**
     * 是否属于上市/非上市/存续
     */
     @ApiModelProperty(value="是否属于上市/非上市/存续")
    @TableField("CNC_CUNXU_SHIYE")
    private String cncCunxuShiye;
    /**
     * 所属省份
     */
     @ApiModelProperty(value="所属省份")
    @TableField("CNC_ORG_PROVINCE")
    private String cncOrgProvince;
    /**
     * 存续/实业组织对应省公司
     */
     @ApiModelProperty(value="存续/实业组织对应省公司")
    @TableField("CNC_BRANCH_NAME")
    private String cncBranchName;
    /**
     * 组织编码
     */
     @ApiModelProperty(value="组织编码")
    @TableField("CNC_ORG_CODE")
    private String cncOrgCode;
    /**
     * 组织撤销发文时间
     */
     @ApiModelProperty(value="组织撤销发文时间")
    @TableField("CNC_DISABLE_DATE")
    private String cncDisableDate;
    /**
     * 组织层级
     */
     @ApiModelProperty(value="组织层级")
    @TableField("CNC_ORG_LEVEL")
    private String cncOrgLevel;
    /**
     * 虚拟组织
     */
     @ApiModelProperty(value="虚拟组织")
    @TableField("CNC_VIRTUAL_ORG")
    private String cncVirtualOrg;
    /**
     * 组织全程
     */
     @ApiModelProperty(value="组织全程")
    @TableField("CNC_ORG_FULLNAME")
    private String cncOrgFullname;
    /**
     * 1级组织
     */
     @ApiModelProperty(value="1级组织")
    @TableField("ORG1")
    private Integer org1;
    /**
     * 2级组织
     */
     @ApiModelProperty(value="2级组织")
    @TableField("ORG2")
    private Integer org2;
    /**
     * 3级组织
     */
     @ApiModelProperty(value="3级组织")
    @TableField("ORG3")
    private Integer org3;
    /**
     * 4级组织
     */
     @ApiModelProperty(value="4级组织")
    @TableField("ORG4")
    private Integer org4;
    /**
     * 5级组织
     */
     @ApiModelProperty(value="5级组织")
    @TableField("ORG5")
    private Integer org5;
    /**
     * 6级组织
     */
     @ApiModelProperty(value="6级组织")
    @TableField("ORG6")
    private Integer org6;
    /**
     * 7级组织
     */
     @ApiModelProperty(value="7级组织")
    @TableField("ORG7")
    private Integer org7;
    /**
     * 8级组织
     */
     @ApiModelProperty(value="8级组织")
    @TableField("ORG8")
    private Integer org8;
    /**
     * 9级组织
     */
     @ApiModelProperty(value="9级组织")
    @TableField("ORG9")
    private Integer org9;
    /**
     * 10级组织
     */
     @ApiModelProperty(value="10级组织")
    @TableField("ORG10")
    private Integer org10;
    @TableField("CREATE_BY")
    private Integer createBy;
    @TableField("CREATE_DATE")
    private Date createDate;
    @TableField("UPDATE_BY")
    private Integer updateBy;
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
    @TableField("ATTRIBUTE11")
    private String attribute11;
    @TableField("ATTRIBUTE12")
    private String attribute12;
    @TableField("ATTRIBUTE13")
    private String attribute13;
    @TableField("ATTRIBUTE14")
    private String attribute14;
    @TableField("ATTRIBUTE15")
    private String attribute15;
    @TableField("ATTRIBUTE16")
    private String attribute16;
    @TableField("ATTRIBUTE17")
    private String attribute17;
    @TableField("ATTRIBUTE18")
    private String attribute18;
    @TableField("ATTRIBUTE19")
    private String attribute19;
    @TableField("ATTRIBUTE20")
    private String attribute20;
    /**
     * 最小基层单元
     */
     @ApiModelProperty(value="最小基层单元")
    @TableField("CUC_ORG_MIN")
    private String cucOrgMin;
    /**
     * 国际公司业务线(国际公司专用）
     */
     @ApiModelProperty(value="国际公司业务线(国际公司专用）")
    @TableField("CUG_ORG_LOB")
    private String cugOrgLob;
    /**
     * 业务组ID
     */
     @ApiModelProperty(value="业务组ID")
    @TableField("BUSINESS_GROUP_ID")
    private Integer businessGroupId;
    /**
     * 组织更名(先撤销后新增)时新组织记录原组织ID
     */
     @ApiModelProperty(value="组织更名(先撤销后新增)时新组织记录原组织ID")
    @TableField("CUC_ORI_ORG_ID")
    private String cucOriOrgId;
    /**
     * 组织更名-新组织ID
     */
     @ApiModelProperty(value="组织更名-新组织ID")
    @TableField("CUC_NEW_ORG_ID")
    private String cucNewOrgId;


    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSubCount() {
        return subCount;
    }

    public void setSubCount(Integer subCount) {
        this.subCount = subCount;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getOrganizationIdParent() {
        return organizationIdParent;
    }

    public void setOrganizationIdParent(Integer organizationIdParent) {
        this.organizationIdParent = organizationIdParent;
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

    public String getCncOrgSortCode() {
        return cncOrgSortCode;
    }

    public void setCncOrgSortCode(String cncOrgSortCode) {
        this.cncOrgSortCode = cncOrgSortCode;
    }

    public String getCncSouthNorth() {
        return cncSouthNorth;
    }

    public void setCncSouthNorth(String cncSouthNorth) {
        this.cncSouthNorth = cncSouthNorth;
    }

    public String getCncCunxuShiye() {
        return cncCunxuShiye;
    }

    public void setCncCunxuShiye(String cncCunxuShiye) {
        this.cncCunxuShiye = cncCunxuShiye;
    }

    public String getCncOrgProvince() {
        return cncOrgProvince;
    }

    public void setCncOrgProvince(String cncOrgProvince) {
        this.cncOrgProvince = cncOrgProvince;
    }

    public String getCncBranchName() {
        return cncBranchName;
    }

    public void setCncBranchName(String cncBranchName) {
        this.cncBranchName = cncBranchName;
    }

    public String getCncOrgCode() {
        return cncOrgCode;
    }

    public void setCncOrgCode(String cncOrgCode) {
        this.cncOrgCode = cncOrgCode;
    }

    public String getCncDisableDate() {
        return cncDisableDate;
    }

    public void setCncDisableDate(String cncDisableDate) {
        this.cncDisableDate = cncDisableDate;
    }

    public String getCncOrgLevel() {
        return cncOrgLevel;
    }

    public void setCncOrgLevel(String cncOrgLevel) {
        this.cncOrgLevel = cncOrgLevel;
    }

    public String getCncVirtualOrg() {
        return cncVirtualOrg;
    }

    public void setCncVirtualOrg(String cncVirtualOrg) {
        this.cncVirtualOrg = cncVirtualOrg;
    }

    public String getCncOrgFullname() {
        return cncOrgFullname;
    }

    public void setCncOrgFullname(String cncOrgFullname) {
        this.cncOrgFullname = cncOrgFullname;
    }

    public Integer getOrg1() {
        return org1;
    }

    public void setOrg1(Integer org1) {
        this.org1 = org1;
    }

    public Integer getOrg2() {
        return org2;
    }

    public void setOrg2(Integer org2) {
        this.org2 = org2;
    }

    public Integer getOrg3() {
        return org3;
    }

    public void setOrg3(Integer org3) {
        this.org3 = org3;
    }

    public Integer getOrg4() {
        return org4;
    }

    public void setOrg4(Integer org4) {
        this.org4 = org4;
    }

    public Integer getOrg5() {
        return org5;
    }

    public void setOrg5(Integer org5) {
        this.org5 = org5;
    }

    public Integer getOrg6() {
        return org6;
    }

    public void setOrg6(Integer org6) {
        this.org6 = org6;
    }

    public Integer getOrg7() {
        return org7;
    }

    public void setOrg7(Integer org7) {
        this.org7 = org7;
    }

    public Integer getOrg8() {
        return org8;
    }

    public void setOrg8(Integer org8) {
        this.org8 = org8;
    }

    public Integer getOrg9() {
        return org9;
    }

    public void setOrg9(Integer org9) {
        this.org9 = org9;
    }

    public Integer getOrg10() {
        return org10;
    }

    public void setOrg10(Integer org10) {
        this.org10 = org10;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
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

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute16() {
        return attribute16;
    }

    public void setAttribute16(String attribute16) {
        this.attribute16 = attribute16;
    }

    public String getAttribute17() {
        return attribute17;
    }

    public void setAttribute17(String attribute17) {
        this.attribute17 = attribute17;
    }

    public String getAttribute18() {
        return attribute18;
    }

    public void setAttribute18(String attribute18) {
        this.attribute18 = attribute18;
    }

    public String getAttribute19() {
        return attribute19;
    }

    public void setAttribute19(String attribute19) {
        this.attribute19 = attribute19;
    }

    public String getAttribute20() {
        return attribute20;
    }

    public void setAttribute20(String attribute20) {
        this.attribute20 = attribute20;
    }

    public String getCucOrgMin() {
        return cucOrgMin;
    }

    public void setCucOrgMin(String cucOrgMin) {
        this.cucOrgMin = cucOrgMin;
    }

    public String getCugOrgLob() {
        return cugOrgLob;
    }

    public void setCugOrgLob(String cugOrgLob) {
        this.cugOrgLob = cugOrgLob;
    }

    public Integer getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(Integer businessGroupId) {
        this.businessGroupId = businessGroupId;
    }

    public String getCucOriOrgId() {
        return cucOriOrgId;
    }

    public void setCucOriOrgId(String cucOriOrgId) {
        this.cucOriOrgId = cucOriOrgId;
    }

    public String getCucNewOrgId() {
        return cucNewOrgId;
    }

    public void setCucNewOrgId(String cucNewOrgId) {
        this.cucNewOrgId = cucNewOrgId;
    }

    @Override
    protected Serializable pkVal() {
        return this.organizationId;
    }

    @Override
    public String toString() {
        return "OrganizationAll{" +
        ", organizationId=" + organizationId +
        ", name=" + name +
        ", type=" + type +
        ", subCount=" + subCount +
        ", lev=" + lev +
        ", organizationIdParent=" + organizationIdParent +
        ", dateFrom=" + dateFrom +
        ", dateTo=" + dateTo +
        ", cncOrgSortCode=" + cncOrgSortCode +
        ", cncSouthNorth=" + cncSouthNorth +
        ", cncCunxuShiye=" + cncCunxuShiye +
        ", cncOrgProvince=" + cncOrgProvince +
        ", cncBranchName=" + cncBranchName +
        ", cncOrgCode=" + cncOrgCode +
        ", cncDisableDate=" + cncDisableDate +
        ", cncOrgLevel=" + cncOrgLevel +
        ", cncVirtualOrg=" + cncVirtualOrg +
        ", cncOrgFullname=" + cncOrgFullname +
        ", org1=" + org1 +
        ", org2=" + org2 +
        ", org3=" + org3 +
        ", org4=" + org4 +
        ", org5=" + org5 +
        ", org6=" + org6 +
        ", org7=" + org7 +
        ", org8=" + org8 +
        ", org9=" + org9 +
        ", org10=" + org10 +
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
        ", attribute11=" + attribute11 +
        ", attribute12=" + attribute12 +
        ", attribute13=" + attribute13 +
        ", attribute14=" + attribute14 +
        ", attribute15=" + attribute15 +
        ", attribute16=" + attribute16 +
        ", attribute17=" + attribute17 +
        ", attribute18=" + attribute18 +
        ", attribute19=" + attribute19 +
        ", attribute20=" + attribute20 +
        ", cucOrgMin=" + cucOrgMin +
        ", cugOrgLob=" + cugOrgLob +
        ", businessGroupId=" + businessGroupId +
        ", cucOriOrgId=" + cucOriOrgId +
        ", cucNewOrgId=" + cucNewOrgId +
        "}";
    }
}
