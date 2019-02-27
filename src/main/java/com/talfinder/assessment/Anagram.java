package com.talfinder.assessment;

import java.util.List;

public class Anagram {

  public static List<String> evalAnagrams(String parent, String child) {
    /*
     * NOTE:
     * 1. Write your solution within this method
     * 2. Do not make changes to the Class Name, Method Name or Method Signature
     * 3. Use the Run-Java command to run main method
     * 4. Use the BuildAndRunTests command to evaluate your solution
     */
    List<String> anagramsList = null;
    return anagramsList;
  }
  
  public static void main(String[] args) {
    List<String> anagramsList = evalAnagrams("Harsha", "ash");
    if(anagramsList != null) {
        anagramsList.forEach(anagram -> System.out.println(anagram));   
    } else {
        System.out.println("List is NULL");
    }
  }
}
