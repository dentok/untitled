package second;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Oksana on 16.02.2016.
 */

@XmlRootElement(name = "product")
public class Product {


    private int id;
    private String name;
    private Date date;


    public Product(){}

    public Product (Integer s,String name, Date date){
        this.id = s;
        this.name = name;
        this.date = date;


    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @XmlElement
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
