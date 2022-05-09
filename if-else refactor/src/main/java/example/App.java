package example;

public class App 
{
    public static void main( String[] args )
    {
        //Primera Implementación
        Thing thing = new Thing();
    
        thing.setName("gato");
        thing.printType();


        //Segunda Implementación
        ThingGood thingGood = new ThingGood();

        thingGood.setName("asdf");
        thingGood.printType();


        //Tercera Implementación
         ThingBad thingBad = new ThingBad();

         thingBad.name = "cactus";
         System.out.println(thingBad.getType());
    }
}