package jd04_selection_statements_task;

public class HttpStatusCode {

    public static void main(String[] args) {
        int statusCode = 200;

        switch (statusCode){
            case 200 -> System.out.println("OK");
            case 201 -> System.out.println("Created");
            case 202 -> System.out.println("Accepted");
            case 301 -> System.out.println("Moved Permanently");
            case 303 -> System.out.println("See other");
            case 304 -> System.out.println("Not notified");
            case 307 -> System.out.println("Temporary Redirect");
            case 400 -> System.out.println("Bad Request");
            case 401 -> System.out.println("Unauthorized");
            case 403 -> System.out.println("Forbidden");
            case 404 -> System.out.println("Not Found");
            case 410 -> System.out.println("Gone");
            case 500 -> System.out.println("Internal Server Error");
            case 503 -> System.out.println("Service Unavailable");
            default -> System.out.println("Invalid Input");

        }

    }
}
