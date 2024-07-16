package javaapp;

public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        DummyDataFactory.preloadData(productCatalog);
        MainMenu mainMenu = new MainMenu(productCatalog);
        while(true) {
            mainMenu.displayMainMenu();
            mainMenu.handleMainMenuInput();
        }
    }
}
