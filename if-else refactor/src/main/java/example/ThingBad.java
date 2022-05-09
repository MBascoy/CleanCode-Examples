package example;

public class ThingBad {

    public String name;

    public String getType(){
        if(this.name.equals("gato")){
            return "animal";
        }else if(this.name.equals("cactus")){
            return"plant";
        }else if(this.name.equals("car")){
            return "object";
        }else{
            return "unknown";
        }
    }
}
