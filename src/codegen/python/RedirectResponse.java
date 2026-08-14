package codegen.python;

public class RedirectResponse {
    private final String location;
    private final int statusCode;

    public RedirectResponse(String location, int statusCode) {
        this.location = location;
        this.statusCode = statusCode;
    }

    public String getLocation() {
        return location;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
