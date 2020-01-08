package databaseStructure.unittest;


//import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class TestConcatenater {
    //@Test   // the important part we need to import j-Unit that we import juit now do not worry about the error so for
@Test
    public void testThatLowercaseStringsConcatenateCorrectly(){
    //Concatenater.concatenateStrings("good", "morning");
    String actualOutCome = Concatenater.concatenateStrings("good","morning"); // now we can store into String data type beore compare
    String expectedOutCome = "goodmorning";

    Assert.assertEquals(actualOutCome,expectedOutCome);




        //Concatenater.ConcatenateStrings("good", "morning");
    }



}
