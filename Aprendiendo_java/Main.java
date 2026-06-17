/*estructura secuencial */

/* public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int suma = a + b ;
        System.out.println("la suma es:" + suma );
    }
}
 */

/*estructura selectiva */

/* public class Main {
    public static void main(String[] args) {

       int edad = 16;

    if (edad >= 18){

        System.out.println("es mayor de edad");
 
    } else {
        System.out.println("es menor de edad");
    }
    
    
}
}/* */

/*Estrutura repetitiva 

public class Main {
    public static void main(String[] args) {
        
 for (int i = 1; i<= 8 ; i++)
{
    System.out.println("Numero:" + i);
}


 }
    
}
 */




/* while 

public class Main {
    public static void main(String[] args) {
        
int i = 1;

while (i <= 6){
    System.out.println(i); 
    i++;
}


    }
    
} */


    /*do while 

    public class Main {
    
        public static void main(String[] args) {
            int i = 7;
            do{
                System.out.println(i);
                i++;
            } 
            while (i <= 8);

            }

        } */


            /* swicht


            public class Main {
            
                public static void main(String[] args) {
                    
                    int opcion = 3;

                    switch (opcion) {

                        case 1 :
                        System.out.println("opcvion 1");
                        break;

                        case 2:
                        System.out.println("opcion 2");
                        break;

                        case 3:
                            System.out.println("opcion 3");
                            break;

                        default:
                        System.out.println("opcion no valida");

                        
                    }


                }
            }
    */

/* 
  /*public class Main {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i + " es par");
            } else{
                System.out.println(i + " es impar");
            }
        }
    }
    
     */ 



    /*encapsulamiento */

    /* class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre,int edad){
            this.nombre = nombre;
            this.edad = edad;

        }
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public void mostrarDatos(){
            System.out.println("Nombre" + nombre);
            System.out.println("Edad" + edad);
        }
    
        
    }
    public class Main {
        public static void main(String[] args) {
            
            Persona p1 = new Persona (" jairo ",    25 );

            p1.mostrarDatos();
            p1.setNombre("carlos");

            System.out.println("nuevo nombre: " + p1.getNombre());
        }
        
    } */


        /*Herencia */
        /*  class Animal{
            public void sonido(){
                System.out.println("El animal hace un sonido");
            }
    


        }

        class Perro extends Animal{
                public void ladrar(){

                    System.out.println("Guau Guau");
                }

        }

        public class Main {
            public static void main(String[] args) {

                Perro perro= new Perro();

                perro.sonido();
                perro.ladrar(); 
                
            }
        
            
        }
 */




        /*polimorfismo */
/* 
        class Animal{

            public void sonido(){
                System.out.println("El animal hace un sonido");
            }
        }

        class Gato extends Animal{

            @Override

            public void sonido(){

                super.sonido();
                System.out.println("Miau");
            }

        }

        class Perro extends Animal{

            @Override
            public void sonido(){

                super.sonido();
                System.out.println("Guau");
            }
        }

            class Pollo extends Animal{

                    @Override

                
                public void sonido(){

                    super.sonido();
                    System.out.println("kikiriki");

                }


            }

            



        public class Main {

            public static void main(String[] args) {
                
                Animal a1 = new Gato();
                Animal a2 = new Perro();
                Animal a3 = new Pollo();



                a1.sonido();
                a2.sonido();
                a3.sonido();

            }
        
        }
    

     */


    /*Adtrasccion */

   /*  abstract class Vehiculo{
        
        abstract void acelerar();

        abstract void frenar();
    }

    class Carro extends Vehiculo{

        @Override

        void acelerar(){
            System.out.println("El carro esta acelerando");
        }

        void frenar(){
            System.out.println("y esta frenando despues");
        }

    }

    public class Main {

        public static void main(String[] args) {
            

        Carro carro =new Carro();

        carro.acelerar();
        carro.frenar();



        }
    }
 */




    /*Ejercicio*/ 

    /* abstract class Notificacion{

        abstract void enviarMensaje(String mensaje);
    }

    class Correo extends Notificacion{

        @Override
        void enviarMensaje(String mensaje){
            System.out.println("Enviando correo " + mensaje);
        }

        
    }

    class Sms extends Notificacion{

            @Override

            void enviarMensaje (String mensaje){

                System.out.println("Enviado mensaje de texto " + mensaje);
            }
    }

    class Whatsapp extends Notificacion {

        @Override

        void enviarMensaje(String mensaje){

            System.out.println("Enviar mensaje de whatsapp " + mensaje);

        }


    }

    public class Main {
    
        public static void main(String[] args) {
            
            Notificacion op1 = new Correo();
            Notificacion op2 = new Sms();
            Notificacion op3 = new Whatsapp();

            op1.enviarMensaje(" lo quiero mucho");
            op2.enviarMensaje(" tu codigo funciono");
            op3.enviarMensaje(" tu codigo funciona");


        }
    } */




   /*ejercicio 2 */

