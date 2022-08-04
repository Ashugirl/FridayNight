//package java;

import org.junit.Assert;
import org.junit.Before;
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
    public void playASongTest() {

        deeJay.playASong();
        eejay.playASong();

        for (Genre g : deeJay.getGenres()) {
            String newSong = "Playing new song! " + g.toString();
            String noNewSong = "No more songs to play";
            Assert.assertEquals("Playing new song! " + g.toString(), newSong);
            Assert.assertEquals(1, deeJay.getAmountSongsANight());
            Assert.assertEquals("No more songs to play", noNewSong);
            Assert.assertEquals(7, eejay.getAmountSongsANight());

        }

    }

    @Test
    public void playARequestTest(){
        deeJay.playARequest(Genre.DISCO);
        String request = "Playing your song";
        Assert.assertEquals("Playing your song", request);
        Assert.assertThrows(RuntimeException.class, ()-> deeJay.playARequest(Genre.OPERA));


    }

}
