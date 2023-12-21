public class BmiService {
    public double calculate (float mus, double tall){
        double IMT = (double) mus / (tall*tall);
        return IMT;
    }
}
