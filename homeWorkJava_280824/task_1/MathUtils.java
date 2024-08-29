package de.telran.homeWorkJava_280824.task_1;

public class MathUtils {

    // Метод для нахождения целого значения для пары целых чисел
    public static int avg(int a, int b){
        return (a + b) / 2;
    }

    // Метод для нахождения среднего значения для пары дробных чисел
    public static double avg(double a, double b){
        return (a + b) / 2.0;
    }

    // Метод для нахождения среднего значения для целого и дробного числа
    public static double avg(int a, double b){
        return (a + b) / 2.0;
    }

    //Метод для нахождения среднего значения для массива целых чисел
    public static double avg(int[] numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Метод для нахождения среднего значения для массива дробных чисел
    public static double avg(double[] numbers){
        double sum = 0.0;
        for (double num : numbers){
            sum += num;
        }
        return sum / numbers.length;
    }

    // Метлд для нахождения максимального значения для пары целых чисел
    public static int max(int a, int b){
        return Math.max(a, b);
    }

    // Метод для нахождения максимального значения для пары дробных чисел
    public static double max(double a, double b){
        return Math.max(a, b);
    }

    //Метод нахождения максимального занчения для массива целых чисел
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения максимального значения для массива дробных чисел
    public static double max(double[] numbers){
        double max = numbers[0];
        for (double num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения минимального значения для пары целых чисел
    public static int min(int a, int b){
        return Math.min(a,b);
    }

    // Метод для нахождения минимального значения для пары дробных чисел
    public static double min(double a, double b){
        return Math.min(a,b);
    }

    // Метод для нахождения минимального значения для масива целых чисел
    public static int min(int[] numbers){
        int min = numbers[0];
        for (int num : numbers){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    // Метод для нахождения минимального значения для массива дробных чисел
    public static double min(double[] nambers){
        double min = nambers[0];
        for (double num : nambers){
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
