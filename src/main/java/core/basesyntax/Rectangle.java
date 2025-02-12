package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double heigth;

    public Rectangle(String color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + ", sq. units, width: " + width
                + ", heigth: " + heigth
                + ", color: " + color);
    }
}
