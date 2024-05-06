import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                Bienvenido(a) a Screenmatch
                1)Registra nueva pelicula
                2)Registra nueva serie
                
                9)Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del titulo de la pelicula: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuaio = new Pelicula();
                    peliculaUsuaio.setNombre(nombre);
                    peliculaUsuaio.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuaio.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuaio.mostrarFichaTecnica();
                    break;
                case 9:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
