package Executables.OxfordDictionaryDemo;

import Model.OxfordDictionaryResponse.Example;
import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by monodeep on 23/7/17.
 */
public class Trail
{
    public static void main(String[] args) {
        try{
            final String app_id = "17c111a9";
            final String app_key = "75ca5eecae1759e06666973c6dabdea3";

            URL url=new URL(dictionaryEntries("Masturbate"));
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept","application/json");
            urlConnection.setRequestProperty("app_id",app_id);
            urlConnection.setRequestProperty("app_key",app_key);

            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }

            String jsonData = stringBuilder.toString();
            System.out.println(jsonData);

            Gson gson=new Gson();

            Example myExample = gson.fromJson(jsonData,Example.class);
            System.out.println(myExample.toString(gson));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static String dictionaryEntries(String w) {
        final String language = "en";
        final String word = w;
        final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id;
    }
}
