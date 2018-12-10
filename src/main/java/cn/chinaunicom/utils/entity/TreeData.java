package cn.chinaunicom.utils.entity;

import java.util.List;
/**
 *
 * @author wangrunpu
 * @since 2018-10-24
 */
public class TreeData {

	private String value;
	
	private String pid;
	
	private String title;
	
	private String key;
	
	private String id;
	
	private List<TreeData> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return title;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKey() {
		return id;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<TreeData> getChildren() {
		return children;
	}

	public void setChildren(List<TreeData> children) {
		this.children = children;
	}

}
