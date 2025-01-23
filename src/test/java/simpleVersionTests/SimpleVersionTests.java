package simpleVersionTests;

import org.testng.annotations.Test;

public class SimpleVersionTests {

    @Test
    public void testGetRestApi() {
        int code = 200;
        String url = "https://mocktest.org";
        System.out.println("Set method: GET");

        System.out.println("Send simple GET request to " + url);
        System.out.println("If the code is " +  code + ", mark test as PASSED");
    }

    @Test
    public void testCreateUserApi() {
        String url = "https://mocktest.org";
        int code = 201;
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
        System.out.println("Set method: POST");
        System.out.println("Send simple POST request: " + body1 + " to " + url);
        System.out.println("If the code is " +  code + ", mark test as PASSED");
        System.out.println("============================================");
        System.out.println("Set method: POST");
        System.out.println("Send simple POST request: " + body2 + " to " + url);
        System.out.println("If the code is " +  code + ", mark test as PASSED");
        System.out.println("============================================");
    }
}