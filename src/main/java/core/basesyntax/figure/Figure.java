package core.basesyntax.figure;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color;
    private final String regex;

    public Figure(Color color) {
        this.regex = "(\\p{Ll})(\\p{Lu})";
        this.color = color;
    }

    public void draw() {
        String figureName = this.getClass().getSimpleName()
                .replaceAll(this.regex, "$1 $2")
                .toLowerCase();
        System.out.print("Figure: " + figureName
                + ", area: " + calculateArea()
                + " sq. units, color: " + color + ", ");
    }
}
