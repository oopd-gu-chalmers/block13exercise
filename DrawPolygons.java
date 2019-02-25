/* This is now all we (can) use from the sub-package */
import polygons.IPolygon;
import polygons.PolygonFactory;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT952.shapes package.
 */
// import DIT952.adapter.*;

public class DrawPolygons {

    public static PolygonModel initPolygons(){
        PolygonModel polygons = new PolygonModel();

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;

    }//constructor

    public static void main(String[] args) {
        PolygonModel polygons = initPolygons();
        PolygonViewer view = new PolygonViewer();
        view.add(polygons);
        PolygonController controller = new PolygonController(polygons, view);

        polygons.animate();

    }//main

}//DIT952.DrawPolygons