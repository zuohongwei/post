package cn.chinaunicom.common;

import java.util.Map;

/**
 * @author 张迟 on 2018-11-30.
 * @version 1.0
 */
public class PosUtil {

    private static Map<String,String> degree ;

    private static Map<String,String> posCate;

    private static Map<String,String> posMajor;

    private static Map<String,String> posCateLevel;

    private static Map<String,String> jobCate;

    private static Map<String,String> jobCateLevel;

    private static Map<String,String> qalificationLevel;



    public static Map<String, String> getPosMajor() {
        return posMajor;
    }
    public static void setPosMajor(Map<String, String> posMajor) {
        PosUtil.posMajor = posMajor;
    }
    public static Map<String, String> getPosCateLevel() {
        return posCateLevel;
    }
    public static void setPosCateLevel(Map<String, String> posCateLevel) {
        PosUtil.posCateLevel = posCateLevel;
    }
    public static Map<String, String> getQalificationLevel() {
        return qalificationLevel;
    }
    public static void setQalificationLevel(Map<String, String> qalificationLevel) {
        PosUtil.qalificationLevel = qalificationLevel;
    }
    public static Map<String, String> getDegree() {
        return degree;
    }
    public static void setDegree(Map<String, String> degree) {
        PosUtil.degree = degree;
    }
    public static Map<String, String> getPosCate() {
        return posCate;
    }
    public static void setPosCate(Map<String, String> posCate) {
        PosUtil.posCate = posCate;
    }
    public static Map<String, String> getJobCate() {
        return jobCate;
    }
    public static void setJobCate(Map<String, String> jobCate) {
        PosUtil.jobCate = jobCate;
    }
    public static Map<String, String> getJobCateLevel() {
        return jobCateLevel;
    }
    public static void setJobCateLevel(Map<String, String> jobCateLevel) {
        PosUtil.jobCateLevel = jobCateLevel;
    }


}
