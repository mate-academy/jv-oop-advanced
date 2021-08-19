package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        switch (new Randomizer().getRandomNumber(Randomizer.MIN, Randomizer.MAX)) {
            case 1: return "yellow";
            case 2: return "green";
            case 3: return "pink";
            case 4: return "blue";
            default: return "red";
        }
    }
}
