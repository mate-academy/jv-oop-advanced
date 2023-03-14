package core.basesyntax;

public abstract class Figure implements Behaviour, CalcArea {
    // Why can't I write 2 behavior in 1 interface(draw,getArea)?
    protected String color;
    
    protected Figure(String color) {
        this.color = color;
    }
}
