package second;

import java.io.File;

/**
 * Created by Oksana on 16.02.2016.
 */
public class MainXB {


    public static void main (String [] args){

        File file = new File("src\\main\\java\\data\\product.xml");
        ProductJAXB g = new ProductJAXB();
        g.marshal();
        System.out.println("=============================================");
        g.unmarshaller();



    }
}
