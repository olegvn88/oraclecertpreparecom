package ke.patterns.factory_method;

interface Product {
    default public String printValue() {
        return "";
    }
}

interface Product2 {
    default public String printValue() {
        return "";
    }
}

class ConcreteProductA implements Product {

}

class ConcreteProductB implements Product {

}

class ConcreteProductC implements Product {
    public String printValue() {
        return "Print ConcreteProductC";
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

class ConcreteCreatorC extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductC();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        // an array of creators
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB(), new ConcreteCreatorC()};
        // iterate over creators and create products
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }

        Product p = new ConcreteCreatorC().factoryMethod();
        System.out.println(p.printValue());

        Product p2 = new ConcreteCreaterD().factoryMethod();
        System.out.println(p2.printValue());
    }
}

class ConcreteProductD implements Product {
    @Override
    public String printValue() {
        return "ConcreteProductD";
    }
}

class ConcreteCreaterD extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductD();
    }
}