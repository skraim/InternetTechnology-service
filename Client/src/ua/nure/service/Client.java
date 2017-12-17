package ua.nure.service;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static final String ADD = "http://localhost:8080/myserv";

    public static void main(String[] args) throws MalformedURLException {
        try {
            MyServiceService service = new MyServiceService(new URL(ADD));
            MyService client = service.getMyServicePort();
            System.out.println(client.doubleEcho("test"));
            System.out.println(client.getIntentoryList());
            System.out.println(client.getInventoryById(2));
            System.out.println(client.getPriceInADayById(1));
            System.out.println(client.getPriceInHourById(1));
            System.out.println(client.getYearInADayById(3));
        } catch (InaccessibleWSDLException ex) {
            System.err.println("Can't connect to the service!");
        }
    }
}
