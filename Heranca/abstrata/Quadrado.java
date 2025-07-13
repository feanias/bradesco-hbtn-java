import java.text.DecimalFormat;

public class Quadrado extends Retangulo {
    private double lado;


    @Override    
    public double area() {
        return lado * lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            this.lado = Double.parseDouble(df.format(lado).replace(",", "."));
            setLargura(this.lado);
            setAltura(this.lado);
        }
    }

    @Override
    public String toString() {
        return super.toString().format("[Quadrado] %.2f", lado);
    }
    
}
