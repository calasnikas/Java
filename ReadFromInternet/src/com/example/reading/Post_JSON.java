package com.example.reading;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Post_JSON {

    public static void main(String[] args) {
        double value=Post_JSON.Send_Data();
         System.out.println(value);
    }

    public static double Send_Data() {
//      String query_url = "http://data.fixer.io/api/latest?access_key=77f668c65d90725d6f157bfde480dc74&format=1";
        String query_url = "http://apilayer.net/api/live?access_key=cbdef8130263efc9947318107dd66dd7&currencies=INR&source=USD&format=1";
        // System.out.println(query_url);
         double val_m=0;
        String result = null;
        try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            result = IOUtils.toString(in, "UTF-8");
        //  System.out.println(result);
            JSONObject myResponse = new JSONObject(result);

            String val = myResponse.get("quotes").toString();
           // System.out.println(val);
            val_m = Double.parseDouble(val.substring(val.indexOf(":") + 1, val.indexOf("}")));
          //  System.out.println(val_m);
            in.close();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
return  val_m;
    }
}
