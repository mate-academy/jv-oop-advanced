package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq.units",
                getFigureName(), getArea());
    }

    private String getFigureName() {
        return String.join(" ",
                getClass().getSimpleName().split("(?=\\p{Upper})")).toLowerCase();
    }
}
