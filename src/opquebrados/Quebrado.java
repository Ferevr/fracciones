package opquebrados;

public class Quebrado {
    int numerador;
    int denominador;

    public Quebrado(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Quebrado{" + "numerador = " + numerador + ", denominador = " + denominador + '}';
    }
    
    
    
}
