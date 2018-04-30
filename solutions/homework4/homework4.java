
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class homework4
{

  public static void main(String[] args)
  {
      try {
          File file = new File("homework4-ops.txt");
          FileReader fileReader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line;
          while ((line = bufferedReader.readLine()) != null)
          {
              System.out.println(performOp(line));
          }

          fileReader.close();
      } catch (IOException e) {
          e.printStackTrace();
      }

  }


  private static String performOp(String input) {
      //strip space
      String eq = input.replaceAll("\\s+", "");

      int result = 0;

      //look for symbol
      if (eq.contains("+"))
      {
          String[] parts = eq.split("\\+");
          result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
      }
      else if (eq.contains("-"))
      {
          String[] parts = eq.split("-");
          result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
      }
      else if (eq.contains("*"))
      {
          String[] parts = eq.split("\\*");
          result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
      }
      else if (eq.contains("/"))
      {
          String[] parts = eq.split("\\/");
          return input + " = " + (Float.parseFloat(parts[0]) / Float.parseFloat(parts[1]));
      }
      else
      {
          return "Invalid equasion";
      }

      return input + " = " + result;
  }

}
