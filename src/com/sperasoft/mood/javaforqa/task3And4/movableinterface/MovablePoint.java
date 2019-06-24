package com.sperasoft.mood.javaforqa.task3And4.movableinterface;

public class MovablePoint implements IMovable {

    private static final int X_SPEED = 0;
    private static final int Y_SPEED = 0;

    // we can make this class as inner
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

   
    public MovablePoint() {
        xSpeed=X_SPEED;
        ySpeed=Y_SPEED;

    }




    public MovablePoint(int x, int y) {
        setX(x);
        setY(y);

    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.xSpeed = speed;
        this.ySpeed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }



    @Override
    public void moveUp() {
        this.y += this.ySpeed;
        this.y += this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
        this.y -= this.xSpeed;
    }

    @Override
    public void moveLeft () {
        this.x -= this.xSpeed;
        this.x -= this.ySpeed;

    }

    @Override
    public void moveRight () {
        this.x += this.xSpeed;
        this.x += this.ySpeed;
    }
    @Override
    public String toString() {
        return "The point is "+ "x=" + getX() + " y=" + getY();
    }
}


