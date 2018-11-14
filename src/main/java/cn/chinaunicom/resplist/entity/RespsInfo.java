/****************************************
 * 描述: (关键职责职级信息实体类)
 * 
 * @Title: cn.chinaunicom.servicecfg.entity.RespsInfo.java
 * @author wangrunpu
 * @date 2018年11月8日 下午2:31:51
 ****************************************/
package cn.chinaunicom.resplist.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

/****************************************
 * 描述: (关键职责职级信息实体类)
 * 
 * @ClassName: cn.chinaunicom.servicecfg.entity.RespsInfo
 * @author wangrunpu
 * @version V1.0
 ****************************************/
public class RespsInfo {
	@Excel(name = "岗位序列")
	private String	SEQ;
	
	@Excel(name = "子序列")
	private String	CSEQ;
	
	@Excel(name = "专业")
	private String	MAJOR;
	
	@Excel(name = "关键职责")
	private String	KEYRESP;
	// private String ETU;
	// private String WORKEXP;
	// private String ISCORE;
	@Excel(name = "基准职级")
	private String	JZRANK;
	
	@Excel(name = "集团职级")
	private String	JTRANK;
	
	@Excel(name = "省份职级")
	private String	SFRANK;
	
	@Excel(name = "地市职级")
	private String	DSRANK;
	
	@Excel(name = "区县职级")
	private String	QXRANK;
	// private String ISCORE;
	// private String CKEYRESP;
	
	@Excel(name = "组织层级")
	private String	LEVELTYPE;

	/**
	 * 描述： get方法
	 * 
	 * @return sEQ
	 *
	 */
	public String getSEQ() {
		return SEQ;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param sEQ
	 *            参数sEQ
	 *
	 */
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return cSEQ
	 *
	 */
	public String getCSEQ() {
		return CSEQ;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param cSEQ
	 *            参数cSEQ
	 *
	 */
	public void setCSEQ(String cSEQ) {
		CSEQ = cSEQ;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return mAJOR
	 *
	 */
	public String getMAJOR() {
		return MAJOR;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param mAJOR
	 *            参数mAJOR
	 *
	 */
	public void setMAJOR(String mAJOR) {
		MAJOR = mAJOR;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return kEYRESP
	 *
	 */
	public String getKEYRESP() {
		return KEYRESP;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param kEYRESP
	 *            参数kEYRESP
	 *
	 */
	public void setKEYRESP(String kEYRESP) {
		KEYRESP = kEYRESP;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return jZRANK
	 *
	 */
	public String getJZRANK() {
		return JZRANK;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param jZRANK
	 *            参数jZRANK
	 *
	 */
	public void setJZRANK(String jZRANK) {
		JZRANK = jZRANK;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return jTRANK
	 *
	 */
	public String getJTRANK() {
		return JTRANK;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param jTRANK
	 *            参数jTRANK
	 *
	 */
	public void setJTRANK(String jTRANK) {
		JTRANK = jTRANK;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return sFRANK
	 *
	 */
	public String getSFRANK() {
		return SFRANK;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param sFRANK
	 *            参数sFRANK
	 *
	 */
	public void setSFRANK(String sFRANK) {
		SFRANK = sFRANK;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return dSRANK
	 *
	 */
	public String getDSRANK() {
		return DSRANK;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param dSRANK
	 *            参数dSRANK
	 *
	 */
	public void setDSRANK(String dSRANK) {
		DSRANK = dSRANK;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return qXRANK
	 *
	 */
	public String getQXRANK() {
		return QXRANK;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param qXRANK
	 *            参数qXRANK
	 *
	 */
	public void setQXRANK(String qXRANK) {
		QXRANK = qXRANK;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return lEVELTYPE
	 *
	 */
	public String getLEVELTYPE() {
		return LEVELTYPE;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param lEVELTYPE
	 *            参数lEVELTYPE
	 *
	 */
	public void setLEVELTYPE(String lEVELTYPE) {
		LEVELTYPE = lEVELTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "RespsInfo [SEQ=" + SEQ + ", CSEQ=" + CSEQ + ", MAJOR=" + MAJOR + ", KEYRESP=" + KEYRESP + ", JZRANK=" + JZRANK + ", JTRANK=" + JTRANK + ", SFRANK=" + SFRANK + ", DSRANK=" + DSRANK
				+ ", QXRANK=" + QXRANK + ", LEVELTYPE=" + LEVELTYPE + "]";
	}

}
