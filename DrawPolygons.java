/* This is now all we (can) use from the sub-package */
import edu.chalmers_gu_cse.oopd.exercises.controller.PolygonClicker;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.PolygonModel;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.PolygonFactory;
import edu.chalmers_gu_cse.oopd.exercises.view2d.PolygonViewer;

public class DrawPolygons {

    public static void main(String[] args) {
        PolygonModel polygons = initModel();
        PolygonViewer view = initViewForModel(polygons);
        PolygonClicker controller = new PolygonClicker(polygons, view);

        polygons.animate();

    }//main

    public static PolygonModel initModel(){
        PolygonModel polygons = new PolygonModel();

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;
    }//initModel

    private static PolygonViewer initViewForModel(PolygonModel polygonModel) {
        PolygonViewer view = new PolygonViewer();
        view.addModel(polygonModel);
        polygonModel.addListener(view);
        return view;
    }//initViewForModel

}//DrawPolygons