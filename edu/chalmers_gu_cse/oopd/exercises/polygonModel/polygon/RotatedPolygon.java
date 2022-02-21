package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class RotatedPolygon extends AbstractManipulatedPolygon implements IPolygon {
    private double radians;

    RotatedPolygon(AbstractPolygon base, double radians) {
        super(base);
        this.radians = radians;
    }

    @Override
    public IPolygon translate(int x, int y) {
        // TODO: This is for you to implement
        return null;
    }

    @Override
    public IPolygon rotate(double radians) {
        // TODO: This is for you to implement
        return null;
    }

    @Override
    public IPolygon scale(double x, double y) {
        // TODO: This is for you to implement
        return null;
    }

    @Override
    protected void manipulatePoint(Point center, Point p) {
        rotatePoint(center, p, this.radians);
    }
    private static void rotatePoint(Point center, Point point, double alpha) {
        double newX = center.x + (point.x - center.x) * Math.cos(alpha) - (point.y - center.y) * Math.sin(alpha);
        double newY = center.y + (point.x - center.x) * Math.sin(alpha) + (point.y - center.y) * Math.cos(alpha);
        point.x = (int) newX;
        point.y = (int) newY;
    }
}
