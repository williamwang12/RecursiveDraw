public class Geometric {

    public Geometric(){

    }


    private double x[] = {0,1,1,0};
    private double y[] = {0,0,2,1};

    public void scale(int a){
        for (int i = 0; i < x.length;i++){
            x[i] = x[i] * a;
            y[i] = y[i] * a;
        }
    }

    public void translate(int dX, int dY){
        for (int i = 0; i < x.length;i++){
            x[i] += dX;
            y[i] += dY;
        }
    }

    public void rotate(int theta){
        for (int i = 0; i < x.length;i++){
            x[i] = x[i] * (Math.cos(Math.toRadians(theta))) - y[i] * (Math.sin(Math.toRadians(theta)));
            y[i] = y[i] * (Math.cos(Math.toRadians(theta))) + x[i] * (Math.sin(Math.toRadians(theta)));

        }
    }

}
