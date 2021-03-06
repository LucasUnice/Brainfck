package level2.reader;

import level2.constants.InstructionEnum;
import level2.exceptions.SyntaxException;
import level2.exceptions.WrongFile;

import java.util.List;

/**
 * Interface of the reader classes, defines the ReadFile method that reads a text file or an image
 */
public interface BfReader {
    List<InstructionEnum> ReadFile(String fileName) throws WrongFile, SyntaxException;

}
