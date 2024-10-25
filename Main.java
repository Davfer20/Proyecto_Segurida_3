// import statement removed as Amount is assumed to be in the same package

public class Main {
    public static void main(String[] args) {
        Amount amount1 = new Amount(10, 0);   // 5 euros y 50 centavos
        Amount amount2 = new Amount(11, 0);   // 5 euros y 50 centavos


        Amount negatedAmount = amount1.negate();
        System.out.println("Negado: " + negatedAmount.getEuros() + " euros y " + negatedAmount.getCents() + " centavos");

        Amount result = amount1.subtract(amount2);
        System.out.println("Resultado de la resta: " + result.getEuros() + " euros y " + result.getCents() + " centavos");
    }
}