class  MedidorElectrico{
String numeroMedidor;
double lecturaAnterior;
double lecturaActual;

public MedidorElectrico(String numeroMedidor, double lecturaActual, double lecturaAnterior){
this.numeroMedidor = numeroMedidor;
this.lecturaAnterior = lecturaAnterior;
this.lecturaActual = lecturaActual;
if (lecturaActual >= lecturaAnterior) {
            this.lecturaActual = lecturaActual;
        } else {
            System.out.println("Error: La lectura actual no puede ser menor a la lectura anterior");
            System.out.println("Se ajustará la lectura actual al valor de la lectura anterior.");
            this.lecturaActual = lecturaAnterior;
        }
}

void calcularConsumo(){
double diferencia = this.lecturaAnterior - this.lecturaActual;
System.out.println("Dieferencia entre la lectura anterior y la actual: " + diferencia);
}

void registrarNuevaLectura(double nuevaLectura){
    this.lecturaActual = nuevaLectura;
    System.out.println("Nueva lectura: " + nuevaLectura);
}

void mostrarDatos(){
    System.out.println("----------------------------");
    System.out.println("Numero del medidor: " + numeroMedidor);
    System.out.println("Lectura anterior: " + lecturaAnterior);
    System.out.println("Lectura actual: " + lecturaActual);
    System.out.println("----------------------------");
}

public static void main(String[] args) {
    MedidorElectrico m1 = new MedidorElectrico("3B-23N", 0, 140);
m1.mostrarDatos();
m1.registrarNuevaLectura(135);
m1.calcularConsumo();
m1.mostrarDatos();
}
}