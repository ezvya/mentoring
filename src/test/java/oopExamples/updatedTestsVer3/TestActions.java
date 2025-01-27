package oopExamples.updatedTestsVer3;

import oopExamples.updatedTestsVer3.requests.GetRequest;
import oopExamples.updatedTestsVer3.requests.Request;

public class TestActions {

    public void sendRequest(Request request) {
        request.send();
    }

    public void sendRequest(GetRequest request) {
        request.send();
        request.testMethod();
    }

}
