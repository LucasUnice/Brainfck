package level2.command;

import level2.exceptions.WrongFile;
import level2.interpreter.Bfck;

import java.io.*;

public class SetInCommand implements Command {

    /**
     * set the new input file specified
     * if not the file doesn't exist throw exception
     *
     * @param bfck
     */
    public void execute(Bfck bfck) {
        //setting file input only if the file exist
        if (bfck.getFilenameIn() != null) {
            File file = new File(bfck.getFilenameIn());
            if (file.exists()) {
                try {
                    String line;
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                    }
                    bfck.setIn(stringBuilder.toString());
                } catch (FileNotFoundException e) {
                    throw new WrongFile("missing-file");
                } catch (IOException e) {
                    throw new WrongFile("invalid-file");
                }
            }
        }
    }
}
