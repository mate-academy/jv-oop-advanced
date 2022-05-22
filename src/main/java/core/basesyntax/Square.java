package core.basesyntax;

public class Square extends Figure implements Area{
    public Square(String color, String type) {
        super(color, type);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
