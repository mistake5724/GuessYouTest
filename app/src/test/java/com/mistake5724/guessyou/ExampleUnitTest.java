package com.mistake5724.guessyou;

import com.mistake5724.guessyou.game.Mora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void  game_test(){
        for(Mora mora: Mora.values()){
            System.out.println(mora);
            System.out.println(mora.ordinal());
        }


    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}