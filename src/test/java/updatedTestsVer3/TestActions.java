package updatedTestsVer3;

import updatedTestsVer3.requests.GetRequest;
import updatedTestsVer3.requests.PostRequest;
import updatedTestsVer3.requests.BaseRequest;
import updatedTestsVer3.requests.Request;

public class TestActions {

    public void sendRequest(Request request) {
        request.send();
    }

}
