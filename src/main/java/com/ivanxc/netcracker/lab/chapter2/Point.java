package com.ivanxc.netcracker.lab.chapter2;

public class Point {
    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(int x, int y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }
}
