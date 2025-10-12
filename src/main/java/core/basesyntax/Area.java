package core.basesyntax;
public interface Area {
    double getArea();
}

public interface Drawable {
    void draw();
}

public interface Figure extends Area, Drawable {
}