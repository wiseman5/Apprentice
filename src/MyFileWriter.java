import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by alisewiseman on 5/9/17.
 */
public class MyFileWriter {
  private File file;
  private FileOutputStream fileOutputStream;
  private BufferedWriter bufferedWriter;

  public MyFileWriter() {}

  public MyFileWriter(String fileName) {
    openFile(fileName);
  }

  public BufferedWriter openFile(String fileName) {
    try {
      file = new File(fileName);
      fileOutputStream = new FileOutputStream(file, true);
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
      return bufferedWriter;
    }catch (java.io.IOException e){
      System.out.println("io exception");
    }
    return null;
  }

  public BufferedWriter getWriter() {
    //return openFile(file.getName());
    return bufferedWriter;
  }

  public File getFile() {
    return file;
  }

  // Static
  private static File file2;
  private static FileOutputStream fileOutputStream1;
  private static BufferedWriter bufferedWriter1;

  public static BufferedWriter staticOpenFile(String fileName) {
    try {
      file2 = new File(fileName);
      fileOutputStream1 = new FileOutputStream(file2);
      bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(fileOutputStream1));
      return bufferedWriter1;
    }catch (java.io.IOException e){
      System.out.println("io exception");
    }
    return null;
  }

  public static File getStaticFile() {
    return file2;
  }

  public static BufferedWriter getStaticWriter() {
    return bufferedWriter1;
  }

  //abstract void compositionWriteLine(String line);
  //abstract void inheritanceWriteLine(String line);
  //abstract void staticWriteLine(String line);
}
