package boletin3;

public class Boletin3 {

    public static void main(String[] args) {
        //A Crear objeto de tipo consume
        ImpDatos consume = new ImpDatos();
        //B
        consume.setLitros(50f);
        consume.setPrecioGasolina(1.57f);
        float litro = consume.getLitros(), gas = consume.getPrecioGasolina();
        System.out.println("Litros= " + litro + " Preciogas= " + gas);
        //C
        ImpDatos consumo = new ImpDatos(50f, 8f, 50f, 1.4f);
        //D
        float consumoMed = consumo.consumoMedio();
        System.out.println("El consumo medio es " + consumoMed + "l/km");
        //E
        consumo.setLitros(20f);
        float litros = consumo.getLitros();
        System.out.println("Los listros consumidos es=" + litros);
        //F
        float velocidadMedia = consumo.velocidadMedia();
        System.out.println("Este es el velocidad media " + velocidadMedia + "km/h");

    }
;
}
