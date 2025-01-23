package updatedTestsVer3.requests;

public class PostRequest extends BaseRequest implements Request {

    private final String body;

    public PostRequest(String body, String url) {
        this.code = 201;
        this.method = "POST";
        this.body = body;
        this.url = url;
    }

    @Override
    public void send() {
        this.setMethod();
        postRequestSender(this, url);
        this.resultLog();
        System.out.println("============================================");
    }

    @Override
    public void resultLog() {
        System.out.println("If the code is " + this.code + ", mark test as PASSED");
    }

    private void postRequestSender(Request request, String url) {
        System.out.println("Send simple " + this.method + " request: " + this.body + " to " + url);

    }

    public void setMethod() {
        System.out.println(METHOD_INFO_MESSAGE + this.method);
    }

}
