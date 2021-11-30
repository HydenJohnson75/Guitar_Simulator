package GuitarSimulatorProject;

public class Guitar {
    private String model;
    private String genre;
    private Notes notes;

    public Guitar() {

    }

    public Guitar(String model, String genre) {
        setModel(model);
        setGenre(genre);
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
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
        return "The genre that you chose was: " + getGenre() + "\nThe model of guitar for this genre is: " + getModel();
    }
}
