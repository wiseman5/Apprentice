import java.io.IOException;

/**
 * Created by alisewiseman on 5/9/17.
 */
public class LineOrientedWriter extends MyFileWriter {

  private MyFileWriter writer = new MyFileWriter("line.txt");

  public LineOrientedWriter(String fileName) {
    super(fileName);
  }

  public void compositionWriteLine(String line) {
    try {
      writer.getWriter().write(line);
      writer.getWriter().close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void inheritanceWriteLine(String line) {
    try {
      getWriter().write(line);
      getWriter().close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void staticWriteLine(String line) {
    try {
      MyFileWriter.staticOpenFile("line2.txt");
      MyFileWriter.getStaticWriter().write(line);
      MyFileWriter.getStaticWriter().close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
