package core.basesyntax.figure;

public abstract class Figure implements Drawable, AreaCalculator {
    private static final String REGEX_STRING = "(\\p{Ll})(\\p{Lu})";

    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void draw() {
        String figureName = this.getClass().getSimpleName()
                .replaceAll(Figure.REGEX_STRING, "$1 $2")
                .toLowerCase();
        System.out.print("Figure: " + figureName
                + ", area: " + calculateArea()
                + " sq. units, color: " + color + ", ");
    }
}
