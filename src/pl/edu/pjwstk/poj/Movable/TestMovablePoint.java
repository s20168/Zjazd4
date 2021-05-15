package pl.edu.pjwstk.poj.Movable;

import pl.edu.pjwstk.poj.Movable.Movable;
import pl.edu.pjwstk.poj.Movable.MovablePoint;

public class TestMovablePoint {
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(0, 0, 8, 4);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
    }

}
