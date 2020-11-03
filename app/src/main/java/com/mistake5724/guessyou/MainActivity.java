package com.mistake5724.guessyou;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mistake5724.guessyou.game.Computer;
import com.mistake5724.guessyou.game.Mora;
import com.mistake5724.guessyou.game.Player;
import com.mistake5724.guessyou.game.WinState;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton scissorsIbn;
    private ImageButton rockIbn;
    private ImageButton paperIbn;
    private Button startBtn;
    private Button quitBtn;
    private ImageView computerImg;

    private final String TAG = "MainActivity";

    private Player player;
    private Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        initGame();
    }

    public void findViews(){
        scissorsIbn = findViewById(R.id.scissors_ibn);
        rockIbn = findViewById(R.id.rock_ibn);
        paperIbn = findViewById(R.id.paper_ibn);
        startBtn = findViewById(R.id.start_btn);
        quitBtn = findViewById(R.id.quit_btn);
        computerImg =findViewById(R.id.computer_img);

        scissorsIbn.setOnClickListener(this);
        rockIbn.setOnClickListener(this);
        paperIbn.setOnClickListener(this);
        startBtn.setOnClickListener(this);
        quitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.scissors_ibn:
                Log.d(TAG,getResources().getString(R.string.scissors));
                player.setMora(Mora.SCISSOR);
                System.out.println(WinState.getWinState(player.getMora(),computer.getMora()));
                break;
            case R.id.rock_ibn:
                Log.d(TAG,getResources().getString(R.string.rock));
                player.setMora(Mora.ROCK);
                break;
            case R.id.paper_ibn:
                Log.d(TAG,getResources().getString(R.string.paper));
                player.setMora(Mora.PAPER);
                break;
            case R.id.start_btn:
                initGame();
                Log.d(TAG,getResources().getString(R.string.start));
                break;
            case R.id.quit_btn:
                Log.d(TAG,getResources().getString(R.string.quit));
                break;
        }

    }

    public void initGame(){
        player = new Player();
        computer = new Computer();

        computer.AI();
        computerImg.setImageResource(Mora.getMoraResId(computer.getMora()));
    }

}