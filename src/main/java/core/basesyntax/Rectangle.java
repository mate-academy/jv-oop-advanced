package core.basesyntax;

public class Rectangle extends Figure implements InitializingProperties, DrawFigures {
    public int widthRectangle = 0;
    public int lengthRectangle = 0;

    public Rectangle(int widthRectangle, int lengthRectangle) {
        super.name = "Rectangle";
        super.color = getRandomColor();
        this.widthRectangle = widthRectangle;
        this.lengthRectangle = lengthRectangle;
        getDraw();

    }

    @Override
    public double getArea() {
        return widthRectangle * lengthRectangle;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + super.name + ", area : " + getArea()
                + " units, widthRectangle : " + widthRectangle + " lengthRectangle : "
                + lengthRectangle + " units, color : " + super.color);
    }
}
