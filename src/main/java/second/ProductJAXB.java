package second;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Oksana on 16.02.2016.
 */
public class ProductJAXB {

    public void marshal(File f) {

        try {
            Product product = new Product(1212, "Vasiliy", new Date());
            JAXBContext ja = JAXBContext.newInstance(Product.class);

            Marshaller marhs = ja.createMarshaller();
            marhs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marhs.marshal(product, System.out);
            marhs.marshal(product, new PrintWriter(new BufferedWriter(new FileWriter(f, true))));


        } catch (Exception e) {
            System.out.println(e.getMessage());




        }
    }

    public void marshal() {

        try {
            Product product = new Product(1212, "Vasiliy", new Date());
            JAXBContext ja = JAXBContext.newInstance(Product.class);

            Marshaller marhs = ja.createMarshaller();
            marhs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marhs.marshal(product, System.out);
            marhs.marshal(product, new File("src\\main\\java\\data\\product.xml"));


        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void unmarshaller (){

        try{
            Product product1 = new Product(1212, "Vasiliy", new Date());
            JAXBContext ja = JAXBContext.newInstance(Product.class);

            Unmarshaller marhs = ja.createUnmarshaller();
            Product product = (Product)marhs.unmarshal(new File("src\\main\\java\\data\\product.xml"));

            System.out.println("product information:");
            System.out.println("id " + product.getId());
            System.out.println("name " + product.getName());
            System.out.println("date " + product.getDate());


        }catch (Exception e ){
                System.out.println(e.getMessage());

        }
    }


}
