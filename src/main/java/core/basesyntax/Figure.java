package core.basesyntax;

public abstract class Figure {
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

    public abstract double getArea();

    public void draw() {
        System.out.print("Figure");
    }

    public static void main(String[] args) {
        Figure[] figures = FigureSupplier.fillArrayOfFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
