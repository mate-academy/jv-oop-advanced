public class Rectangle extends Figure {
    private int length;
    private int width;

public Rectangle(String color, String figureType, int length, int width) {
    super(color,figureType);
    this.length = length;
    this.width = width;
}

public int getLength() {
    return length;
}
public void setLength(int length) {
    this.length = length;
}
public int getWidth() {
    return width;
}

public void setWidth(int width) {
    this.width = width;
}

    @Override
    public double getArea() {

    return length * width;
    }
    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + "," + " area: " + getArea() + " sq.units, " +
                " length: " + length + " units, " +
                " width: " + width + " units, " +
                " color: " + getColor());
    }

}
