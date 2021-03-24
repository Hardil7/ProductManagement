/*
 * Copyright (C) 2021 Hardil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author Hardil
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");
        // TODO code application logic here
        pm.parseProduct("D,101,Tea,1.99,0,2021-05-23");
        pm.printProductReport(101);        
        pm.parseReview("101,4,Nice hot cup of tea");
        pm.parseReview("101,2,Rather weak tea");
        pm.parseReview("101,4,Fine Tea");
        pm.parseReview("101,4,Good Tea");
        pm.parseReview("101,5,Perfect Tea");
        pm.parseReview("101,3,Just add some lemon");
        pm.printProductReport(101);
        
//        pm.changeLocale("ru-RU");

        pm.parseProduct("D,102,Coffee,1.99,0,2021-05-23");
        pm.parseReview("102,3,Coffee was ok");
        pm.parseReview("102,1,where is the milk");
        pm.parseReview("102,5,It's perfect with ten spoons of sugar");
        pm.printProductReport(102);
//
        pm.parseProduct("F,103,Cake,3.99,0,2021-03-15");
        pm.parseReview("103,5,Very nice cake");
        pm.parseReview("103,4,It's very good, but i expected more chocolate");
        pm.parseReview("103,5,Cake's perfect");
        pm.printProductReport(103);

        pm.parseProduct("F,104,Cookie,2.99,0,2021-03-25");
        pm.parseReview("104,3,Just another cookie");
        pm.parseReview("104,3,Ok");
        pm.printProductReport(104);

        pm.parseProduct("D,105,Hot Chocolate,2.50,0,2021-05-23");
        pm.parseReview("105,4,Tasty");
        pm.parseReview("105,4,Not bad at all");
        pm.printProductReport(105);

        pm.parseProduct("D,106,Chocolate,2.50,0,2021-03-25");
        pm.parseReview("106,2,Too Sweet");
        pm.parseReview("106,3,Better than cookie");
        pm.parseReview("106,2,Too bitter");
        pm.parseReview("106,1,I don't get it!");
        pm.printProductReport(106);
        
//        Comparator<Product> ratingSorter = (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
//        Comparator<Product> priceSorter = (p1,p2) -> p2.getPrice().compareTo(p1.getPrice());
//        pm.printProducts( (p) -> p.getPrice().floatValue() < 2, ratingSorter);
//        pm.getDiscounts().forEach((rating,discount) -> System.out.println(rating+"\t"+discount));
//        pm.printProducts(priceSorter);
    }

}
