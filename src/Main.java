import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
        System.out.println(" ");
    }
}
// /*   public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean isCorrectName = false;
//        while (!isCorrectName) {
//            String name = scanner.nextLine(); //Считывает строку из System.in
//            isCorrectName = checkName(name);
//            if (!isCorrectName) {
//                System.out.println("Введите корректное имя!");
//            } else {
//                System.out.println(formatName(name));
//            }
//            }
//        }
//
//
//    private static boolean checkName(String name) {
//            String [] words = name.trim().split(" ");
//            return words.length == 3;
//        }
//    private static String formatName(String name) {
//        String[] words = name.trim().split(" ");
//        sortByLength(words);
//        String result = "";
//        for (int i = 0; i < words.length; i++) {
//            String str = words[i];
//            char firstChar = str.charAt(0);
//            if (!Character.isUpperCase(firstChar)) {
//                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
//            } else {
//                result += str + " ";
//            }
//        }
//        return result;
//    }
//
//    private static void sortByLength(String[] words) {
//        for (int i = 0; i < words.length - 1; i++) {
//            for (int j = 0; j < words.length - 1; j++) {
//                if (words[j].length() > words[j + 1].length()) {
//                    String tmp = words[j];
//                    words[j] = words[j + 1];
//                    words[j + 1] = tmp;
//                }
//            }
//        }
//    }
//    }
//
//
////class Main {
////    public static void main(String[] args) {
////        int[] nums = new int[11];
////        int value = 5;
////        for (int i = 0; i < nums.length; i++) {
////            nums[i] = value;
////            value++;
////            System.out.println(nums[i]);
////        }
////    }
////}
//
//
///* import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Укажите ваш рост:");
//        double height = scan.nextDouble();
//        System.out.println("Укажите ваш вес:");
//        double weight = scan.nextDouble();
//        Body.massIndex(weight, height);
//    }
//
//    public static class Body {
//        public static void massIndex(double weight, double height) {
//            double imt = (weight / Math.pow((height), 2));
//            if (imt < 18.5) {
//                System.out.println("Ниже нормального веса");
//            } else if (imt >= 25 && imt < 30) {
//                System.out.println("Избыточный вес");
//            } else if (imt >= 30 && imt < 35) {
//                System.out.println("Ожирение I степени");
//            } else if (imt >= 35 && imt < 40) {
//                System.out.println("Ожирение II степени");
//            } else if (imt >= 40) {
//                System.out.println("Ожирение III степени");
//            } else {
//                System.out.println("Нормальный вес");
//            }
//        }
//    }
//}*/



//public class Main {
//    public static void main(String[] args) {
//
//    int[] arr = {
//            15,
//            27,
//            3,
//            344,
//            17
//    };
//    int summ = 0;
//for (int i: arr) {
//        summ += i;
//    }
//System.out.println(summ / arr.length);
//}
//}