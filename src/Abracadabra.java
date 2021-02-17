import java.util.Scanner;

public class Abracadabra {
    public static void main(String[] args) {
        System.out.println("Введите длину рамки");
        int l = new Scanner(System.in).nextInt();
        System.out.println("Введите высоту рамки");
        int h = new Scanner(System.in).nextInt();
        System.out.println("Введите слово в рамке");
        String abracadabra = new Scanner(System.in).nextLine();

        if (abracadabra.length() < l-2) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < l; j++) {
                    if ((i == 0) || (j == 0) || (i == h - 1) || (j == l - 1)) {
                        System.out.print("*");
                    } else if ((i == ((h - 1) / 2)) &&
                            (j >= (l - abracadabra.length()) / 2) &&
                            (j <= ((l - abracadabra.length()) / 2) + abracadabra.length() - 1)) {
                        System.out.print(abracadabra.charAt(j - (l - abracadabra.length()) / 2));
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        } else System.out.println("Ошибка");
    }
}

