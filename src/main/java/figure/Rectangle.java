package figure;

public class Rectangle extends Figure {

    private int lengthRectangle = 0;
    private int widthRectangle = 0;

    public Rectangle(String name) {
        setName(name);
        randomFigure();
    }

    public int getLengthRectangle() {
        return lengthRectangle;
    }

    public void setLengthRectangle(int lengthRectangle) {
        this.lengthRectangle = lengthRectangle;
    }

    public int getWidthRectangle() {
        return widthRectangle;
    }

    public void setWidthRectangle(int widthRectangle) {
        this.widthRectangle = widthRectangle;
    }

    public void resultArea() {
        setArea(getLengthRectangle() * getWidthRectangle());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", length: " + getLengthRectangle() + " units, "
                + "width: " + getWidthRectangle() + " units, "
                + "color: " + getColor());
    }

    @Override
    public void randomFigure() {
        super.randomFigure();
        setLengthRectangle(Figure.randomSideFigure());
        setWidthRectangle(Figure.randomSideFigure());
        resultArea();
    }
}
