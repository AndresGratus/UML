package ConsumoApi;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        
        // Solicitar una peticion 

        try {
        URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.connect();


        int responseCode = con.getResponseCode();

        if (responseCode != 200) {
            throw new RuntimeException("Ocurrio un error: " + responseCode);
        } else {
            StringBuilder informaStringBuilder = new StringBuilder();
            Scanner in = new Scanner(url.openStream());

            while (in.hasNext()) {
                informaStringBuilder.append(in.nextLine());
            }

            in.close();
            
            // System.out.println(informaStringBuilder);
            // System.out.println(responseCode);


            JSONObject jsonObject = new JSONObject(informaStringBuilder.toString());

            System.out.println(jsonObject);
            System.out.println(jsonObject.getString("username"));
        }


        } catch (Exception e) {
            e.printStackTrace();
        }
        


      

        // Conprobar la peticion 


        //Lectura de la informacion de dicha Api con Scanner leer flujo de datos y pintar la informacion obtenida por consola 
    }
    
}
