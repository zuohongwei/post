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
 * 岗位说明书
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-28
 */
@TableName("ehrcuc_pos_posdes")
@ApiModel("岗位说明书")
public class PosPosdes extends Model<PosPosdes> {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位说明书ID
     */
     @ApiModelProperty(value="岗位说明书ID")
    @TableId("POSDES_ID")
    private Long posdesId;
    /**
     * 岗位名称
     */
     @ApiModelProperty(value="岗位名称")
    @TableField("POS_NAME")
    private String posName;
    /**
     * 所属部门ID
     */
     @ApiModelProperty(value="所属部门ID")
    @TableField("ORG_ID")
    private Long orgId;
    /**
     * 岗位序列ID
     */
     @ApiModelProperty(value="岗位序列ID")
    @TableField("POS_CATE_ID")
    private Long posCateId;
    /**
     * 子序列ID
     */
     @ApiModelProperty(value="子序列ID")
    @TableField("POS_SUBCATE_ID")
    private Long posSubcateId;
    /**
     * 专业ID
     */
     @ApiModelProperty(value="专业ID")
    @TableField("MAJOR_ID")
    private Long majorId;
    /**
     * 职衔ID
     */
     @ApiModelProperty(value="职衔ID")
    @TableField("JOB_ID")
    private Long jobId;
    /**
     * 职级下限
     */
     @ApiModelProperty(value="职级下限")
    @TableField("POS_LEVEL_LOW")
    private Long posLevelLow;
    /**
     * 职级上限
     */
     @ApiModelProperty(value="职级上限")
    @TableField("POS_LEVEL_HIGH")
    private Long posLevelHigh;
    /**
     * 编制
     */
     @ApiModelProperty(value="编制")
    @TableField("ESTABLISHMENT")
    private Long establishment;
    /**
     * 岗位说明书版本ID
     */
     @ApiModelProperty(value="岗位说明书版本ID")
    @TableField("VERSION_ID")
    private Long versionId;
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
    /**
     * 上级岗位名称
     */
     @ApiModelProperty(value="上级岗位名称")
    @TableField("SUPERIOR_POS_NAME")
    private String superiorPosName;
    /**
     * 下级岗位名称
     */
     @ApiModelProperty(value="下级岗位名称")
    @TableField("INFERIOR_POS_NAME")
    private String inferiorPosName;
    /**
     * 上游岗位名称
     */
     @ApiModelProperty(value="上游岗位名称")
    @TableField("UPSTREAM_POS_NAME")
    private String upstreamPosName;
    /**
     * 下游岗位名称
     */
     @ApiModelProperty(value="下游岗位名称")
    @TableField("DOWNSTREAM_POS_NAME")
    private String downstreamPosName;
    /**
     * 关键职责关系ID
     */
     @ApiModelProperty(value="关键职责关系ID")
    @TableField("RELATION_ID")
    private Long relationId;
    /**
     * 博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码
     */
     @ApiModelProperty(value="博士、硕士研究生（硕士学位）、本科（学士学位）、专科——代码")
    @TableField("EDUCATION_DEGREE")
    private String educationDegree;
    /**
     * 专业知识
     */
     @ApiModelProperty(value="专业知识")
    @TableField("PRO_KNOWLEDGE")
    private String proKnowledge;
    /**
     * 专业知识学科
     */
     @ApiModelProperty(value="专业知识学科")
    @TableField("PRO_KNOWLEDGE_MAJOR")
    private String proKnowledgeMajor;
    /**
     * 各学科知识掌握程度——代码
     */
     @ApiModelProperty(value="各学科知识掌握程度——代码")
    @TableField("PRO_KNOWLEDGE_LEVEL")
    private String proKnowledgeLevel;
    /**
     * 专业技能
     */
     @ApiModelProperty(value="专业技能")
    @TableField("PRO_SKILL")
    private String proSkill;
    /**
     * 专业技能种类
     */
     @ApiModelProperty(value="专业技能种类")
    @TableField("PRO_SKILL_CATE")
    private String proSkillCate;
    /**
     * 各技能种类掌握程度——代码
     */
     @ApiModelProperty(value="各技能种类掌握程度——代码")
    @TableField("PRO_SKILL_LEVEL")
    private String proSkillLevel;
    /**
     * 年龄上限
     */
     @ApiModelProperty(value="年龄上限")
    @TableField("AGE_LOW")
    private Long ageLow;
    /**
     * 年龄上限
     */
     @ApiModelProperty(value="年龄上限")
    @TableField("AGE_HIGH")
    private Long ageHigh;
    /**
     * 工作层面——集团（是、否）
     */
     @ApiModelProperty(value="工作层面——集团（是、否）")
    @TableField("JOB_LEVEL_JT")
    private String jobLevelJt;
    /**
     * 集团层面工作年限
     */
     @ApiModelProperty(value="集团层面工作年限")
    @TableField("JOB_LEVEL_JT_YEAR")
    private Long jobLevelJtYear;
    /**
     * 工作层面——省公司（是、否）
     */
     @ApiModelProperty(value="工作层面——省公司（是、否）")
    @TableField("JOB_LEVEL_S")
    private String jobLevelS;
    /**
     * 省公司层面工作年限
     */
     @ApiModelProperty(value="省公司层面工作年限")
    @TableField("JOB_LEVEL_S_YEAR")
    private Long jobLevelSYear;
    /**
     * 工作层面——市公司（是、否）
     */
     @ApiModelProperty(value="工作层面——市公司（是、否）")
    @TableField("JOB_LEVEL_DS")
    private String jobLevelDs;
    /**
     * 市公司层面工作年限
     */
     @ApiModelProperty(value="市公司层面工作年限")
    @TableField("JOB_LEVEL_DS_YEAR")
    private Long jobLevelDsYear;
    /**
     * 工作层面——不限层面（是、否）
     */
     @ApiModelProperty(value="工作层面——不限层面（是、否）")
    @TableField("JOB_LEVEL_NOLIMIT")
    private String jobLevelNolimit;
    /**
     * 不限层面工作年限
     */
     @ApiModelProperty(value="不限层面工作年限")
    @TableField("JOB_LEVEL_NOLIMIT_YEAR")
    private Long jobLevelNolimitYear;
    /**
     * 工种
     */
     @ApiModelProperty(value="工种")
    @TableField("JOB_CATE")
    private String jobCate;
    /**
     * 工种等级
     */
     @ApiModelProperty(value="工种等级")
    @TableField("JOB_CATE_LEVEL")
    private String jobCateLevel;
    /**
     * 专业资格
     */
     @ApiModelProperty(value="专业资格")
    @TableField("PRO_QUALIFICATION")
    private String proQualification;
    /**
     * 专业资格等级
     */
     @ApiModelProperty(value="专业资格等级")
    @TableField("PRO_QUALIFICATION_LEVEL")
    private String proQualificationLevel;
    /**
     * 其他要求
     */
     @ApiModelProperty(value="其他要求")
    @TableField("OTHER_DEMAND")
    private String otherDemand;
    /**
     * 关键业绩指标
     */
     @ApiModelProperty(value="关键业绩指标")
    @TableField("KPI")
    private String kpi;
    /**
     * 专业技术职务
     */
     @ApiModelProperty(value="专业技术职务")
    @TableField("POST")
    private String post;
    /**
     * 专业技术职务等级
     */
     @ApiModelProperty(value="专业技术职务等级")
    @TableField("POST_LEVEL")
    private String postLevel;
    /**
     * 创建人
     */
     @ApiModelProperty(value="创建人")
    @TableField("CREATED_BY")
    private Integer createdBy;
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
    private Integer lastUpdatedBy;
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
    @TableField("POS_ID")
    private Long posId;

    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String elementName;
    @TableField(exist = false)
    private String elementId;

