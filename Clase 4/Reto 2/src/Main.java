public class Main {
    public static void main(String[] args) {


        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 700.0);


        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 13000.0);


        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();


        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
