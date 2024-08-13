import java.util.Scanner;

public class BiletSatis {
    public static void main(String[] args) {
       System.out.println("Yas:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("lastName");
        String lastName = scanner.next();
        if (biletSatayimMi2(age, lastName)) {
            System.out.println("Bilet sat");
        } else {
            System.out.println("Bilet satma");
        }

//        if(biletSatayimMi(age)) {
//            System.out.println("Bilet sat");
//        }else {
//            System.out.println("Bilet satma");
        }

    public static boolean biletSatayimMi2(int age) {
            if (age >20) {
                return true;
            }
            return false;
        }
    public static boolean biletSatayimMi2(int age, String  lastName) {
        if (age >20 && lastName.equalsIgnoreCase("Ahmet"))

            return true;

        return false;
    }
}