   // ---------------------------------------------------------------------------------------------------------------------

    @TableField(exist = false)
    private String orgName;
    @TableField(exist = false)
    private String flexValue;
    @TableField(exist = false)
    private String jobName;
    @TableField(exist = false)
    private String jobCateName;
    @TableField(exist = false)
    private String jobCateLevelName;
    @TableField(exist = false)
    private String postName;
    @TableField(exist = false)
    private String postLevelName;
    @TableField(exist = false)
    private String proQualificationName;
    @TableField(exist = false)
    private String proQualificationLevelName;
    @TableField(exist = false)
    private String effetiveStartDate;
    @TableField(exist = false)
    private String effetiveEndDate;



    @TableField(exist = false)
    private String keyRespId;
    @TableField(exist = false)
    private String mname;
    @TableField(exist = false)
    private String mid;
    @TableField(exist = false)
    private String keyRespName;
    @TableField(exist = false)
    private String orderNum;


    public String getKeyRespId() {
        return keyRespId;
    }

    public void setKeyRespId(String keyRespId) {
        this.keyRespId = keyRespId;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getKeyRespName() {
        return keyRespName;
    }

    public void setKeyRespName(String keyRespName) {
        this.keyRespName = keyRespName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getFlexValue() {
        return flexValue;
    }

    public void setFlexValue(String flexValue) {
        this.flexValue = flexValue;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobCateName() {
        return jobCateName;
    }

    public void setJobCateName(String jobCateName) {
        this.jobCateName = jobCateName;
    }

    public String getJobCateLevelName() {
        return jobCateLevelName;
    }

    public void setJobCateLevelName(String jobCateLevelName) {
        this.jobCateLevelName = jobCateLevelName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostLevelName() {
        return postLevelName;
    }

    public void setPostLevelName(String postLevelName) {
        this.postLevelName = postLevelName;
    }

    public String getProQualificationName() {
        return proQualificationName;
    }

    public void setProQualificationName(String proQualificationName) {
        this.proQualificationName = proQualificationName;
    }

    public String getProQualificationLevelName() {
        return proQualificationLevelName;
    }

    public void setProQualificationLevelName(String proQualificationLevelName) {
        this.proQualificationLevelName = proQualificationLevelName;
    }

    public String getEffetiveStartDate() {
        return effetiveStartDate;
    }

    public void setEffetiveStartDate(String effetiveStartDate) {
        this.effetiveStartDate = effetiveStartDate;
    }

    public String getEffetiveEndDate() {
        return effetiveEndDate;
    }

    public void setEffetiveEndDate(String effetiveEndDate) {
        this.effetiveEndDate = effetiveEndDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public Long getPosdesId() {
        return posdesId;
    }

    public void setPosdesId(Long posdesId) {
        this.posdesId = posdesId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getPosCateId() {
        return posCateId;
    }

    public void setPosCateId(Long posCateId) {
        this.posCateId = posCateId;
    }

    public Long getPosSubcateId() {
        return posSubcateId;
    }

    public void setPosSubcateId(Long posSubcateId) {
        this.posSubcateId = posSubcateId;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getPosLevelLow() {
        return posLevelLow;
    }

    public void setPosLevelLow(Long posLevelLow) {
        this.posLevelLow = posLevelLow;
    }

    public Long getPosLevelHigh() {
        return posLevelHigh;
    }

    public void setPosLevelHigh(Long posLevelHigh) {
        this.posLevelHigh = posLevelHigh;
    }

    public Long getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Long establishment) {
        this.establishment = establishment;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
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

    public String getSuperiorPosName() {
        return superiorPosName;
    }

    public void setSuperiorPosName(String superiorPosName) {
        this.superiorPosName = superiorPosName;
    }

    public String getInferiorPosName() {
        return inferiorPosName;
    }

    public void setInferiorPosName(String inferiorPosName) {
        this.inferiorPosName = inferiorPosName;
    }

    public String getUpstreamPosName() {
        return upstreamPosName;
    }

    public void setUpstreamPosName(String upstreamPosName) {
        this.upstreamPosName = upstreamPosName;
    }

    public String getDownstreamPosName() {
        return downstreamPosName;
    }

    public void setDownstreamPosName(String downstreamPosName) {
        this.downstreamPosName = downstreamPosName;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getProKnowledge() {
        return proKnowledge;
    }

    public void setProKnowledge(String proKnowledge) {
        this.proKnowledge = proKnowledge;
    }

    public String getProKnowledgeMajor() {
        return proKnowledgeMajor;
    }

    public void setProKnowledgeMajor(String proKnowledgeMajor) {
        this.proKnowledgeMajor = proKnowledgeMajor;
    }

    public String getProKnowledgeLevel() {
        return proKnowledgeLevel;
    }

    public void setProKnowledgeLevel(String proKnowledgeLevel) {
        this.proKnowledgeLevel = proKnowledgeLevel;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public String getProSkillCate() {
        return proSkillCate;
    }

    public void setProSkillCate(String proSkillCate) {
        this.proSkillCate = proSkillCate;
    }

    public String getProSkillLevel() {
        return proSkillLevel;
    }

    public void setProSkillLevel(String proSkillLevel) {
        this.proSkillLevel = proSkillLevel;
    }

    public Long getAgeLow() {
        return ageLow;
    }

    public void setAgeLow(Long ageLow) {
        this.ageLow = ageLow;
    }

    public Long getAgeHigh() {
        return ageHigh;
    }

    public void setAgeHigh(Long ageHigh) {
        this.ageHigh = ageHigh;
    }

    public String getJobLevelJt() {
        return jobLevelJt;
    }

    public void setJobLevelJt(String jobLevelJt) {
        this.jobLevelJt = jobLevelJt;
    }

    public Long getJobLevelJtYear() {
        return jobLevelJtYear;
    }

    public void setJobLevelJtYear(Long jobLevelJtYear) {
        this.jobLevelJtYear = jobLevelJtYear;
    }

    public String getJobLevelS() {
        return jobLevelS;
    }

    public void setJobLevelS(String jobLevelS) {
        this.jobLevelS = jobLevelS;
    }

    public Long getJobLevelSYear() {
        return jobLevelSYear;
    }

    public void setJobLevelSYear(Long jobLevelSYear) {
        this.jobLevelSYear = jobLevelSYear;
    }

    public String getJobLevelDs() {
        return jobLevelDs;
    }

    public void setJobLevelDs(String jobLevelDs) {
        this.jobLevelDs = jobLevelDs;
    }

    public Long getJobLevelDsYear() {
        return jobLevelDsYear;
    }

    public void setJobLevelDsYear(Long jobLevelDsYear) {
        this.jobLevelDsYear = jobLevelDsYear;
    }

    public String getJobLevelNolimit() {
        return jobLevelNolimit;
    }

    public void setJobLevelNolimit(String jobLevelNolimit) {
        this.jobLevelNolimit = jobLevelNolimit;
    }

    public Long getJobLevelNolimitYear() {
        return jobLevelNolimitYear;
    }

    public void setJobLevelNolimitYear(Long jobLevelNolimitYear) {
        this.jobLevelNolimitYear = jobLevelNolimitYear;
    }

    public String getJobCate() {
        return jobCate;
    }

    public void setJobCate(String jobCate) {
        this.jobCate = jobCate;
    }

    public String getJobCateLevel() {
        return jobCateLevel;
    }

    public void setJobCateLevel(String jobCateLevel) {
        this.jobCateLevel = jobCateLevel;
    }

    public String getProQualification() {
        return proQualification;
    }

    public void setProQualification(String proQualification) {
        this.proQualification = proQualification;
    }

    public String getProQualificationLevel() {
        return proQualificationLevel;
    }

    public void setProQualificationLevel(String proQualificationLevel) {
        this.proQualificationLevel = proQualificationLevel;
    }

    public String getOtherDemand() {
        return otherDemand;
    }

    public void setOtherDemand(String otherDemand) {
        this.otherDemand = otherDemand;
    }

    public String getKpi() {
        return kpi;
    }

    public void setKpi(String kpi) {
        this.kpi = kpi;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
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

    public Long getPosId() {
        return posId;
    }

    public void setPosId(Long posId) {
        this.posId = posId;
    }

    @Override
    protected Serializable pkVal() {
        return this.posdesId;
    }

    @Override
    public String toString() {
        return "PosPosdes{" +
        ", posdesId=" + posdesId +
        ", posName=" + posName +
        ", orgId=" + orgId +
        ", posCateId=" + posCateId +
        ", posSubcateId=" + posSubcateId +
        ", majorId=" + majorId +
        ", jobId=" + jobId +
        ", posLevelLow=" + posLevelLow +
        ", posLevelHigh=" + posLevelHigh +
        ", establishment=" + establishment +
        ", versionId=" + versionId +
        ", activeStartDate=" + activeStartDate +
        ", activeEndDate=" + activeEndDate +
        ", superiorPosName=" + superiorPosName +
        ", inferiorPosName=" + inferiorPosName +
        ", upstreamPosName=" + upstreamPosName +
        ", downstreamPosName=" + downstreamPosName +
        ", relationId=" + relationId +
        ", educationDegree=" + educationDegree +
        ", proKnowledge=" + proKnowledge +
        ", proKnowledgeMajor=" + proKnowledgeMajor +
        ", proKnowledgeLevel=" + proKnowledgeLevel +
        ", proSkill=" + proSkill +
        ", proSkillCate=" + proSkillCate +
        ", proSkillLevel=" + proSkillLevel +
        ", ageLow=" + ageLow +
        ", ageHigh=" + ageHigh +
        ", jobLevelJt=" + jobLevelJt +
        ", jobLevelJtYear=" + jobLevelJtYear +
        ", jobLevelS=" + jobLevelS +
        ", jobLevelSYear=" + jobLevelSYear +
        ", jobLevelDs=" + jobLevelDs +
        ", jobLevelDsYear=" + jobLevelDsYear +
        ", jobLevelNolimit=" + jobLevelNolimit +
        ", jobLevelNolimitYear=" + jobLevelNolimitYear +
        ", jobCate=" + jobCate +
        ", jobCateLevel=" + jobCateLevel +
        ", proQualification=" + proQualification +
        ", proQualificationLevel=" + proQualificationLevel +
        ", otherDemand=" + otherDemand +
        ", kpi=" + kpi +
        ", post=" + post +
        ", postLevel=" + postLevel +
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
        ", posId=" + posId +
        "}";
    }
}
