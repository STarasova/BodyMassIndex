public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double result = service.calculate(84F, 1.56F);
        System.out.println("Ваш индекс массы = " + result);
    }
}
