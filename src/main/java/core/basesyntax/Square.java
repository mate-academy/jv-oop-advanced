package core.basesyntax;

public class Square extends Figure{

    public Square(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return "";
    }
}
