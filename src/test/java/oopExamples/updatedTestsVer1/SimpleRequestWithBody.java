package oopExamples.updatedTestsVer1;

public class SimpleRequestWithBody {

    private int code;
    private String method;
    private String body;

    public SimpleRequestWithBody(int code, String method, String body) {
        this.code = code;
        this.method = method;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public String getMethod() {
        return method;
    }

    public String getBody() {
        return body;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
