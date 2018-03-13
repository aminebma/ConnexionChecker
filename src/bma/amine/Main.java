package bma.amine;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException {
        InternetAvailabilityChecker conCheck = new InternetAvailabilityChecker();
        if(conCheck.isInternetAvailable()) System.out.println("Connexion : OK");
        else System.out.println("No internet connexion :(");
    }
}


