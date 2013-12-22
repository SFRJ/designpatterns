package PizzaKata;

public class Pizza {

    private boolean base;
    private boolean tomato;
    private boolean cheese;
    private boolean oregano;
    private boolean meat;
    private boolean vegetables;
    private boolean cooked;

    public boolean isBase() {
        return base;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isOregano() {
        return oregano;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isVegetables() {
        return vegetables;
    }

    public void setBase(boolean base) {
        this.base = base;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }

    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }
}
