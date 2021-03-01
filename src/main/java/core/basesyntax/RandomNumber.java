package core.basesyntax;

public abstract class RandomNumber {
    public String getProperty(String[] list) {
        int randomInt = (int) getRandomNumber(list.length);
        return list[randomInt];
    }

    public double getRandomNumber(int boundary) {
        return Math.random() * boundary;
    }
}
