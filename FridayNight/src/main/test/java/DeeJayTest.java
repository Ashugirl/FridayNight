//package java;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeeJayTest {
    private static DeeJay deeJay;
    private static DeeJay eejay;

   @BeforeClass
    public static void makeDeeJay(){
        ArrayList<Genre> djsList = new ArrayList<>();
        djsList.add(Genre.HIPHOP);
        djsList.add(Genre.DANCE);
        djsList.add(Genre.DISCO);
        djsList.add(Genre.POP);
        djsList.add(Genre.POLKA);
        deeJay = new DeeJay("DJ", 0, djsList);
        eejay = new DeeJay("EJ", 7, djsList);
    }
    @Test
    public void playASongTest(){
       deeJay.playASong();
        Assert.assertEquals(1, deeJay.getAmountSongsANight());
        eejay.playASong();
        Assert.assertEquals(7, eejay.getAmountSongsANight());
    }


}
