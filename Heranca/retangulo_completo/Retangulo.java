
import java.text.DecimalFormat;



public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else{
            DecimalFormat df = new DecimalFormat("#.##");
            this.largura = Double.parseDouble(df.format(largura).replace(",", "."));
        }
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else{
            DecimalFormat df = new DecimalFormat("#.##");
            this.altura = Double.parseDouble(df.format(altura).replace(",", "."));
        }
    }

    @Override
    public double area(){
        return largura * altura;
    }

    @Override
    public String toString() {
        return super.toString().format("[Retangulo] %.2f / %.2f", largura, altura);
    }
    
}
