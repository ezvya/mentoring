package updatedTestsVer1;

import org.testng.annotations.Test;

public class UpdatedVer1Tests {

    protected String url = "https://mocktest.org";
    TestActions testActions = new TestActions();

    @Test
    public void testGetRestApi() {
        testActions.setMethod("GET");
        testActions.sendGetRequest("GET", 200, url);
    }

    @Test
    public void testCreateUserApi() {
        testActions.setMethod("POST");
        String body1 = """
                {
                "name" : "Homer",
                "role" : "admin"
                }""";
        String body2 = """
                {
                "name" : "Rust",
                "role" : "user"
                }""";
        testActions.sendPostRequest("POST", 201, url, body1, body2);
    }
}
