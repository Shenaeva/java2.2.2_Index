public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 172_0;
        float weight = 62_0;
        float index = service.calculate(height, weight);
        System.out.println(index);
    }
}
