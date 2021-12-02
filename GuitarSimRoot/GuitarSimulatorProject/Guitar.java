package GuitarSimulatorProject;

public class Guitar {
    private String model;
    private String genre;
    private Notes notes;

    /**
     * An instantiable class which defines a Guitar and allows the user to know what type of guitar
     * they are using and decide the starting genre of the program
     *
     * @author Hyden Johnson
     */


    public Guitar() {

    }

    /**
     * Guitar 2-argument constructor which calls 2 mutators to initialise the attributes of
     * the guitar object
     *
     * @param model Users model
     * @param genre Users genre
     */

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

    /**
     * Method to get the string value of the model of a guitar object
     *
     * @return a string value which specifies the model of a guitar object
     */

    public String getModel() {
        return model;
    }

    /**
     * Method to set the string value of the model of a guitar object
     *
     * @param model
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Method to get the string value of the genre of a guitar object
     *
     * @return a string value which specifies the genre of a guitar object
     */

    public String getGenre() {
        return genre;
    }

    /**
     * Method to set the string value of the model of a guitar object
     *
     * @param genre Users genre
     */

    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Method to get the state of a guitar object
     *
     * @return a string value which specifies the state of a guitar object
     */

    @Override
    public String toString() {
        return "The genre that you chose was: " + getGenre() + "\nThe model of guitar for this genre is: " + getModel();
    }
}
