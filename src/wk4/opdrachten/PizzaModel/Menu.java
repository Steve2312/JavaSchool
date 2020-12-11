package wk4.opdrachten.PizzaModel;

public class Menu {
    private Pizza[] Menu;
    public Menu() {
        Menu = new Pizza[4];
        Menu[0] = new Pizza("Margarita", 9.95);
        Menu[1] = new Pizza("Salami   ", 5.90);
        Menu[2] = new Pizza("Hawaii   ", 10.10);
        Menu[3] = new Pizza("Kaas     ", 7.00);
    }

    public Pizza[] getMenu() {
        return Menu;
    }

}
