// import statement removed as Amount is assumed to be in the same package

public class Main {
    public static void main(String[] args) {
        Amount amount1 = new Amount(5, 50);   // 5 euros y 50 centavos
        Amount amount2 = new Amount(5, 50);   // Otra cantidad igual

        // Llamar al método equal
        boolean isEqual = amount1.equal(amount2);  
        System.out.println(isEqual);

    }
}