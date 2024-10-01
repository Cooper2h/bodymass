public class Main {
    public static void main(String[] args) {
        // Создание объекта BmiService
        BmiService service = new BmiService();

        // Пример данных: рост 1.87 метра, вес 98 кг
        double heightMeters = 1.87;
        int weightKg = 98;

        // Вызов метода calculate и получение результата
        int bmi = service.calculate(heightMeters, weightKg);

        // Печать результата
        System.out.println("Индекс массы тела (BMI): " + bmi);
    }
}