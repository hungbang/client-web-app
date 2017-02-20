import SimpleStateful.Cart;
import model.Product;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by HungBang on 2/20/2017.
 */
@Stateless
public class ClientBean {
    @EJB
    public Cart cart;

    public List<Product> getProList(){
       return cart.findAllProduct();
    }

}
