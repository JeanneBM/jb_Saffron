import java.util.Scanner;

public class Switch {

    public static int menu() {
        System.out.println("Podstawowy szyk zdania niemieckiego wymaga czasownika (orzeczenia) na II miejscu.");
        System.out.println("Istnieje też szyk przestawny - czasownik na I miejscu, np. Hast du Zeit?,");
        System.out.println("oraz szyk końcowy - czasownik (orzeczenie) na końcu zdania");
        System.out.println(" ");

        System.out.println("Menu szyków:");
        System.out.println("-----------------");
        System.out.println("1. Szyk prosty");
        System.out.println("2. Szyk przestawny");
        System.out.println("3. Szyk końcowy");
        System.out.println(" ");
        System.out.println("Podaj szyk, którego spójniki chcesz zobaczyć: ");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();

        return w;
    }


    public static void main(String[] args) {

        String prosty[] = {"und", "aber", "oder", "sondern", "denn"};

       /* for (int i = 0; i<prosty.length; i++) {
            System.out.print(" " + prosty[i]);} */

        String przestawny[] = {"dann", "deshalb", "also", "sonst", "trotzdem", "außerdem"};

       /* for (int i = 0; i<przestawny.length; i++) {
            System.out.print(" " + przestawny[i]);} */

        String koncowy[] = {"dass", "weil", "ob", "wenn", "damit", "obwohl", "als"};

        /* for (int i = 0; i<koncowy.length; i++) {
            System.out.print(" " + koncowy[i]);} */

        Scanner in = new Scanner(System.in);
            int wybor = menu();

            switch (wybor) {
                case 1:
                    for (int i = 0; i < prosty.length; i++) {
                        System.out.println(" " + prosty[i]);}
                        break;

                case 2:
                    for (int i = 0; i < przestawny.length; i++) {
                        System.out.println(" " + przestawny[i]);}
                        break;

                case 3:
                    for (int i = 0; i < koncowy.length; i++) {
                        System.out.println(" " + koncowy[i]);}
                        break;

                default:
                    System.out.println("Nie ma takiej opcji!");
            }
    }
}
