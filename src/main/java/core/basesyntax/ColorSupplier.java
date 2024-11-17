package core.basesyntax;

public class ColorSupplier {
    public Color getRandomColor() {
         int i = new Random().nextInt(Color.values().length);
         return Color.values()[i];
}
}

