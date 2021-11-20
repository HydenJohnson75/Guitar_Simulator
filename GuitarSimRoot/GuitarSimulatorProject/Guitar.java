package GuitarSimulatorProject;

import java.util.ArrayList;

public class Guitar {
        public String model;
        public String genre;

        public Notes getNotes() {
                return notes;
        }

        public void setNotes(Notes notes) {
                this.notes = notes;
        }

        public Notes notes;

        public Guitar(){

        }
        public Guitar(String model, String genre) {
                this.model = getModel();
                this.genre = getGenre();
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        @Override
        public String toString() {
                return "The genre that you chose was: "+ getGenre() + " The model of guitar for this genre " + getModel();
        }
}
