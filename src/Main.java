import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la inmersión en Java!");
        // System.out.println("Pelicula Matrix");
        // Declaracion de variables;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
        int desafioAlura=1;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Puntuación del 1 al 5: " + evaluacion);
        System.out.println("Plan basico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de matrix: " + mediaEvaluacion);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula POPULAR en el momento");
        }else {
            System.out.println("Pelicula RETRO que vale la pena ver");
        }
        /*
        for (int i = 0; i < 3; i++) {
                Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificacion a Matrix:");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
*/
        while(desafioAlura<=3){
            Scanner teclado = new Scanner(System.in); //Todas las clases comienzan con mayuscula la primera letra Scanner,String,etc
            System.out.println("Ingresa la calificacion a Matrix:");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            desafioAlura++;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es " + mediaEvaluacionUsuario/3 +"/10.0");
    }
}
//01:10:00



























