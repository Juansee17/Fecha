import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {


        String entradaMes = JOptionPane.showInputDialog("Ingrese el número del mes (ejemplo: 10):");
        int mes = Integer.parseInt(entradaMes);

        String entradaDia = JOptionPane.showInputDialog("Ingrese el día (ejemplo: 18):");
        int dia = Integer.parseInt(entradaDia);

        String entradaAnio = JOptionPane.showInputDialog("Ingrese el año (ejemplo: 2026):");
        int anio = Integer.parseInt(entradaAnio);


        Fecha miFecha = new Fecha(mes, dia, anio);


        String mensajeFinal = "La fecha registrada es: " + miFecha.getMes() + "/" + miFecha.getDia() + "/" + miFecha.getAnio();
        JOptionPane.showMessageDialog(null, mensajeFinal);

        System.out.print("Verificación en consola mediante el método de la clase: ");
        miFecha.mostrarFecha();
    }
}