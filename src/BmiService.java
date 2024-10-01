public class BmiService {
    // Метод для расчета BMI
    public int calculate(double heightMeters, int weightKg) {
        // Расчет BMI по формуле: вес (кг) / (рост (м) ^ 2)
        double bmi = weightKg / (heightMeters * heightMeters);
        // Преобразование результата в целое число
        return (int) bmi;
    }
}