package be.vdab.builder.taken;

public class Test {
    public static void main(String[] args) {
        // Creating a ConcreteBuilder
        Builder builder = new ConcreteBuilder();

        // Constructing the product directly
        builder.buildPart1("Custom Part 1");
        builder.buildPart2("Custom Part 2");
        Product product = builder.getResult();
        System.out.println(product);
        builder.buildPart1("BLA BLA");
        builder.buildPart2("BLA BLA");
        Product product2 = builder.getResult();
        System.out.println(product);
        System.out.println(product2);
    }
}
