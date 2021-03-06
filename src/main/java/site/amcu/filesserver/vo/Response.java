package site.amcu.filesserver.vo;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Ben-Zheng
 * @Date: 2018/11/23 16:58
 */
public class Response implements Serializable {

    private static final long serialVersionUID = 1015793569810384522L;

    /** 响应处理是否成功 */
    private Boolean success;

    /** 响应处理的消息 */
    private String msg;

    /** 响应处理的返回内容 */
    private Object respBody;

    public Response(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Response(boolean success, String msg, Object respBody) {
        this(success, msg);
        this.respBody = respBody;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getRespBody() {
        return respBody;
    }

    public void setRespBody(Object respBody) {
        this.respBody = respBody;
    }
}
