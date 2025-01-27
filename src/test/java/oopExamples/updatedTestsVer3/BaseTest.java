package oopExamples.updatedTestsVer3;

import oopExamples.updatedTestsVer3.requests.GetRequest;
import oopExamples.updatedTestsVer3.requests.PostRequest;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    protected String body1 = """
                {
                "name" : "Homer",
                "role" : "admin"
                }""";
    protected String body2 = """
                {
                "name" : "Rust",
                "role" : "user"
                }""";

    protected String url = "https://mocktest.org";
    protected TestActions testActions = new TestActions();

    protected GetRequest getRequest = new GetRequest(url);
    protected List<PostRequest> postRequestList = new ArrayList<>();

}
