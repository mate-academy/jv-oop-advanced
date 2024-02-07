package core.basesyntax;

public abstract class Figure implements Drawable, Calculable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract String getUniqueProperties();

    public abstract double calculateArea();

    // Declared final to make sure none of children will be able to change style.
    // It allows to change all representation at once
    public final String draw() {
        String figureName = this.getClass().getSimpleName()
                .replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2")
                .toLowerCase();
        return "Figure: " + figureName
                + ", area: " + calculateArea()
                + " sq. units, " + getUniqueProperties() + ", color: " + color;
    }
}