/* abstract class VehiculoParqueado{

        abstract void calcularCobro (int horas);

        

    }

    class Carro extends VehiculoParqueado{

        @Override

        void calcularCobro(int horas){

            System.out.println("El total a pagar es " + (horas * 5000));
        }

    }   

    class Moto extends VehiculoParqueado{

        @Override

        void calcularCobro(int horas){
            System.out.println("El total a pagar es " + (horas * 2000));
            }

    }

    class Camion extends VehiculoParqueado{

        @Override
        void calcularCobro(int horas){

            System.out.println("El total a pagar es " + (horas* 10000));
        }
    }

    public class Main {
    
        public static void main(String[] args) {
            
            VehiculoParqueado moto = new Moto();
            VehiculoParqueado carro = new Carro();
            VehiculoParqueado camion = new Camion();

            moto.calcularCobro (5);
            carro.calcularCobro (6);
            camion.calcularCobro(9);



        }
    }
 */



/*ejercicio 3 */



/* 
    abstract class Videojuego{

        abstract void Vender(String titulo, int precioBase);
    }

    class JuegoFisico extends Videojuego{

            @Override

            void Vender(String titulo, int precioBase){
                System.out.println ("Compraste " + titulo + " en formato fisico . total con envio $:" + (precioBase + 15000 ));
            }
        }

    class JuegoDigital extends Videojuego{

        @Override

        void Vender(String titulo, int precioBase){
            System.out.println("Compraste " + titulo + " en formato digital. Total con descuento" + (precioBase - 5000));
        }

    }

    public class Main {
    
        public static void main(String[] args) {
            
            Videojuego fisico = new JuegoFisico();

            Videojuego digital= new JuegoDigital();


            fisico.Vender("kratos",95000);
            digital.Vender("GTA 6", 320000);



        }
    }

 */


    /*----------------------------------------------------*/



    /* =============================================================================
                  PARTE 1: ESTRUCTURAS DE CONTROL ALGORÍTMICAS
=============================================================================
*/

/*
public class Main {
    public static void main(String[] args) {
        // Se crea e inicializa la primera variable entera 'a' con el valor 5
        int a = 5;
        // Se crea e inicializa la segunda variable entera 'b' con el valor 3
        int b = 3;
        // Se calcula la suma y se almacena en una nueva variable llamada 'suma'
        int suma = a + b;
        // Se imprime en la consola el mensaje con el resultado final calculado
        System.out.println("La suma es: " + suma);
    }
} 
*/

/*
public class Main {
    public static void main(String[] args) {
        // Se define la variable 'edad' con un valor inicial de 20
        int edad = 20;
        // Condición: Se evalúa si el valor de edad es mayor o igual que 18
        if (edad >= 18) {
            // Si la condición es verdadera, se ejecuta esta línea
            System.out.println("Es mayor de edad");
        } else {
            // Si la condición es falsa, se ejecuta esta otra línea
            System.out.println("Es menor de edad");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        // Se define la variable 'opcion' con el valor numérico 2
        int opcion = 2;
        // Se evalúa la variable ingresada para buscar una coincidencia
        switch (opcion) {
            case 1:
                // Si 'opcion' es igual a 1, imprime este mensaje
                System.out.println("Opción 1");
                // Detiene la ejecución del switch para no pasar a los siguientes casos
                break;
            case 2:
                // Si 'opcion' es igual a 2, imprime este mensaje
                System.out.println("Opción 2");
                // Detiene la ejecución del switch tras encontrar el caso
                break;
            default:
                // Si no coincide con ninguno de los casos anteriores, ejecuta esto
                System.out.println("Opción no válida");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        // Inicializa 'i' en 1; se repite mientras sea menor o igual a 5; suma 1 en cada vuelta
        for (int i = 1; i <= 5; i++) {
            // Muestra el número actual asignado a 'i' en la iteración
            System.out.println("Número: " + i);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        // Se declara la variable contador 'i' iniciando desde 1
        int i = 1;
        // El ciclo se ejecutará continuamente mientras 'i' sea menor o igual a 3
        while (i <= 3) {
            // Imprime el valor actual de la variable en pantalla
            System.out.println(i);
            // Incrementa el valor de 'i' en uno para pasar al siguiente número
            i++;
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        // Se declara la variable de control 'i' iniciando en 1
        int i = 1;
        do {
            // Se ejecuta esta instrucción de forma directa en la primera vuelta
            System.out.println(i);
            // Incrementa el valor de la variable de control
            i++;
        } while (i <= 3); // Evalúa al final si cumple la condición para repetir el bloque
    }
}
*/

