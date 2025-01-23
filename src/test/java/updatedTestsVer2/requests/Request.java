package updatedTestsVer2.requests;

public abstract class Request {

    protected int code;
    protected String method;

    public abstract int getCode();
    public abstract String getMethod();

}
