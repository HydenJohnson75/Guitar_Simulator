package GuitarSimulatorProject;

public class Notes {


    String audioFile1 = "";



    String audioFile2 = setAudioFile2();
    String audioFile3 = "";
    String audioFile4 = "";
    String audioFile5 = "";
    String audioFile6 = "";
    String audioFile7 = "";
    String audioFile8 = "";
    String audioFile9 = "";
    String audioFile10 = "";
    String audioFile11 = "";
    String audioFile12 = "";
    String audioFile13 = "";
    String audioFile14 = "";
    String audioFile15 = "";
    String audioFile16 = "";
    String audioFile17 = "";
    String audioFile18 = "";
    String audioFile19 = "";
    String audioFile20 = "";
    String audioFile21 = "";
    String audioFile22 = "";
    String audioFile23 = "";
    String audioFile24 = "";
    String audioFile25 = "";
    String audioFile26 = "";
    String audioFile27 = "";
    String audioFile28 = "";
    String audioFile29 = "";
    String audioFile30 = "";
    String audioFile31 = "";
    String audioFile32 = "";
    String audioFile33 = "";
    String audioFile34 = "";
    String audioFile35 = "";
    String audioFile36 = "";


    public static String setAudioFile2() {
        String sound = "";
        String genre = TestGUI.findGenre();

        if(genre == "Metal")
        sound += "GuitarSounds/Metal E standard Notes/Low E String/F_Note.mp3";
        else{
            System.out.println("working");
        }
        return sound;
    }


    public void passNote(){








//        if(genre.equals("Metal")){
//            audioFile1 +="GuitarSounds/Metal E standard Notes/Low E String/E_Note.mp3";
//            audioFile2 += "GuitarSounds/Metal E standard Notes/Low E String/F_Note.mp3";
//            audioFile3 += "GuitarSounds/Metal E standard Notes/Low E String/F#_Note.mp3";
//            audioFile4 += "GuitarSounds/Metal E standard Notes/Low E String/G_Note.mp3";
//            audioFile5 += "GuitarSounds/Metal E standard Notes/Low E String/G#_Note.mp3";
//            audioFile6 += "GuitarSounds/Metal E standard Notes/Low E String/A_Note.mp3";
//            audioFile7 += "GuitarSounds/Metal E standard Notes/A String/A_Note.mp3";
//            audioFile8 += "GuitarSounds/Metal E standard Notes/A String/A#_Note.mp3";
//            audioFile9 += "GuitarSounds/Metal E standard Notes/A String/B_Note.mp3";
//            audioFile10 += "GuitarSounds/Metal E standard Notes/A String/C_Note.mp3";
//            audioFile11 += "GuitarSounds/Metal E standard Notes/A String/C#_Note.mp3";
//            audioFile12 += "GuitarSounds/Metal E standard Notes/A String/D_Note.mp3";
//            audioFile13 += "GuitarSounds/Metal E standard Notes/D String/D_Note.mp3";
//            audioFile14 += "GuitarSounds/Metal E standard Notes/D String/D#_Note.mp3";
//            audioFile15 += "GuitarSounds/Metal E standard Notes/D String/E_Note.mp3";
//            audioFile16 += "GuitarSounds/Metal E standard Notes/D String/F_Note.mp3";
//            audioFile17 += "GuitarSounds/Metal E standard Notes/D String/F#_Note.mp3";
//            audioFile18 += "GuitarSounds/Metal E standard Notes/D String/G_Note.mp3";
//            audioFile19 += "GuitarSounds/Metal E standard Notes/G String/G_Note.mp3";
//            audioFile20 += "GuitarSounds/Metal E standard Notes/G String/G#_Note.mp3";
//            audioFile21 += "GuitarSounds/Metal E standard Notes/G String/A_Note.mp3";
//            audioFile22 += "GuitarSounds/Metal E standard Notes/G String/A#_Note.mp3";
//            audioFile23 += "GuitarSounds/Metal E standard Notes/G String/B_Note.mp3";
//            audioFile24 += "GuitarSounds/Metal E standard Notes/G String/C_Note.mp3";
//            audioFile25 += "GuitarSounds/Metal E standard Notes/B String/B_Note.mp3";
//            audioFile26 += "GuitarSounds/Metal E standard Notes/B String/C_Note.mp3";
//            audioFile27 += "GuitarSounds/Metal E standard Notes/B String/C#_Note.mp3";
//            audioFile28 += "GuitarSounds/Metal E standard Notes/B String/D_Note.mp3";
//            audioFile29 += "GuitarSounds/Metal E standard Notes/B String/D#_Note.mp3";
//            audioFile30 += "GuitarSounds/Metal E standard Notes/B String/E_Note.mp3";
//            audioFile31 += "GuitarSounds/Metal E standard Notes/High E String/E_Note.mp3";
//            audioFile32 += "GuitarSounds/Metal E standard Notes/High E String/F_Note.mp3";
//            audioFile33 += "GuitarSounds/Metal E standard Notes/High E String/F#_Note.mp3";
//            audioFile34 += "GuitarSounds/Metal E standard Notes/High E String/G_Note.mp3";
//            audioFile35 += "GuitarSounds/Metal E standard Notes/High E String/G#_Note.mp3";
//            audioFile36 += "GuitarSounds/Metal E standard Notes/High E String/A_Note.mp3";
//        }
    }
}



//
//        String GuitarNotes[] = new String[30];
//
//        GuitarNotes[0] = audioFile1;
//        GuitarNotes[1] = audioFile2;
//        GuitarNotes[2] = audioFile3;
//        GuitarNotes[3] = audioFile4;
//        GuitarNotes[4] = audioFile5;
//        GuitarNotes[5] = audioFile6;
//        GuitarNotes[6] = audioFile7;
//        GuitarNotes[7] = audioFile8;
//        GuitarNotes[8] = audioFile9;
//        GuitarNotes[9] = audioFile10;
//        GuitarNotes[10] = audioFile11;
//        GuitarNotes[11] = audioFile12;
//        GuitarNotes[12] = audioFile13;
//        GuitarNotes[13] = audioFile14;
//        GuitarNotes[14] = audioFile15;
//        GuitarNotes[15] = audioFile16;
//        GuitarNotes[16] = audioFile17;
//        GuitarNotes[17] = audioFile18;
//        GuitarNotes[18] = audioFile19;
//        GuitarNotes[19] = audioFile20;
//        GuitarNotes[20] = audioFile21;
//        GuitarNotes[21] = audioFile22;
//        GuitarNotes[22] = audioFile23;
//        GuitarNotes[23] = audioFile24;
//        GuitarNotes[24] = audioFile25;
//        GuitarNotes[25] = audioFile26;
//        GuitarNotes[26] = audioFile27;
//        GuitarNotes[27] = audioFile28;
//        GuitarNotes[28] = audioFile29;
//        GuitarNotes[29] = audioFile30;
//




