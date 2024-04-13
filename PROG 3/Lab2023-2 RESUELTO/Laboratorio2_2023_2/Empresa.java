abstract class Empresa implements Consultable {
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