/*
public class Main {    
    public static void main(String[] args) {        
        // Ciclo for que recorre los números uno por uno del 1 al 5
        for (int i = 1; i <= 5; i++) {            
            // Condicional: Evalúa si el residuo de dividir 'i' entre 2 es igual a cero
            if (i % 2 == 0) {                
                // Si el residuo es cero, significa que el número actual es par
                System.out.println(i + " es par");
            } else {                
                // Si el residuo no es cero, el número actual es impar
                System.out.println(i + " es impar");
            }        
        }    
    }
}
*/


/* =============================================================================
             PARTE 2: CONCEPTOS DE PROGRAMACIÓN ORIENTADA A OBJETOS
=============================================================================
*/

/*
// Se define el molde general llamado Carro
class Carro {
    // Atributos o propiedades que tendrá cada objeto Carro
    String marca;
    String color;
    
    // Método que define la acción o comportamiento de arrancar
    void arrancar() {
        System.out.println("El carro arrancó"); // Muestra un mensaje al activarse
    }
}

public class Main {
    public static void main(String[] args) {
        // Se crea una instancia real (Objeto) llamada 'carro1' usando el molde
        Carro carro1 = new Carro();
        // Se le asigna un valor específico a la propiedad 'marca' del objeto
        carro1.marca = "Toyota";
        // Se le asigna un valor específico a la propiedad 'color' del objeto
        carro1.color = "Rojo";
        // Se llama al método para ejecutar la acción de arranque
        carro1.arrancar();
        // Se imprime en consola el valor guardado en la propiedad marca
        System.out.println(carro1.marca);
    }
}
*/

/*
// Se define la clase Estudiante
class Estudiante {
    // Atributo global para almacenar el nombre del estudiante
    String nombre;
    
    // Constructor: Se ejecuta al crear el objeto y recibe un parámetro
    public Estudiante(String nombre) {
        // Asigna el nombre recibido al atributo global de la clase usando 'this'
        this.nombre = nombre;
    }
    
    // Método de comportamiento para imprimir los datos en consola
    void mostrar() {
        System.out.println("Nombre: " + nombre); // Imprime el valor actual de nombre
    }
}

public class Main {
    public static void main(String[] args) {
        // Se inicializa el objeto pasándole el argumento "Jairo" al constructor
        Estudiante e1 = new Estudiante("Jairo");
        // Invoca el método para visualizar la información inicializada
        e1.mostrar();
    }
}
*/

/*
// Se define la clase Persona con datos encapsulados
class Persona {
    // Atributos privados: No pueden ser accedidos directamente desde afuera
    private String nombre;
    private int edad;

    // Constructor para inicializar de forma controlada los atributos privados
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Guarda el nombre inicial
        this.edad = edad;     // Guarda la edad inicial
    }

    // Método Getter: Permite obtener el valor del atributo privado de forma segura
    public String getNombre() {
        return nombre; // Retorna el dato guardado
    }

    // Método Setter: Permite modificar el valor del atributo privado de forma segura
    public void setNombre(String nombre) {
        this.nombre = nombre; // Reemplaza el valor viejo por el nuevo
    }

    // Método general para imprimir toda la información
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre); // Muestra el nombre
        System.out.println("Edad: " + edad);     // Muestra la edad
    }
}

public class Main {
    public static void main(String[] args) {
        // Se instancia la persona asignándole datos iniciales mediante el constructor
        Persona p1 = new Persona("Jairo", 25);
        // Llama al método para mostrar el estado original del objeto
        p1.mostrarDatos();
        // Se cambia el atributo de manera segura usando el método público set
        p1.setNombre("Carlos");
        // Recuperamos e imprimimos el nuevo valor utilizando el método público get
        System.out.println("Nuevo nombre: " + p1.getNombre());
    }
}
*/

