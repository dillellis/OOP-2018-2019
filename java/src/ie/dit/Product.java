package ie.dit;

import processing.data.TableRow;

public class Product
{
    private String name;
    private float price; //big decimal is used for money


    public Product(TableRow tr)
    {
        //Constructor chaining
        this(tr.getstring("Name"), tr.getFloat("Price"));
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    

}