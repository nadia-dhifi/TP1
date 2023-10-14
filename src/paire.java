import java.util.List;

class Paire<T1, T2> {
    private T1 premier;
    private T2 deuxieme;

    public Paire(T1 premier, T2 deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    public T1 getPremier() {
        return premier;
    }

    public T2 getDeuxieme() {
        return deuxieme;
    }

    @Override
    public String toString() {
        return "(" + premier + ", " + deuxieme + ")";
    }
}