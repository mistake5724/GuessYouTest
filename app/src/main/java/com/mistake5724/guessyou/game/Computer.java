package com.mistake5724.guessyou.game;

import java.util.Random;

public class Computer extends Player {

    public void AI(){
        setMora(getRandomMora());
    }

    public static Mora getRandomMora(){
        int index = new Random().nextInt(Mora.NONE.ordinal());
        if (index == 0){
            return Mora.SCISSOR;
        }else if (index ==1){
            return Mora.ROCK;
        }else{
            return Mora.PAPER;
        }

    }
}
