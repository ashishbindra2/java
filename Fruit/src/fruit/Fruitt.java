package fruit;

/**
 *
 * @author ASHISH
 */
class Fruit {
private String seeds,category;
private int price;
    Fruit(){
     seeds = null;
     category = null ;
     price = 0;
    }
    Fruit(String x,String y, int z){
         seeds = x;
         category = y;
         price = z;
    }

    void showOutput(){
            System.out.println("Seeds = "+seeds);
            System.out.println("category = "+category);
            System.out.println("price = "+price);
    }
    public String getSeeds(){ return seeds; }
    public String getCategory(){ return category; }
    public int getPrice(){ return price; }
    
    public String setSeeds(String x){ 
        seeds = x;
        return seeds;
    }
    public String setCategory(String x){ 
        category = x;
        return category; }
    public int setPrice(int z){ 
        price =z; 
        return price; }
}

  public class Fruitt{
    public static void main(String[] args) {
        
        Fruit f = new Fruit();
         System.out.println("Seed "+f.getSeeds()); 
         System.out.println("category"+f.getCategory()); 
         System.out.println("price "+f.getPrice()); 
         System.out.println("----------------------------------");
        Fruit f1 = new Fruit("a","z",1);
        f1.setSeeds("ccc");
        f1.showOutput();
      
    }
    
}
