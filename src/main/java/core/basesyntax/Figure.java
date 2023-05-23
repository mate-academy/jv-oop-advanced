package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDraw {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        String string = "Figure: " +this.getClass().getSimpleName();
        string += ", area: " + String.format("%.1f", this.obtainArea()) + " sq.units";
        System.out.print(string);
    }
}
