package cn.chinaunicom.common;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.chinaunicom.common.exception.NormalException;

/**
 * ************************************** 描述: excel工具类
 * 
 * @ClassName: cn.chinaunicom.func.common.FileUtil
 * @author lizhenhao
 * @version V1.0
 ***************************************
 */
public class FileUtil {

	public static final String[]	EXCEL_EXT			= { "xls", "xlsx" };
	private static final String		ENCODING			= "UTF-8";
	private static final String		MODEL_NOT_NULL		= "模板不能为空";
	private static final String		EXCEL_NOT_NULL		= "excel文件不能为空";
	private static final String		FILE_NAME_NOT_NULL	= "待校验文件名不能为空";
	private static final String		FILE_ARR_NOT_NULL	= "待校验文件名不能为空";

	public static void exportExcel(List<?> list, String title, String sheetName, Class<?> pojoClass, String fileName, boolean isCreateHeader, HttpServletResponse response) {
		ExportParams exportParams = new ExportParams(title, sheetName);
		exportParams.setCreateHeadRows(isCreateHeader);
		defaultExport(list, pojoClass, fileName, response, exportParams);

	}

	public static void exportExcel(List<?> list, String title, String sheetName, Class<?> pojoClass, String fileName, HttpServletResponse response) {
		defaultExport(list, pojoClass, fileName, response, new ExportParams(title, sheetName, ExcelType.XSSF));

	}

	/**
	 * 一个excel 创建多个sheet
	 * 
	 * @param list
	 *            多个Map key title 对应表格Title key entity 对应表格对应实体 key data
	 *            Collection 数据
	 * @param fileName
	 * @param response
	 */
	public static void exportExcel(List<Map<String, Object>> list, String fileName, HttpServletResponse response) {
		defaultExport(list, fileName, response);
	}

	private static void defaultExport(List<?> list, Class<?> pojoClass, String fileName, HttpServletResponse response, ExportParams exportParams) {
		Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);
		if (workbook != null)
		{
			downLoadExcel(fileName, response, workbook);
		}

	}

	private static void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook) {
		try
		{
			response.setCharacterEncoding(FileUtil.ENCODING);
			response.setHeader("content-Type", "application/vnd.ms-excel");
			response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, FileUtil.ENCODING));
			workbook.write(response.getOutputStream());
		} catch (IOException e)
		{
			throw new NormalException(e.getMessage());
		}
	}

	/**
	 * 一个excel 创建多个sheet
	 * 
	 * @param list
	 *            多个Map key title 对应表格Title key entity 对应表格对应实体 key data
	 *            Collection 数据
	 * @param fileName
	 * @param response
	 */
	private static void defaultExport(List<Map<String, Object>> list, String fileName, HttpServletResponse response) {
		Workbook workbook = ExcelExportUtil.exportExcel(list, ExcelType.XSSF);
		if (workbook != null)
		{
			downLoadExcel(fileName, response, workbook);
		}

	}

	/**
	 * 
	 * 描述: 导入
	 * 
	 * @param filePath
	 * @param titleRows
	 * @param headerRows
	 * @param pojoClass
	 * @return List<T>
	 */
	public static <T> List<T> importExcel(String filePath, Integer titleRows, Integer headerRows, Class<T> pojoClass) {
		if (StringUtils.isBlank(filePath))
		{
			return null;
		}
		ImportParams params = new ImportParams();
		params.setTitleRows(titleRows);
		params.setHeadRows(headerRows);
		List<T> list = null;
		try
		{
			list = ExcelImportUtil.importExcel(new File(filePath), pojoClass, params);
		} catch (NoSuchElementException e)
		{
			throw new NormalException(FileUtil.MODEL_NOT_NULL);
		} catch (Exception e)
		{
			e.printStackTrace();
			throw new NormalException(e.getMessage());
		}
		return list;
	}

	/**
	 * 
	 * 描述: 导入
	 * 
	 * @param file
	 * @param titleRows
	 * @param headerRows
	 * @param pojoClass
	 * @return List<T>
	 */
	public static <T> List<T> importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass) {
		if (file == null)
		{
			return null;
		}
		ImportParams params = new ImportParams();
		params.setTitleRows(titleRows);
		params.setHeadRows(headerRows);
		List<T> list = null;
		try
		{
			list = ExcelImportUtil.importExcel(file.getInputStream(), pojoClass, params);
		} catch (NoSuchElementException e)
		{
			throw new NormalException(FileUtil.EXCEL_NOT_NULL);
		} catch (Exception e)
		{
			throw new NormalException(e.getMessage());
		}
		return list;
	}

	/**
	 * 检查文件名是否符合要求
	 * 
	 * @param fileName
	 *            待监测文件名
	 * @param exts
	 *            后缀名集合
	 * @return
	 */
	public static boolean checkExt(String fileName, String[] exts) {
		if (StringUtils.isBlank(fileName))
		{
			throw new NormalException(FileUtil.FILE_NAME_NOT_NULL);
		}

		if (exts == null || exts.length == 0)
		{
			throw new NormalException(FileUtil.FILE_ARR_NOT_NULL);
		}

		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		for (int i = 0; i < exts.length; i++)
		{
			if (ext.equals(exts[i]))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * 描述: 本地测试
	 * 
	 * @param args
	 *            void
	 */
//	public static void main(String[] args) {
//
//		List<Category> people = importExcel("F://students.xlsx", 1, 1, Category.class);
//		System.out.println(FastJsonUtils.toJSONString(people));
//
//	}

}
