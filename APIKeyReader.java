import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIKeyReader {
 
    JSONParser parser = new JSONParser();

    public static String getOpenAPIKey(){
        String OpenAPIkey = "testString";
        System.out.println("test");
        return OpenAPIkey;
    }
}
