/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.enclosingcircles;

/**
 *
 * @author LEVALLOIS
 */
public class Point {

    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point subtract(Point p) {
        return new Point(x - p.x, y - p.y);
    }

    public double distance(Point p) {
        return Math.hypot(x - p.x, y - p.y);
    }

    // Signed area / determinant thing
    public double cross(Point p) {
        return x * p.y - y * p.x;
    }

    // Magnitude squared
    public double norm() {
        return x * x + y * y;
    }

    public String toString() {
        return String.format("Point(%g, %g)", x, y);
    }

}

