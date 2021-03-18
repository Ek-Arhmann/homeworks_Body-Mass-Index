public class BmiService {
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    public double calculate(double height, int weight){
        double result = weight / (height * height );
        System.out.println(roundAvoid(result, 2));
        return result;
    }
}
