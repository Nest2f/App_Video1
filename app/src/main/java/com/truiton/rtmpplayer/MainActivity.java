package com.truiton.rtmpplayer;

import android.os.Bundle;
import com.example.angelo.app_video1.R;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import io.vov.vitamio.LibsChecker;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String path;
    //private HashMap<String, String> options;
    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!LibsChecker.checkVitamioLibs(this))
            return;
        setContentView(R.layout.activity_main);
        mVideoView = (VideoView) findViewById(R.id.vitamio_videoView);
        path = "rtmp://rrbalancer.broadcast.tneg.de:1935/pw/ruk/ruk";
        /*options = new HashMap<>();
        options.put("rtmp_playpath", "");
        options.put("rtmp_swfurl", "");
        options.put("rtmp_live", "1");
        options.put("rtmp_pageurl", "");*/
        mVideoView.setVideoPath(path);
        //mVideoView.setVideoURI(Uri.parse(path), options);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setPlaybackSpeed(1.0f);
            }
        });

        mVideoView = (VideoView) findViewById(R.id.vitamio_videoView);
        path = "rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mov";
        mVideoView.setVideoPath(path);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setPlaybackSpeed(1.0f);
            }
        });

        mVideoView = (VideoView) findViewById(R.id.vitamio_videoView);
        path = "http://93.184.221.133/00573D/236/236-0.m3u8";
        mVideoView.setVideoPath(path);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setPlaybackSpeed(1.0f);
            }
        });

        mVideoView = (VideoView) findViewById(R.id.vitamio_videoView);
        path = "mms://beotelmedia.beotel.net/studiob";
        mVideoView.setVideoPath(path);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setPlaybackSpeed(1.0f);
            }
        });

    }
}