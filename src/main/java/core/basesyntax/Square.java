package core.basesyntax;

public class Square extends Figure implements InitializingProperties, DrawFigures {
    public int side = 0;

    public Square(int side) {
        super.name = "Square";
        super.color = getRandomColor();
        this.side = side;
        getDraw();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + super.name + ", area : " + getArea()
                + " units, sides : " + side + " units, color : " + super.color);
    }
}
