// Single-line Comment

import java.util.*;
import javax.swing.*;

public class PromptEx1 {
  public static void main(String argv[]) {
    System.out.println("Enter a line of text: ");
    System.out.flush();
    String theInput = "";
    java.io.InputStreamReader isr =
      new java.io.InputStreamReader(System.in);
    java.io.BufferedReader br =
      new java.io.BufferedReader(isr);
    try {
      theInput = br.readLine();
      br.close();
    } catch (java.io.IOException e) {
      System.out.println("A problem occurred!");
    }
    System.out.println("You entered: " + theInput);
  }
}



