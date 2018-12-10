package cn.chinaunicom.postionmanagement.entity;

import java.io.Serializable;

public class AssignSeniorKeyResp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3326300827821079894L;
	private String name;
	private long assignMentId;
	private String employeeNumber;
	private long personId;
	private String fullName;
	private String jobName;
	private long elementId;
	private long kid;
	private String kname;
	private String idStr;
	private String skStr;
	private long mId;
	private long level;
	private String startDate;
	private String endDate;
	private String mname;
	private long nCount;
	private long orgId;
	private long versonId;
	private String cFlag;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getAssignMentId() {
		return assignMentId;
	}
	public void setAssignMentId(long assignMentId) {
		this.assignMentId = assignMentId;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public long getElementId() {
		return elementId;
	}
	public void setElementId(long elementId) {
		this.elementId = elementId;
	}
	public long getKid() {
		return kid;
	}
	public void setKid(long kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public String getSkStr() {
		return skStr;
	}
	public void setSkStr(String skStr) {
		this.skStr = skStr;
	}
	public long getmId() {
		return mId;
	}
	public void setmId(long mId) {
		this.mId = mId;
	}
	public long getLevel() {
		return level;
	}
	public void setLevel(long level) {
		this.level = level;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public long getnCount() {
		return nCount;
	}
	public void setnCount(long nCount) {
		this.nCount = nCount;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	public long getVersonId() {
		return versonId;
	}
	public void setVersonId(long versonId) {
		this.versonId = versonId;
	}
	public String getcFlag() {
		return cFlag;
	}
	public void setcFlag(String cFlag) {
		this.cFlag = cFlag;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
