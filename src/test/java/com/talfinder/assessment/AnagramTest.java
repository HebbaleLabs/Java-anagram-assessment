package com.talfinder.assessment;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AnagramTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {"AdnBndAndBdaBn", "", new ArrayList<>()},
        {"", "dAn", new ArrayList<>()},
        {"catMatChatPact", "abc", new ArrayList<>()},
        {"AbrAcadAbRa", "AbrAcadAbRa", new ArrayList<>(Arrays.asList("AbrAcadAbRa"))},
        {"eatSatAteMatePlate", "Ate", new ArrayList<>(Arrays.asList("eat","Ate","ate","ate"))},
        {"AdnBndAndBdaBn", "dAn", new ArrayList<>(Arrays.asList("Adn", "ndA", "dAn", "And"))},
        {"BACDGABCDA", "ABCD", new ArrayList<>(Arrays.asList("BACD", "ABCD", "BCDA"))},
        {"AAABABAA", "AABA", new ArrayList<>(Arrays.asList("AAAB", "AABA", "ABAA"))}
    });
  }

  String parent;
  String child;
  List<String> expectedValue;

  public AnagramTest(String parent, String child, List<String> expectedValue) {
    this.parent = parent;
    this.child = child;
    this.expectedValue = expectedValue;
  }

  @Test
  public void evalAnagrams(){
    Assert.assertEquals("input:Parent as '" + parent + "' Child as '" + child + "'", expectedValue, Anagram.evalAnagrams(parent, child));
  }
}
