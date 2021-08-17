package model;

public class ColorSupplier {
    private static Object Color;

    public static Color getRandomColor() {
        return model.Color.values()[(int)Math.floor(Math.random() * model.Color.values().length)];
    }
}



