public class triangulo {
    public static void main(String[] args) {
        System.out.println("Triángulo de altura 3:");
        printTriangle(3);
        System.out.println("\nTriángulo de altura 5:");
        printTriangle(5);
        System.out.println("\nTriángulo de altura 7:");
        printTriangle(7);
    }
    public static void printTriangle(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}