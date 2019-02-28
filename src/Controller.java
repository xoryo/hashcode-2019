import java.io.File;
import java.util.List;

public class Controller {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("No valid file given!");
        }

        if (!(new File(args[0]).exists())) {
            throw new Exception("File " + args[0] + " does not exist!");
        }

        Parser parser = new Parser(args[0]);

        if (args.length > 1) {
            if (!(new File(args[1]).exists())) {
                throw new Exception("File " + args[1] + " does not exist!");
            }

            parser.readSolution(args[1]);
        }
    }
}