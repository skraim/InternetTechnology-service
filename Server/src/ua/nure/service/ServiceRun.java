package ua.nure.service;

import javax.xml.ws.Endpoint;
import java.util.Scanner;

public class ServiceRun {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        Endpoint ep = Endpoint.publish("http://localhost:8080/myserv", service);
        service.parseXML();
        new Scanner(System.in).nextLine();
        ep.stop();
    }
}
