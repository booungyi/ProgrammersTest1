package booungyiTest;

import java.util.LinkedList;

public class WebServerSimul {
    public static void main(String[] args) {
        LinkedList<String> requestQueue = new LinkedList<>();


        requestQueue.offer("Request 1");
        requestQueue.offer("Request 2");
        requestQueue.offer("Request 3");

        System.out.println("Processing requests: ");

        while (!requestQueue.isEmpty()) {
            String request = requestQueue.poll();
            System.out.println("Processed" + request);
        }
    }
}
