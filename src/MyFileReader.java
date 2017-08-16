import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alisewiseman on 5/8/17.
 */
public class MyFileReader {
  private Scanner scanner;

  public MyFileReader(String filename){
    try {
      FileInputStream fis = new FileInputStream(filename);
      BufferedInputStream bis = new BufferedInputStream(fis);
      InputStreamReader isr = new InputStreamReader(bis);
      scanner = new Scanner(isr);
    } catch (FileNotFoundException e) {
      System.out.println("File " + filename + " not found");
    }
  }

  public MyFileReader(String filename, int i){

  }

  public Scanner getScanner(){
    return scanner;
  }

  public void readLines(){
    List<String> list = sortLines();
    try {
      FileWriter fw = new FileWriter("sorted.txt", false);
      BufferedWriter bw = new BufferedWriter(fw);
      for(int i = 0; i < list.size(); i++){
        bw.write(list.get(i));
        bw.newLine();
      }
      bw.close();
    }catch (java.io.IOException e){
      System.out.println("io exception");
    }
  }
  public void reverseReadLines(){
    List<String> list = sortLines();
    try {
      FileWriter fw = new FileWriter("reverseSorted.txt", false);
      BufferedWriter bw = new BufferedWriter(fw);
      for(int i = list.size() -1; i >= 0; i--){
        bw.write(list.get(i));
        bw.newLine();
      }
      bw.close();
    }catch (java.io.IOException e){
      System.out.println("io exception");
    }
  }
  private List<String> sortLines(){
    List<String> list = new ArrayList<String>();
    while (scanner.hasNextLine()){
      list.add(scanner.nextLine());
    }
    Collections.sort(list);
    return list;
  }
}
