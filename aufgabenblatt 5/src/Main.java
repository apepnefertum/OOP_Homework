public class Main {
  public static void main(String[] args) {
        SmartNumber sn = new SmartNumber(5);
        System.out.println("Gespeicherte Zahl: " + sn.getNumber());
        System.out.println("Ist gerade? " + sn.isEven());
        System.out.println("Ist Primzahl? " + sn.isPrime());
        System.out.println();

        // Testen von Zahlen zwischen 1 und 20
        for (int i = 1; i <= 20; i++) {
            sn.setNumber(i);
            System.out.println(i + " ist gerade? " + sn.isEven());
            System.out.println(i + " ist Primzahl? " + sn.isPrime());
        }

        // Testen von gebrochenen Zahlen
        double[] fractions = {1.5, 2.5, 3.5, 4.5, 5.5};
        for (double fraction : fractions) {
            sn.setNumber(fraction);
            System.out.println();
            System.out.println("Gespeicherte gebrochene Zahl: " + sn.getNumber());
            System.out.println("Ist gerade? " + sn.isEven());
            System.out.println("Ist Primzahl? " + sn.isPrime());
        }
    }
}