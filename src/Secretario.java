public class Secretario extends Empleado {
    public void MostrarMensaje() {
        System.out.println("Estoy haciendo fotocopias");
    }

    @Override//modificar los metodos del padre
    public int getVacaciones() {
        return super.getVacaciones();
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 5000;
    }

    @Override
    public int getHoras() {
        return super.getHoras() + 5;
    }
}
