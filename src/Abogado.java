public class Abogado extends Empleado{
    public void MostrarMensaje(){
        System.out.println("Estoy en el tribunal");
    }
    @Override//modificar los metodos del padre
    public int getVacaciones() {
        return super.getVacaciones()/2;
    }

    @Override
    public double getSalario() {
        return super.getSalario()+1000;
    }

    @Override
    public int getHoras() {
        return super.getHoras()+5;
    }

    @Override
    public String getMesVacaciones() {
        return "Julio";
    }
}
