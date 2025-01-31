package com.mistake5724.guessyou.game;

public class Player {
    private Mora mora;
    private int winCount;
    private int loseCount;
    private int life;

    public Player(){
        mora=Mora.NONE;
        winCount=0;
        loseCount=0;
        life=3;
    }

    public Mora getMora() {
        return mora;
    }

    public void setMora(Mora mora) {
        this.mora = mora;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
