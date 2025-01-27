package oopExamples.updatedTestsVer2.requests;

public class PostRequest extends Request {

    private final String body;

    public PostRequest(String body) {
        this.code = 201;
        this.method = "POST";
        this.body = body;
    }
    public int getCode() {
        return this.code;
    }

    public String getMethod() {
        return this.method;
    }

    public String getBody() {
        return this.body;
    }
}
