package core.basesyntax;

public class Rectangle extends Figure {
    private double hight;
    private double width;

    public Rectangle(String color, double hight, double width) {
        super(color);
        this.hight = hight;
        this.width = width;
    }

    @Override
    public String getAdditionalInfo() {
        return "hight: " + hight + ", widht: " + width;
    }

    @Override
    public double getArea() {
        return hight * width;
    }

    @Override
    public String figureType() {
        return "Rectangle";
    }
}
