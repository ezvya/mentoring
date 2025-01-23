package updatedTestsVer2;

import updatedTestsVer2.requests.GetRequest;

public class BaseTest {

    protected String url = "https://mocktest.org";
    protected TestActions testActions = new TestActions();
    protected GetRequest getRequest = new GetRequest();

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
}
