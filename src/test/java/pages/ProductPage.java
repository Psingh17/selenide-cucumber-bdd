package pages;

import com.codeborne.selenide.ElementsCollection;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    private ElementsCollection productsCatalogue = $$x("//div[@class='productinfo text-center']/p");


    public void openProductPage() {
        open("/products");
    }

    public List<String> getAllProductsText() {
        //List<String> allProducts = new ArrayList<>();

        return productsCatalogue.texts();
    }
}
