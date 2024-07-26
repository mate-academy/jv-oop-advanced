package core.basesyntax;

public abstract class Figure implements AreaCalculation, FigureData {
    protected String figureName;
    protected String color;

    public Figure(String color, String figureName) {
        this.color = color;
        this.figureName = figureName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(getColor() + "Figure: " + getFigureName() + " area: "
                + getArea() + "sq. units, "
                + getFigureData());
    }

    public String getFigureName() {
        return figureName;
    }
}
