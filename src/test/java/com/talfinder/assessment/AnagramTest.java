package com.talfinder.assessment;

import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
  private Anagram anagram = new Anagram();

  @Test
  public void evalAnagramForEmptyChildString(){
    List<String> actual = anagram.evalAnagrams("AdnBndAndBdaBn", "");
    Assert.assertEquals(0, actual.size());
  }

  @Test
  public void evalAnagramForEmptyParentString(){
    List<String> actual = anagram.evalAnagrams("", "dAn");
    Assert.assertEquals(0, actual.size());
  }

  @Test
  public void evalAnagramForSameParentChildStringLength(){
    List<String> actual = anagram.evalAnagrams("AbrAcadAbRa", "AbrAcadAbRa");
    Assert.assertEquals(0, actual.size());
  }

  @Test
  public void evalAnagramForValidChildString(){
    List<String> actual = anagram.evalAnagrams("eatSatAteMatePlate", "Ate");
    Assert.assertEquals(3, actual.size());
  }

  @Test
  public void evalAnagramForInValidChildString(){
    List<String> actual = anagram.evalAnagrams("catMatChatPact", "abc");
    Assert.assertEquals(0, actual.size());
  }

  @Test
  public void evalAnagramToCheckListsAreEqual(){
    List<String> expected = Arrays.asList("Adn", "ndA", "dAn", "And");
    List<String> actual = anagram.evalAnagrams("AdnBndAndBdaBn", "dAn");
    Assert.assertThat(actual, is(expected));
  }
}
