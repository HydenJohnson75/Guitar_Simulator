package GuitarSimulatorProject;

public class Notes {


    String audioFile1 = "";
    String audioFile2 = "";
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

    public static String setCurrentTuning(String tuning) {
        String str = "";

        if (tuning.equals("E Standard")) {
            str += "E Standard";
        }
        if (tuning.equals("D Standard")) {
            str += "D Standard";
        }
        if (tuning.equals("Drop C")) {
            str += "Drop C";
        }

        return str;
    }

    public static String setAudioFile1(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/C_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/C_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/C_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile2(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/C#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/C#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/C#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile3(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/D_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/D_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/D_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile4(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/D#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/D#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/D#_Note.mp3";
            }
        }


        return sound;
    }

    public static String setAudioFile5(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/E_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/E_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/E_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile6(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/Low E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/Low D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/Low C String/F_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/Low E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/Low D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/Low C String/F_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/Low E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/Low D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/Low C String/F_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile7(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/G_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/G_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/G_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile8(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/G#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/G#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/G#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile9(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/A_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/A_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/A_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile10(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/A#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/A#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/A#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile11(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/B_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/B_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/B_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile12(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/G String/C_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/G String/C_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/G String/C_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile13(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/C_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/C_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/C_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile14(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/C#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/C#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/C#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile15(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/D_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/D_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/D_Note.mp3";
            }
        }


        return sound;
    }

    public static String setAudioFile16(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/D#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/D#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/D#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile17(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/E_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/E_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/E_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile18(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/D String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/C String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/High C String/F_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/D String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/C String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/High C String/F_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/D String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/C String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/High C String/F_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile19(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/F_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/F_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/F_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile20(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/F#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/F#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/F#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile21(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/G_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/G_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/G_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile22(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/G#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/G#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/A#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/G#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/G#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile23(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/A_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/A_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/A_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile24(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/F String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/F String/A#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/F String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/F String/A#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/G String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/F String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/F String/A#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile25(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/A_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/A_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/B_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/A_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/A_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile26(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/A#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/A#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/C_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/A#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/A#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile27(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/B_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/B_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/C#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/B_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/B_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile28(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/C_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/C_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/D_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/C_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/C_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile29(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/C#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/C#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/D#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/C#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/C#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile30(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/B String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/A String/D_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/B String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/A String/D_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/B String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/A String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/A String/D_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile31(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/D_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/D_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/E_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/D_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/D_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile32(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/D#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/D#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/F_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/D#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/D#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile33(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/E_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/E_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/F#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/E_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/E_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile34(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/F_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/F_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/G_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/F_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/F_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile35(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/F#_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/F#_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/G#_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/F#_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/F#_Note.mp3";
            }
        }

        return sound;
    }

    public static String setAudioFile36(String genre, String tuning) {
        String sound = "";

        if (genre.equals("Metal")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Metal E standard Notes/High E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Metal D standard Notes/High D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Metal Drop C Notes/D String/G_Note.mp3";
            }
        }
        if (genre.equals("Jazz")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Jazz E standard Notes/High E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Jazz D standard Notes/High D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Jazz Drop C Notes/D String/G_Note.mp3";
            }
        }
        if (genre.equals("Pop")) {
            if (tuning.equals("E Standard")) {
                sound += "GuitarSounds/Clean E standard Notes/High E String/A_Note.mp3";
            }
            if (tuning.equals("D Standard")) {
                sound += "GuitarSounds/Clean D standard Notes/High D String/G_Note.mp3";
            }
            if (tuning.equals("Drop C")) {
                sound += "GuitarSounds/Clean Drop C Notes/D String/G_Note.mp3";
            }
        }

        return sound;
    }
}