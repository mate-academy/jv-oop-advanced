package core.basesyntax;

public class Square extends Figure implements ArreaCounter {
    private int side = 0;
    Square(int side, Colors color){
        super();
        countArea();
        this.setColor(color);
    }
    @Override
    public void countArea() {
        float result = (float) (side * side);
        setArea(result);
    }
}