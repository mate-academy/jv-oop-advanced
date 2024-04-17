package core.basesyntax;

public class Square implements Figure{
    private int said;

    public Square(int said) {
        this.said = said;
    }

    @Override
    public double getArea() {
        return said * said;
    }

    @Override
    public String getPrint() {
        return null;
    }
}
