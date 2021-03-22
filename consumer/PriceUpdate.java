package consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        // aumentando em 10% cada produto.
        product.setPrice(product.getPrice() * 1.1);

    }
}
