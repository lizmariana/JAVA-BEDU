public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(320, "Servicio de limpieza", "ADS09");

        // Factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura(15000, "Alimentos", null);

        // Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}