package facade.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschideUsaFata(){
        System.out.println("Usa din fata a fost deschisa pt autobuzul cu numarul " + this.nrInmatriculare);
    }
    public void deschideUsaMijloc(){
        System.out.println("Usa din din mijloc a fost deschisa pt autobuzul cu numarul " + this.nrInmatriculare);
    }
    public void deschideUsaSpate(){
        System.out.println("Usa din spate a fost deschisa pt autobuzul cu numarul " + this.nrInmatriculare);
    }
    public void remaneLiberaUsaFata(){
        System.out.println("Usa din fata poate fi deschisa de calatori pt autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void remaneLiberaUsaMijloc(){
        System.out.println("Usa din mijloc poate fi deschisa de calatori pt autobuzul cu numarul " + this.nrInmatriculare);
    }
    public void remaneLiberaUsaSpate(){
        System.out.println("Usa din spate poate fi deschisa de calatori pt autobuzul cu numarul " + this.nrInmatriculare);
    }
}
