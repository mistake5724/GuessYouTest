package com.mistake5724.guessyou.game;

public enum WinState {
    PLAYER_WIN,
    COMPUTER_WIN,
    EVEN,
    IDLE;

    public static WinState getWinState(Mora player,Mora computer) {
        if (player == computer) {
            return EVEN;
        }

        if (player == Mora.SCISSOR && computer == Mora.PAPER) {
            return PLAYER_WIN;
        }
        if (computer == Mora.SCISSOR && player == Mora.PAPER) {
            return COMPUTER_WIN;
        }

        if (player.ordinal() > computer.ordinal()) {
            return PLAYER_WIN;
        }
            return COMPUTER_WIN;
    }
}
