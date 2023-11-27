import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        final BankStatementCSVParse bankStatementCSVParse = new BankStatementCSVParse();
        final String fileName = args[0];
        final Path path = Paths.get(fileName);
        //final List<String> lines = Files.readAllLines(path);
    }
}
