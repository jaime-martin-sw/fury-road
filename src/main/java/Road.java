import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Road {
    private List<Surface> surfaceList = new ArrayList<>();
    private int totalCostByFootLeft;
    private int totalCostByScooterLeft;
    private int accumulatedCostByFoot;
    private int accumulatedCostByScooter;
    private int[] calculatedCostByFoo;
    private int[] calculatedCostByScooter;
    private int[] calculatedCostByFootLeft;
    private int[] calculatedCostByScooterLeft;

    public Road (String roadSurfaces) {
        calculatedCostByFoo = new int[roadSurfaces.length()];
        calculatedCostByScooter = new int[roadSurfaces.length()];
        calculatedCostByFootLeft = new int[roadSurfaces.length()];
        calculatedCostByScooterLeft = new int[roadSurfaces.length()];
        loadSurfaces(roadSurfaces);

        System.out.println("Final loaded values:\n" + this);
    }

    public int calculateOptimizedJourney() {
        int solution = (totalCostByScooterLeft <= totalCostByFootLeft? totalCostByScooterLeft:totalCostByFootLeft);
        for (int i = 0; i < surfaceList.size() - 1 ; i++) {
            int newSolution = calculatedCostByScooter[i] + calculatedCostByFootLeft[i+1];
            if (newSolution <= solution) {
                solution = newSolution;
                System.out.println("Hop of the bike at i = " + i);
            }
        }
        return solution;
    }

    private void loadSurfaces(String roadSurfaces) {
        char[] roadSurfacesCharArray = roadSurfaces.toCharArray();
        for (int i = 0, j = roadSurfacesCharArray.length - 1; i < roadSurfacesCharArray.length; i++,j--) {
            loadSurface(roadSurfacesCharArray, i, j);
        }
    }

    private void loadSurface(char[] roadSurfacesCharArray, int i, int j) {
        Surface surfaceForward = Surface.LOOKUP.get(roadSurfacesCharArray[i]);
        Surface surfaceBackward = Surface.LOOKUP.get(roadSurfacesCharArray[j]);
        surfaceList.add(surfaceForward);
        totalCostByFootLeft += surfaceBackward.getCostByFoot();
        totalCostByScooterLeft += surfaceBackward.getCostByScooter();
        accumulatedCostByFoot +=  surfaceForward.getCostByFoot();
        accumulatedCostByScooter +=  surfaceForward.getCostByScooter();
        calculatedCostByFoo[i] = accumulatedCostByFoot;
        calculatedCostByScooter[i] = accumulatedCostByScooter;
        calculatedCostByFootLeft[j] = totalCostByFootLeft;
        calculatedCostByScooterLeft[j] = totalCostByScooterLeft;

      //  System.out.println("Partial load: \n" + this);
    }

    @Override
    public String toString() {
        return "Road{" +
                "surfaceList=" + surfaceList +
                "\n totalCostByFootLeft=" + totalCostByFootLeft +
                "\n totalCostByScooterLeft=" + totalCostByScooterLeft +
                "\n accumulatedCostByFoot=" + accumulatedCostByFoot +
                "\n accumulatedCostByScooter=" + accumulatedCostByScooter +
                "\n calculatedCostByFoo=" + Arrays.toString(calculatedCostByFoo) +
                "\n calculatedCostByScooter=" + Arrays.toString(calculatedCostByScooter) +
                "\n calculatedCostByFootLeft=" + Arrays.toString(calculatedCostByFootLeft) +
                "\n calculatedCostByScooterLeft=" + Arrays.toString(calculatedCostByScooterLeft) +
                '}';
    }
}
