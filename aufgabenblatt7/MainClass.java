public class MainClass {
    public static void main(final String[] args) {
        final Zeitansager ansager = new Zeitansager();
        final Zuhoerer maria = new Zuhoerer("Maria");
        final Zuhoerer sepp = new Zuhoerer("Sepp");

        ansager.schreibeEin(maria);
        ansager.schreibeEin(sepp);

        ansager.sagAn(); // Maria und Sepp hören die Zeitansage

        ansager.trageAus(maria);

        ansager.sagAn(); // Nur Sepp hört die Zeitansage
    }
}
