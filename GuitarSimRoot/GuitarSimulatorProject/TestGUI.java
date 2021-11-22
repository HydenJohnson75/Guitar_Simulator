package GuitarSimulatorProject;

import static GuitarSimulatorProject.GUI.userSelectedGenre;

public class TestGUI {
    public static void main(String[] args) {

        String genre = userSelectedGenre;

        GUI startup = new GUI();

        if(userSelectedGenre == "Metal"){
           Guitar metalGuitar = new Guitar("PRS SE Mark Holcomb","Metal");

        }
        if(userSelectedGenre == "Jazz"){
             Guitar jazzGuitar = new Guitar("Ibanez AF75-BS","Jazz");

        }


    }


}
