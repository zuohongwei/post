package cn.chinaunicom.postionmanagement.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 职位体系版本
 * @author wangrunpu-
 *
 */
public class PosVersionInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long versionId;
	private String versionName;
	private String versionCate;
	private Long referenceId;
	private Date effetiveStartDate;
	private Date effetiveEndDate;
	private Long createdBy;
	private Date creationDate;
	
	/**
	 * 员工分配指定版本所分配的关键职责
	 * @return
	 */
	private List<PosEmpElementInfo> empAssElementList;
	
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
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
	public Long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Long referenceId) {
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
	public void setEmpAssElementList(List<PosEmpElementInfo> empAssElementList) {
		this.empAssElementList = empAssElementList;
	}
	public List<PosEmpElementInfo> getEmpAssElementList() {
		return empAssElementList;
	}
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

}
