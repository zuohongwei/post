package cn.chinaunicom.duty.entity;

import java.util.ArrayList;
import java.util.List;

public class PosElementWeb {
    private String posCateId;
    private String posCateName;
    private String elementType;
    private int elementCode;
    private String parentId;
    private String posSubCateCount;


    private List<PosElementStructure> children = new ArrayList<>();


    public String getPosCateId() {
        return posCateId;
    }

    public void setPosCateId(String posCateId) {
        this.posCateId = posCateId;
    }

    public String getPosCateName() {
        return posCateName;
    }

    public void setPosCateName(String posCateName) {
        this.posCateName = posCateName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getElementCode() {
        return elementCode;
    }

    public void setElementCode(int elementCode) {
        this.elementCode = elementCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPosSubCateCount() {
        return posSubCateCount;
    }

    public void setPosSubCateCount(String posSubCateCount) {
        this.posSubCateCount = posSubCateCount;
    }

    public List<PosElementStructure> getChildren() {
        return children;
    }

    public void setChildren(List<PosElementStructure> children) {
        this.children = children;
    }
}
