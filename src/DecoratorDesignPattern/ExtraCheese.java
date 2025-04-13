package DecoratorDesignPattern;

// is a base pizza

public class ExtraCheese extends ToppingDecorator {

    // has a base pizza
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+10;
    }

}
