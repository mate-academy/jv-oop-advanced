package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private String typeOfFigure;

    public Figure(String color, String typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfFigure() {
        return typeOfFigure;
    }

    public void setTypeOfFigure(String typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }

    @Override
    public String draw() {
        return "Fugure: " + getTypeOfFigure() + ", color: "
                + getColor() + ", area: "
                + (double) Math.round(calculateArea() * 100) / 100 + " sq. units";
    }
}
