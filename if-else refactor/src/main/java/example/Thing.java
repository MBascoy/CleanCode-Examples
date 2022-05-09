package example;

public class Thing {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void printType(){
        System.out.println(this.getType());
    }

    private String getType() {
        if(this.name.equals("gato")) return "animal";
        if(this.name.equals("cactus")) return"plant";
        if(this.name.equals("car")) return "object";
        
        return "unknown";
    }
}