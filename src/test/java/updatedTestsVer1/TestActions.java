package updatedTestsVer1;

public class TestActions {

    public void setMethod(String method) {
        System.out.println("Set method: " + method);
    }


    public void sendGetRequest(String method, int code, String url) {
        System.out.println("Send simple " + method + " request to " + url);
        resultLog(code);
    }

    public void sendPostRequest(String method, int code, String url, String... body) {
        for (String str : body) {
            requestSender(new SimpleRequestWithBody(code, method, str), url);
            resultLog(code);
            System.out.println("============================================");
        }
    }


    private void requestSender(SimpleRequestWithBody request, String url) {
        System.out.println("Send simple " + request.getMethod() + " request : " + request.getBody() + " to " + url);
    }

    private void resultLog(int code) {
        System.out.println("If the code is " + code + ", mark test as PASSED");
    }

}
