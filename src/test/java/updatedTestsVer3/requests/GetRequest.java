package updatedTestsVer3.requests;

public class GetRequest extends BaseRequest implements Request{

    public GetRequest(String url) {
        this.code = 200;
        this.method = "GET";
        this.url = url;
    }

    @Override
    public void send() {
        setMethod();
        System.out.println("Send simple " + this.method + " request to " + url);
        resultLog();
    }

    @Override
    public void resultLog() {
        System.out.println("If the code is " + code + ", mark test as PASSED");
    }

    @Override
    public void setMethod() {
        System.out.println(METHOD_INFO_MESSAGE + this.method);
    }

}
