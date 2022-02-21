package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class TranslatedPolygon extends AbstractManipulatedPolygon implements IPolygon {
    int xMove;
    int yMove;

    TranslatedPolygon(AbstractPolygon polygonToTranslate, int x, int y){
        super(polygonToTranslate);
        this.xMove = x;
        this.yMove = y;
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
        p.x += this.xMove;
        p.y += this.yMove;
    }

    @Override
    public Point getCenterPoint() {
        // the centerpoint from base is already defensively copied,
        // so we can safely mutate it here.
        Point baseCenter = super.getCenterPoint();
        baseCenter.x += xMove;
        baseCenter.y += yMove;
        return baseCenter;
    }
}
