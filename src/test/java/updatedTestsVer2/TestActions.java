package updatedTestsVer2;

import updatedTestsVer2.requests.GetRequest;
import updatedTestsVer2.requests.PostRequest;
import updatedTestsVer2.requests.Request;

public class TestActions {


    public void sendGetRequest(GetRequest getRequest, String url) {
        setMethod(getRequest);
        System.out.println("Send simple " + getRequest.getMethod() + " request to " + url);
        resultLog(getRequest.getCode());
    }

    public void sendPostRequest(String url, String... body) {
        for (String str : body) {
            PostRequest postRequest = new PostRequest(str);
            setMethod(postRequest);
            postRequestSender(postRequest, url);
            resultLog(postRequest.getCode());
            System.out.println("============================================");
        }
    }


    private void postRequestSender(PostRequest request, String url) {
        System.out.println("Send simple " + request.getMethod() + " request: " + request.getBody() + " to " + url);

    }

    private void resultLog(int code) {
        System.out.println("If the code is " + code + ", mark test as PASSED");
    }

    private void setMethod(Request request) {
        System.out.println("Set method: " + request.getMethod());
    }

}
