package ma.saifdine.hd;

import jakarta.xml.ws.Endpoint;
import ma.saifdine.hd.ws.WebServiceSoapImpl;

public class ServerJWS {

    public static void main(String[] args) {

        String url = "http://localhost:8080/ws/compte";
        Endpoint.publish(url, new WebServiceSoapImpl());
        System.out.println("Server ready by URL : " + url);
    }
}
