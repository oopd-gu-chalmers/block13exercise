package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.List;

public abstract class AbstractManipulatedPolygon extends AbstractPolygon {
    private AbstractPolygon base;

    protected AbstractManipulatedPolygon(AbstractPolygon base){
        this.base = base;
    }

    @Override
    protected List<Point> getPoints() {
        return getPointsWithBase(base);
    }

    @Override
    public Point getCenterPoint() {
        return base.getCenterPoint();
    }

    protected void setBasePolygon(AbstractPolygon base){
        this.base = base;
    }
}
