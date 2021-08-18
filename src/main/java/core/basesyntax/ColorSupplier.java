package core.basesyntax;

public class ColorSupplier {
    protected final Randomizer randomizer;

    public ColorSupplier() {
        this.randomizer = new Randomizer();
    }

    public String getRandomColor() {
        switch (randomizer.getRandomNumber()) {
            case 1: return "yellow";
            case 2: return "green";
            case 3: return "pink";
            case 4: return "blue";
            default: return "red";
        }
    }
}
