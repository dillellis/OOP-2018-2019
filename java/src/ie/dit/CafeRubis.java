package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class CafeRubis extends PApplet
{
    ArrayList<Product> products = new ArrayList<Product>();

    public void settings()
    {
        size(800,800);
    }

    public void setup()
    {
        loadProducts();
    }

    void loadProducts()
    {
        Table table = loadTable("cafe.csv", "header");

        for(TableRow tr:table.rows())
        {
            Product p = new Product(tr);
            products.add(p);
        }
            
    }

    void drawProductButton()
    {
        float border = 20;
        float buttonWidth = 100;
        float buttonHeight = 50;
        float gap = 10;
        
    }
}