package com.sperasoft.mood.javaforqa.Task3.innerClassesAndInterfaces;

public class MovablePoint implements IMovable {

   //TODO MAGIC NUMBERS AND THIS POINT AND STATEMENT IN SETTERS X/Y/XSPEED/YSPEED TO BE NOT 0 AND minus value ?
    //todo xSpeed=ySpeed
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

   
    public MovablePoint() {

    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
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
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;;
    }

    @Override
    public void moveLeft () {
        this.x -= this.xSpeed;;
    }

    @Override
    public void moveRight () {
        this.x += this.xSpeed;;
    }
    @Override
    public String toString() {
        return "The point is "+ "x=" + getX() + " y=" + getY() + " xSpeed=" + getXSpeed() + " ySpeed=" + getYSpeed();
    }
}


