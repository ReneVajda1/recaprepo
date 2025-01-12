import java.io.IOException;

public class OpenCDRom {
    public static void main(String[] args) {
        String openCdCommand = "powershell (New-Object -ComObject shell.application).Namespace(17).Self.InvokeVerb(\"open\")"; // PowerShell command to open CD tray

        try {
            for (int i = 0; i < 10; i++) {
                // Execute the system command
                Runtime.getRuntime().exec(openCdCommand);

                // Wait 1 second before opening again
                Thread.sleep(1000);
            }
        } catch (IOException e) {
            System.err.println("Error executing the command to open CD-ROM: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Thread sleep interrupted: " + e.getMessage());
        }
    }
}
