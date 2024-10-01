package managers;

import models.Train;
import datastructures.LinkedList;
import utils.FileHandler;

public class TrainManager {
    private LinkedList<Train> trains;
    private FileHandler fileHandler;

    public TrainManager() {
        trains = new LinkedList<>();
        fileHandler = new FileHandler();
    }

    public void loadFromFile(String filename) {
        // Implement loading from file
    }

    public void addTrain(Train train) {
        trains.addToEnd(train);
    }

    public void displayTrains() {
        trains.display();
    }

    public void saveToFile(String filename) {
        // Implement saving to file
    }

    public Train searchByTcode(String tcode) {
        // Implement search
        return null;
    }

    // Implement other methods as per the requirements
}
