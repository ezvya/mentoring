package oopExamples.updatedTestsVer2;

import org.testng.annotations.Test;

public class UpdatedVer2Tests extends BaseTest{


    @Test
    public void testGetRestApi() {
        testActions.sendGetRequest(getRequest, url);
    }

    @Test
    public void testCreateUserApi() {
        testActions.sendPostRequest(url, body1, body2);
    }
}
