package cn.chinaunicom.duty.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * ************************************** 描述: (关键职责库查询前端对应字段)
 * 
 * @ClassName: cn.chinaunicom.duty.entity.PosElementEmp
 * @author lizhenhao
 * @version V1.0
 ***************************************
 */

public class PosElementEmp {
	@Excel(
			name = "岗位序列")
	private String	seq;
	@Excel(
			name = "子序列")
	private String	cseq;
	@Excel(
			name = "专业")
	private String	major;
	@Excel(
			name = "关键职责")
	private String	keyresp;
	@Excel(
			name = "学历")
	private String	etu;
	@Excel(
			name = "工作经验")
	private String	workexp;
	@Excel(
			name = "是否核心")
	private String	iscore;
	private String	jzrank;
	private String	jtrank;
	private String	sfrank;
	private String	dsrank;
	private String	qxrank;
	@Excel(
			name = "子职责")
	private String	ckeyresp;
	@Excel(
			name = "组织层级")
	private String	leveltype;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getCseq() {
		return cseq;
	}

	public void setCseq(String cseq) {
		this.cseq = cseq;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getKeyresp() {
		return keyresp;
	}

	public void setKeyresp(String keyresp) {
		this.keyresp = keyresp;
	}

	public String getEtu() {
		return etu;
	}

	public void setEtu(String etu) {
		this.etu = etu;
	}

	public String getWorkexp() {
		return workexp;
	}

	public void setWorkexp(String workexp) {
		this.workexp = workexp;
	}

	public String getIscore() {
		return iscore;
	}

	public void setIscore(String iscore) {
		this.iscore = iscore;
	}

	public String getJzrank() {
		return jzrank;
	}

	public void setJzrank(String jzrank) {
		this.jzrank = jzrank;
	}

	public String getJtrank() {
		return jtrank;
	}

	public void setJtrank(String jtrank) {
		this.jtrank = jtrank;
	}

	public String getSfrank() {
		return sfrank;
	}

	public void setSfrank(String sfrank) {
		this.sfrank = sfrank;
	}

	public String getDsrank() {
		return dsrank;
	}

	public void setDsrank(String dsrank) {
		this.dsrank = dsrank;
	}

	public String getQxrank() {
		return qxrank;
	}

	public void setQxrank(String qxrank) {
		this.qxrank = qxrank;
	}

	public String getCkeyresp() {
		return ckeyresp;
	}

	public void setCkeyresp(String ckeyresp) {
		this.ckeyresp = ckeyresp;
	}

	public String getLeveltype() {
		return leveltype;
	}

	public void setLeveltype(String leveltype) {
		this.leveltype = leveltype;
	}

}
