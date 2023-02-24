package shape;

public abstract class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract Double area();
    public abstract Double volume();
}
