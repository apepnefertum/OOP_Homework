public class Zuhoerer {
    private String name; 
    private Zeitansager ansager;  // Observable

    public Zuhoerer(String name) { 
        this.name = name; 
    }
    
    public void setAnsager(Zeitansager ansager) { 
        this.ansager = ansager;
    }

    public void update() {  // Observer
        if (ansager != null) { 
            String zeit = ansager.getZeit(); 
            System.out.println(name + " hat gerade die Zeitansage gehört: " + zeit);   
        }
    }
}