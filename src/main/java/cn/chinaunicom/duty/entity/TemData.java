package cn.chinaunicom.duty.entity;

/**
 * ************************************** 描述: (接受前台字段实体类)
 * 
 * @ClassName: cn.chinaunicom.duty.entity.TemData
 * @author lizhenhao
 * @version V1.0
 ***************************************
 */
public class TemData {

	private String	elementId;
	private String	elementName;
	private String	elementCode;
	private String	parentId;

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementCode() {
		return elementCode;
	}

	public void setElementCode(String elementCode) {
		this.elementCode = elementCode;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
