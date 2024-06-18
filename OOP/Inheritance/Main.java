public class Main{

    public static void main(String args[]){
        Flat flat = new Flat(1000, 2, 3, 4, "Magarpatta");
        System.out.println(flat.getSquareFootage());
    }
}

public class Building{

    int squareFootage;
    int stories;

    public Building(int squareFootage, int stories){
        this.squareFootage = squareFootage;
        this.stories = stories;
    }
}

public class House extends Building{

    int bedrooms;
    int baths;

    public House(int squareFootage, int stories, int bedrooms, int baths){
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }
}

public class Flat extends House{
    
    String society_name;

    public Flat(int squareFootage, int stories, int bedrooms, int baths, String society_name){
      super(squareFootage, stories, bedrooms, baths);
      this.society_name = society_name;
    }

    public int getSquareFootage(){
        return super.squareFootage;
    }
}