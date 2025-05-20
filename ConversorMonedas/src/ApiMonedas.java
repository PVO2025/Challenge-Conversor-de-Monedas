import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMonedas {

    public static double obtenerTasaCambio(String base, String destino) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/45c69910a2ecbb36b081e175/latest/" + base;

            // Crear cliente y solicitud
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Enviar solicitud y obtener respuesta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear respuesta JSON
            JsonObject obj = JsonParser.parseString(response.body()).getAsJsonObject();
            double tasa = obj.getAsJsonObject("conversion_rates").get(destino).getAsDouble();


            return tasa;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}



