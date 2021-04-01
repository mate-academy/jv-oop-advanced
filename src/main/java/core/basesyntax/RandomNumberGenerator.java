package core.basesyntax;

public class RandomNumberGenerator {
    public double getRandomProperties() {
        double max = 1.0;
        double min = 15.0;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getRandomNumber() {
        int numberOfFigures = 5;
        int min = 1;
        int max = numberOfFigures;
        int randomNumber = (int) (Math.random() * (max - min)) + min;
        return randomNumber;
    }
}
