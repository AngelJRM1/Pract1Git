public class Jarra {//variables de instancia
    private int cantidad;
    private int capacidad;
    public Jarra(int capacidadInicial){
        if(capacidadInicial<=0){
            throw new RuntimeException("ERROR: no se pueden crear jarras " +
                    "con capacidad menor o igual que cero.");
        }
        this.capacidad=capacidadInicial;
    }
    // Aquí vendrán después los métodos creados en la siguiente fase
    public void llenaDesde(Jarra j){
        while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
            this.cantidad++;
            j.cantidad--;
        }
    }
    public String toString(){
        return ("("+this.capacidad+","+this.cantidad+")");
    }
    public void metodoComunitario(){
// Comentario incluido para pruebas
        System.out.println("Aqui escribimos todos");
    }
}