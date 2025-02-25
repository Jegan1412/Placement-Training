import java.util.*;

interface MediaPlayer{
    void play();
    void pause();
    void stop();
    void subtitle();
    void playback_speed();
}

class AudioPlayer implements MediaPlayer{
    public void play(){
        System.out.println("Playing...");
    }
    public void pause(){
        System.out.println("Paused...");
    }
    public void stop(){
        System.out.println("Stopped...");
    }
    public void subtitle(){
        System.out.println("Subtitle Enabled...");
    }
    public void playback_speed(){
        System.out.println("Playback Speed is set to 1x...");
    }
}

class VideoPlayer implements MediaPlayer{
    private boolean sub_title = false;
    private int playback = 1;
    public void play(){
        System.out.println("Playing...");
    }
    public void pause(){
        System.out.println("Paused...");
    }
    public void stop(){
        System.out.println("Stopped...");
    }
    public void subtitle(){
        if(!sub_title){
            sub_title = true;
            System.out.println("Subtitle Enabled...");
        }
        else{
            sub_title = false;
            System.out.println("Subtitle Disabled...");
        } 
    }
    public void playback_speed(){
        if(playback == 1) System.out.println("Playback Speed is set to 1x...");
        else if(playback == 2) System.out.println("Playback Speed is set to 1.5x...");
        else{
            playback = 0;
            System.out.println("Playback Speed is set to 2x...");
        } 
        playback++;
    }
}

class StreamingPlayer implements MediaPlayer{
    private boolean sub_title = false;
    private int playback = 1;
    public void play(){
        System.out.println("Playing...");
    }
    public void pause(){
        System.out.println("Paused...");
    }
    public void stop(){
        System.out.println("Stopped...");
    }
    public void subtitle(){
        if(!sub_title){
            sub_title = true;
            System.out.println("Subtitle Enabled...");
        }
        else{
            sub_title = false;
            System.out.println("Subtitle Disabled...");
        } 
    }
    public void playback_speed(){
        if(playback == 1) System.out.println("Playback Speed is set to 1x...");
        else if(playback == 2) System.out.println("Playback Speed is set to 1.5x...");
        else{
            playback = 0;
            System.out.println("Playback Speed is set to 2x...");
        } 
        playback++;
    }
}

public class Interface_MediaPlayer
{
	public static void main(String[] args) {
	    
	    AudioPlayer a = new AudioPlayer();
	    VideoPlayer v = new VideoPlayer();
	    StreamingPlayer s = new StreamingPlayer();
	    
	    v.play();
	    v.pause();
	    v.stop();
	    v.subtitle();
	    v.playback_speed();
	    v.playback_speed();
	}
}