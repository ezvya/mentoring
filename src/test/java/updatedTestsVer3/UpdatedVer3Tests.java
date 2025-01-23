package updatedTestsVer3;

import org.testng.annotations.Test;
import updatedTestsVer3.requests.PostRequest;

public class UpdatedVer3Tests extends BaseTest {


    @Test
    public void testGetRestApi() {
        testActions.sendRequest(getRequest);
    }

    @Test
    public void testCreateUserApi() {
        postRequestList.add(new PostRequest(body1, url));
        postRequestList.add(new PostRequest(body2, url));
        postRequestList.forEach(postRequest -> testActions.sendRequest(postRequest));
    }
}
