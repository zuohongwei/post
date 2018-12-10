package cn.chinaunicom.postionmanagement.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 员工职责分配实体类
 * @author wangrunpu
 */
public class PosEmpElementInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long assigmentId;
	private Long versionId;
	private Long personId;
	private Long ebsAssId;
	private Long elementId;
	private String roleId;
	private Long weight;
	private Long createdBy;
	private Date creationDate;
	private String elementName;
	
	private Long lastUpdatedBy;
	private Date lastUpdateDate;
	private String attribute1;
	private String attribute2;
	private String attribute3;
	private String attribute4;
	private String attribute5;
	private String attribute6;
	private String attribute7;
	private String attribute8;
	private String attribute9;
	private String attribute10;
	
	private String roleName;
	
	private Long objectId;
	
	//private List<PosObjectInfo> objectList;
	
	private String empName;
	
	/**
	 * 岗位序列ID.子序列Id.专业ID.关键职责ID  组合
	 */
	private String analyseConcatenate;
	
	/**
	 * 岗位序列ID.子序列Id.专业ID.关键职责ID  组合
	 */
	private String useConcatenate;
	/**
	 * 子职责组合 example ".22.25.223."
	 */
	private String subRespStr;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getObjectId() {
		return objectId;
	}
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	private String objectName;
	
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
	public Long getAssigmentId() {
		return assigmentId;
	}
	public void setAssigmentId(Long assigmentId) {
		this.assigmentId = assigmentId;
	}
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public Long getEbsAssId() {
		return ebsAssId;
	}
	public void setEbsAssId(Long ebsAssId) {
		this.ebsAssId = ebsAssId;
	}
	public Long getElementId() {
		return elementId;
	}
	public void setElementId(Long elementId) {
		this.elementId = elementId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(Long lastUpdatedBy) {
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
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	public String getElementName() {
		return elementName;
	}
	/*public void setObjectList(List<PosObjectInfo> objectList) {
		this.objectList = objectList;
	}
	public List<PosObjectInfo> getObjectList() {
		return objectList;
	}*/
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
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
	
	public void setSubRespStr(String subRespStr) {
		this.subRespStr = subRespStr;
	}
	public String getSubRespStr() {
		return subRespStr;
	}
	
}
