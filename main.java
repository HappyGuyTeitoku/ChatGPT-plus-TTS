public class main {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();

        UI.WelcomeScreen();
        String prompt = "";
        while(!prompt.equals("quit")){
            prompt = UI.getInput().toLowerCase();
        }
    }

    

}
