package GuitarSimulatorProject;

public class Notes {
    private String audioFile1 = "GuitarSounds/Clean E standard Notes/E_Note.mp3";
    private String audioFile2 = "GuitarSounds/Clean E standard Notes/F_Note.mp3";
    private String audioFile3 = "GuitarSounds/Clean E standard Notes/F#_Note.mp3";
    private String audioFile4 = "GuitarSounds/Clean E standard Notes/G_Note.mp3";
    private String audioFile5 = "GuitarSounds/Clean E standard Notes/G#_Note.mp3";
    private String audioFile6 = "GuitarSounds/Clean E standard Notes/A_Note.mp3";

    public Notes(String audioFile1, String audioFile2, String audioFile3, String audioFile4, String audioFile5, String audioFile6) {
        this.audioFile1 = audioFile1;
        this.audioFile2 = audioFile2;
        this.audioFile3 = audioFile3;
        this.audioFile4 = audioFile4;
        this.audioFile5 = audioFile5;
        this.audioFile6 = audioFile6;
    }

    public String getAudioFile1() {
        return audioFile1;
    }

    public void setAudioFile1(String audioFile1) {
        this.audioFile1 = audioFile1;
    }

    public String getAudioFile2() {
        return audioFile2;
    }

    public void setAudioFile2(String audioFile2) {
        this.audioFile2 = audioFile2;
    }

    public String getAudioFile3() {
        return audioFile3;
    }

    public void setAudioFile3(String audioFile3) {
        this.audioFile3 = audioFile3;
    }

    public String getAudioFile4() {
        return audioFile4;
    }

    public void setAudioFile4(String audioFile4) {
        this.audioFile4 = audioFile4;
    }

    public String getAudioFile5() {
        return audioFile5;
    }

    public void setAudioFile5(String audioFile5) {
        this.audioFile5 = audioFile5;
    }

    public String getAudioFile6() {
        return audioFile6;
    }

    public void setAudioFile6(String audioFile6) {
        this.audioFile6 = audioFile6;
    }


}
