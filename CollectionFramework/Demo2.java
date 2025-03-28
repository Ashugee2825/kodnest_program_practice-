package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Keys price1 = new Keys(100);
        Keys price2 = new Keys(200);
        Keys price3 = new Keys(300);
        Keys price4 = new Keys(400); // Duplicate key

        Map<Keys, String> products = new HashMap<>();
        products.put(price1, "Banana");
        products.put(price2, "Apple");
        products.put(price3, "Guava");
        products.put(price4, "Banana"); // Overwrites the previous "Banana" due to duplicate key

        System.out.println(products);
        
     
    }
//    public static Map removeDuplicates(Map original) {
//    	HashSet hs = new HashSet();
//    	
//    	HashMap hm = new HashMap();
//    	
//    	
//    	
//    	return Map();
//    }
}
