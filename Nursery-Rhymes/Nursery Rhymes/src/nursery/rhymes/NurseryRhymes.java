/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        farm("cow", "moo");
        farm("duck", "quack");
        farm("pig", "oink");
        monkeys(10);
        monkeys(9);
        monkeys(8);
        hickory_dickory(1);
        hickory_dickory(2);
        hickory_dickory(3);
        milk(100);
        milk(99);
        milk(98);
        hokey_pokey("left hand");
        hokey_pokey("Right hand");
        bingo("Joseph");
        bingo("Bryan");
        frogs(3);
        frogs(2);
        
              
        
    }
    
    public static void farm(String animal, String sound){
        System.out.println();
        System.out.println("old mcdonald had a farm \n e-i-e-i-o! \n and on that farm he had a " + animal + "\n e-i-e-i-o! \n with a "+ sound + sound + "here and a " + sound + sound + "There, \n e-i-e-i-o! \n");
    }
    public static void monkeys(int monNum){
        System.out.println();
       System.out.println(monNum + " Monkeys jumping on the bed \n one jumped off and bumped his head \n Momma called the doctor, and the doctor said: \n \" No more monkeys jumping on the bed \"");
    } 
    public static void hickory_dickory(int time){
        System.out.println();
        System.out.println("Hickory, dickory, dock, \n The mouse ran up the clock; \n The clock stuck  " + time + "\n and down he run \n Hickory, dickory, dock.");
    }
    public static void milk(int milkNum){
        System.out.println();
        System.out.println( milkNum + "bottles of beer on the wall \n " + milkNum + " bottles of beer \n you take one down, pass it around " + (milkNum-1) +" bottles of beer on the wall");
        
    }
    public static void hokey_pokey(String bPart){
        System.out.println();
        System.out.println("you put your " + bPart + "in \n" + "you put your "+ bPart + "out \n you put your " + bPart + "in \n and you shake it all about \n you do the hokey pokey and your turn yourself about \n that's what it's all about!");
    }
    public static void bingo(String dogName){
        System.out.println();
        System.out.println("There was a farmer who had a dog \n and 0" + dogName + "Was his name-o \n B-I-N-G-O\n B-I-N-G-O\n B-I-N-G-O \n and " + dogName + "Was his name-o");
        
    }
    public static void frogs(int frogNum){
        System.out.println();
        System.out.println(frogNum + " Little speckled frogs \n sat on a speckled log \n Eating the most delicious bugs. Yum Yum! \n one jumped in the pool \n where it was nice and cool \n now there are " + (frogNum - 1) + " Green speckled frogs");
                
        
    }
    
    
}
