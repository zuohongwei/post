package cn.chinaunicom.common.exception;

/**
 * ************************************** 描述: excel自定义异常
 * 
 * @ClassName: cn.chinaunicom.func.common.exception.NormalException
 * @author lizhenhao
 * @version V1.0
 ***************************************
 */
public class NormalException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NormalException(String message) {
		super(message);
	}

}
