package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }

//    public abstract double getArea();
//
    public abstract String draw();
}
