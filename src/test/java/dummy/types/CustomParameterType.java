package dummy.types;

import dummy.objects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {


    @ParameterType("\"Blue Shoes\"|\"Yellow Shoes\"")
    public Product product(String name){
        return new Product(name);
    }
}
