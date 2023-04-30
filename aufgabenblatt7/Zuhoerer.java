public class Zuhoerer {
    private String name;
    private Zeitansager ansager;

    public Zuhoerer(String name) {
        this.name = name;
    }

    public void setAnsager(Zeitansager ansager) {
        this.ansager = ansager;
    }

    public void update() {
        if (ansager != null) {
            String zeit = ansager.getZeit();
            System.out.println(name + " hat gerade die Zeitansage gehört: " + zeit);
        }
    }
}