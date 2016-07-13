package recyclerdemos.edu.tomerbu.ashdod.recycledemosfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import recyclerdemos.edu.tomerbu.ashdod.recycledemosfragments.models.Song;
//import ashdod.tomerbu.edu.recyclerdemos.models.Song;

public class SongDetailsActivity extends AppCompatActivity {

    TextView lyrics;
    ImageView ivAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lyrics = (TextView) findViewById(R.id.tvLyrics);
        ivAlbum = (ImageView) findViewById(R.id.ivSongDetails);


        Intent intent = getIntent();
        Song s = intent.getParcelableExtra(Constants.EXTRA_SONG);

        lyrics.setText(s.getLyrics());
        ivAlbum.setImageResource(s.getImageResId());
    }

}
