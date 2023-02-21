public class main {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();

        UI.WelcomeScreen();

        String OpenAPIKey = APIKeyReader.getOpenAPIKey();
        String GoogleAPIKey = APIKeyReader.getGoogleAPIKey();

        String prompt = "";
                
        while(!prompt.equals("quit")){
            prompt = UI.getInput().toLowerCase();
        }
    }



}
