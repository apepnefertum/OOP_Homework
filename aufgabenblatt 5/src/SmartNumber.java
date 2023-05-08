public class SmartNumber {

    // Instanzvariablen
    private double number;
    private boolean isInt;

    // Konstruktor
    public SmartNumber(double number) {
        setNumber(number);
    }

    /**
     * Pr�ft, ob die �bergebene Zahl ganzzahlig ist
     * @param x Die zu �berpr�fende Zahl
     * @return true, wenn ganzzahlig, false sonst
     */
    private boolean isInteger(double x) {
        return x == (int) x;
    }

    /**
     * Setzt die zu speichernde Zahl und aktualisiert die abh�ngige Variable isInt
     * @param number Die zu speichernde Zahl
     */
    public void setNumber(double number) {
        this.number = number;
        this.isInt = isInteger(number);
    }

    /**
     * Getter f�r die gespeicherte Zahl
     * @return Die gespeicherte Zahl
     */
    public double getNumber() {
        return this.number;
    }

    /**
     * Pr�ft, ob die gespeicherte Zahl gerade ist
     * @return true, wenn gerade, false sonst
     */

public boolean isEven() {
        if (!isInt) {
            System.out.println("isEven: Zahl ist nicht ganzzahlig");
            return false;
        }
        return this.number % 2 == 0;
    }

    /**
     * Pr�ft, ob die gespeicherte Zahl eine Primzahl ist
     * @return true, wenn Primzahl, false sonst
     */
    public boolean isPrime() {
        if (!isInt || number <= 1) {
            System.out.println("isPrime: Zahl ist nicht ganzzahlig oder zu klein");
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }  
}

/** - Die Methode `boolean isInteger(double x)` ben�tigt keinen Zugriff auf Instanzvariablen oder -methoden der Klasse, da sie nur den �bergebenen Parameter `x` verwendet, um zu �berpr�fen, ob die Zahl ganzzahlig ist. Daher k�nnte diese Methode als statisch geschrieben werden.

Die anderen Methoden, wie `setNumber(double number)`, `isEven()` und `isPrime()`, verwenden die Instanzvariablen `number` und `isInt`, um ihre Berechnungen durchzuf�hren oder den Zustand des Objekts zu �ndern. Daher sollten diese Methoden nicht als statisch deklariert werden, da sie direkt auf die Instanz des Objekts angewiesen sind. **/