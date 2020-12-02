package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;
    private double diagonal;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void calculateDiagonal() {
        diagonal = Math.sqrt(height * height + width * width);
    }

    @Override
    public void doAllCalculations() {

    }

    @Override
    public void calculateArea() {
        setArea(width * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, diagonal: " + diagonal
                + " units, color: " + getColor());
    }

}
