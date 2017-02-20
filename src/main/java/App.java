import SimpleStateful.Cart;
import SimpleStateful.CartService;
import model.Product;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

/**
 * Created by HungBang on 2/20/2017.
 */
@LocalBean
public class App {
    public static void main(String[] args) {
        Context context = EJBContainer.createEJBContainer().getContext();
        try {
            CartService cart = (CartService)context.lookup("java:global/EJDContainerExample/CartServiceImpl");
            System.out.println("====query result : "+ cart.getProList().get(0).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
