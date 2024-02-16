package core.basesyntax.figure;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color;
    private static final String REGEX = "(\\p{Ll})(\\p{Lu})";

    public Figure(Color color) {
        this.color = color;
    }

    public void draw() {
        String figureName = this.getClass().getSimpleName()
                .replaceAll(Figure.REGEX, "$1 $2")
                .toLowerCase();
        System.out.print("Figure: " + figureName
                + ", area: " + calculateArea()
                + " sq. units, color: " + color + ", ");
    }
}
