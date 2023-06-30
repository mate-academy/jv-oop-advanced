package core.basesyntax.model;

@FunctionalInterface
public interface Drawable {
    void draw();

    static String doubleToString(double value) {
        return String.format("%.1f", value).replace(",", ".");
    }
}
