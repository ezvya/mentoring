package oopExamples.updatedTestsVer3.requests;

public class BaseRequest {

    protected int code;
    protected String url;
    protected String method;
    protected static final String METHOD_INFO_MESSAGE = "Set method: ";

    public void testMethod(){
        System.out.print("examlple");
    }
}
