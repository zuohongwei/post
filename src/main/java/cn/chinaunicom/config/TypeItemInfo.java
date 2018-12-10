package cn.chinaunicom.config;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**基础信息类
 * @author MR.zhang_ccc on 2018-11-08.
 * @version 1.0
 */
@TableName("ehrcuc_pos_element")
public class TypeItemInfo implements Serializable {

    private String elementId;
    @TableField("ELEMENT_NAME")
    private String elementName;
    private String itemDesc;
    private long rowNumber;

    public String getItemDesc() {
        return itemDesc;
    }
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

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

    public long getRowNumber() {
        return rowNumber;
    }
    public void setRowNumber(long rowNumber) {
        this.rowNumber = rowNumber;
    }

}