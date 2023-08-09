package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[Main.RANDOM.nextInt(Color.values().length)].name();
    }
}
