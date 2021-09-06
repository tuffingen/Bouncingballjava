import java.util.Timer;

public class bouncing {

    public static void main(String[] args) {

    double a = -9.82;
    double v0 = 0;
    double s = 100;


        for(int t = 0; t <= 100 ; t++) {
            System.out.println(s + " " + t+" "+ v0);
            if (s+v0 <= 0) {
                // v1 = v0 + at
                // s = s + v*deltaT
                //deltaT = 1/v
                double x = 1/v0;
                v0 = -v0;
                v0 = v0+(1-x)*a;
                s += v0;
            } else {
                s += v0;
                v0 = v0+a;
            }
        }
    }
}
