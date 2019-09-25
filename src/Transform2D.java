public class Transform2D {

    public static double[] copy(double[] array){
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void scale(double[] x, double[] y, double alpha){
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }

    public static void translate(double[] x, double[] y, double dX, double dY){
        for (int i = 0; i < x.length;i++){
            x[i] += dX;
            y[i] += dY;
        }
    }

    public static void rotate(double[] x, double[] y, double theta){
        for (int i = 0; i < x.length;i++){
            x[i] = x[i] * (Math.cos(Math.toRadians(theta))) - y[i] * (Math.sin(Math.toRadians(theta)));
            y[i] = y[i] * (Math.cos(Math.toRadians(theta))) + x[i] * (Math.sin(Math.toRadians(theta)));

        }
    }

    public static void main(String[] args){
        StdDraw.setScale(-5.0,+5.0);
        double[] x = {0,1,1,0};
        double[] y = {0,0,2,1};
        double alpha = 2.0;

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x,y);
        scale(x,y,alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x,y);
    }
}
