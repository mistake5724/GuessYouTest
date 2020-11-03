package com.mistake5724.guessyou.game;

import com.mistake5724.guessyou.R;

public enum Mora {
    SCISSOR,
    ROCK,
    PAPER,
    NONE;

    public static int getMoraResId(Mora mora){
        int[]resId = {R.drawable.scissors,R.drawable.rock,R.drawable.paper};
        return resId[mora.ordinal()];
    }
}
