import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIKeyReader {

    public static String getOpenAPIKey(){
        String OpenAPIkey = "testString";
        JSONParser parser = new JSONParser();
        try{
            // JSONファイルを指定して、FileReaderオブジェクトを生成
            FileReader reader = new FileReader("APIKey.json");
            // JSONParserオブジェクトを使って、JSONファイルをパースし、JSONObjectを生成
            Object obj = parser.parse(reader);
            JSONObject jsonObj = (JSONObject) obj;
             // JSONデータの取得
             OpenAPIkey = (String) jsonObj.get("OpenAPI_Key");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("[DEBUG] getOpenAPIKey returns: "+OpenAPIkey);
        return OpenAPIkey;
    }

    public static String getGoogleAPIKey(){
        String GoogleAPIKey = "testString";
        JSONParser parser = new JSONParser();
        try{
            // JSONファイルを指定して、FileReaderオブジェクトを生成
            FileReader reader = new FileReader("APIKey.json");
            // JSONParserオブジェクトを使って、JSONファイルをパースし、JSONObjectを生成
            Object obj = parser.parse(reader);
            JSONObject jsonObj = (JSONObject) obj;
             // JSONデータの取得
             GoogleAPIKey = (String) jsonObj.get("GoogleCloudAPI_Key");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("[DEBUG] getGoogleAPIKey returns: "+GoogleAPIKey);
        return GoogleAPIKey;
    }
}
