package fr.iut.montreuil.lpcsid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by juliana on 30/06/15.
 */
@RestController
@RequestMapping("api/search")
public class HttpUrlConnexionController {

    private final String USER_AGENT = "Mozilla/5.0";

    // HTTP GET request
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public void sendGet() throws Exception {

       String url= " http://api.duckduckgo.com/?q=DuckDuckGo&format=json&pretty=1";

    /*

        String url = "https://www.google.com/search?q=Juliana";
        URL obj = new URL(url);

        String responseUrl = " ";

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            JsonParser objetJson = null;
            int i = 0;
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
                if (inputLine.contains("Juliana")) {
                   // System.out.println(inputLine);
                    if(inputLine.contains("/url?q=")){
                        responseUrl = inputLine;
                        System.out.println(" url ="+responseUrl);
                    }
                   i++;
                }
            }
            System.out.println("Total found " + i);
       /* } catch (Exception e) {
            e.printStackTrace();
        }*/
      //  return responseUrl;
    }

}