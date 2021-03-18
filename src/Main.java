public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double height = 1.68;
            int    width  = 55;
            service.calculate(height, width);
        }
    }

