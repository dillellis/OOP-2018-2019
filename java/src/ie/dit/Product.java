<<<<<<< HEAD
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
    

=======
package ie.dit;

import processing.data.*;

public class Product
{
    private String name;
    private float price;

    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String toString()
    {
        return name + "\t" + price;
    }

    public Product(TableRow tr)
    {
        // Constructor chaining
        this(tr.getString("Name"), tr.getFloat("Price"));
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
    
>>>>>>> 564abae82e8d3f647640a971484e0adc3b32b6f0
}