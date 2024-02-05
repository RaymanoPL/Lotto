public class Main {
    public static void main(String[] args) {
        UniqueNumberGenerator setUniqueNumberGenerator = new SetUniqueNumberGenerator(1, 49);
        UniqueNumberGenerator listUniqueNumberGenerator = new ListUniqueNumberGenerator(1, 49);
        System.out.println("Implementacja SetUniqueNumberGenerator:");
        for (int i = 0; i < 6; i++) {
            System.out.println(setUniqueNumberGenerator.nextNumber());
        }
        System.out.println();
        System.out.println("Implementacja ListUniqueNumberGenerator:");
        for (int i = 0; i < 6; i++) {
            System.out.println(listUniqueNumberGenerator.nextNumber());
        }
    }
}
