package core.basesyntax;

public class Figure implements FigureDrawing,Area {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * 10 * 10;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + 10
                + " units, color: "
                + getColor());

    }
}

