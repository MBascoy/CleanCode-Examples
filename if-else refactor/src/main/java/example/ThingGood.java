package example;

import java.util.HashMap;
import java.util.Map;

public class ThingGood {

    private String name;
    private static final Map<String, String> things = new HashMap<>();

    ThingGood(){
        things.put("gato", "animal");
        things.put("cactus", "plant");
        things.put("car", "object");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printType(){
        System.out.println(this.getType());
    }

    private String getType(){
        String result;
        result = things.get(this.name);

        return (result == null) ? "unknown" : result;
    }
}