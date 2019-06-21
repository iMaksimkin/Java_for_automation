package com.sperasoft.mood.javaforqa.Task3.innerClassesAndInterfaces;

public class MovableRectangle implements IMovable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();

    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();

    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();

    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override
    public String toString() {
        return " Topleft: " + this.topLeft.toString() +
                " BottomRight: " + this.bottomRight.toString();
    }

}