/*
// Clase Padre o Superclase general
class Animal {
    // Comportamiento general utilizable por cualquier tipo de animal
    public void sonido() {
        System.out.println("El animal hace un sonido"); // Mensaje base
    }
}

// Clase Hija o Subclase que extiende de la clase Animal
class Perro extends Animal {
    // Método propio y exclusivo de la subclase Perro
    public void ladrar() {
        System.out.println("Guau Guau"); // Mensaje de ladrido
    }
}

public class Main {
    public static void main(String[] args) {
        // Se crea un objeto de la subclase Perro
        Perro perro = new Perro();
        // El objeto ejecuta el método sonido() que heredó directamente de Animal
        perro.sonido();
        // El objeto ejecuta su método propio ladrar()
        perro.ladrar();
    }
}
*/

/*
// Clase base conceptual de Animal
class Animal {
    public void sonido() {
        System.out.println("El animal hace un sonido"); // Comportamiento por defecto
    }
}

// Subclase Gato que hereda de Animal
class Gato extends Animal {
    @Override // Sobreescribe obligatoriamente el comportamiento original del padre
    public void sonido() {
        System.out.println("Miau"); // Comportamiento específico de un gato
    }
}

// Subclase Perro que hereda de Animal
class Perro extends Animal {
    @Override // Sobreescribe el comportamiento original del padre
    public void sonido() {
        System.out.println("Guau"); // Comportamiento específico de un perro
    }
}

public class Main {
    public static void main(String[] args) {
        // Se crean dos referencias de tipo Animal apuntando a objetos hijos distintos
        Animal a1 = new Gato();
        Animal a2 = new Perro();
        // Invocación polimórfica: El mismo método ejecuta acciones distintas según el objeto real
        a1.sonido(); // Salida: Miau
        a2.sonido(); // Salida: Guau
    }
}
*/

/*
// Clase abstracta que define la idea de un vehículo (no se puede usar con 'new')
abstract class Vehiculo {
    // Método abstracto: No tiene cuerpo de código, obliga a los hijos a implementarlo
    abstract void acelerar();
}

// Clase concreta que hereda la estructura y le da una función real
class Carro extends Vehiculo {
    @Override // Implementa obligatoriamente la firma definida por el padre
    void acelerar() {
        System.out.println("El carro está acelerando"); // Detalle técnico de la acción
    }
}

public class Main {
    public static void main(String[] args) {
        // Se instancia la clase concreta Carro
        Carro carro = new Carro();
        // Ejecuta el método que recibió y construyó desde la abstracción
        carro.acelerar();
    }
}
*/

/*
// Abstracción: Define una base general abstracta para cualquier Persona
abstract class Persona {
    // Encapsulamiento parcial: 'protected' protege el dato pero permite que sea heredado
    protected String nombre;
    
    // Constructor de la clase abstracta para inicializar los datos heredables
    public Persona(String nombre) {
        this.nombre = nombre; // Asigna el nombre base
    }
    
    // Método abstracto obligatorio que define una acción conceptual
    abstract void trabajar();
}

// Herencia: Programador hereda y extiende toda la estructura de Persona
class Programador extends Persona {
    // Constructor del hijo que recibe el nombre
    public Programador(String nombre) {
        // super(): Llama obligatoriamente al constructor de la clase padre Persona
        super(nombre);
    }
    
    @Override // Polimorfismo: Implementa la acción específica de trabajar para este objeto
    void trabajar() {
        // Utiliza el atributo protegido heredado para imprimir la acción específica
        System.out.println(nombre + " está programando en Java");
    }
}

public class Main {
    public static void main(String[] args) {
        // Se crea un objeto Programador referenciado desde la clase abstracta Persona
        Persona p = new Programador("Jairo");
        // Ejecuta la lógica construida en la implementación final
        p.trabajar();
    }
}
*/