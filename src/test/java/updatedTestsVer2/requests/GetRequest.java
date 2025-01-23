package updatedTestsVer2.requests;

public class GetRequest extends Request {

    public GetRequest() {
        this.code = 200;
        this.method = "GET";
    }

    @Override
    public int getCode() {
        return this.code;
    }

    public String getMethod() {
        return this.method;
    }
}
