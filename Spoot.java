public class Spoot{
    private String spootName;
    private String spootColor;
     private int weight;
     private int age;
    private static int numSpoots = 0;
      
    Spoot(){
      this.spootName = "Bobby";
      this.spootColor = "White";
      //randomizes for the spoots that uses this spoot constructor
      this.weight = (int)(Math.random()*10);
      this.age = (int)(Math.random()*15);;
      numSpoots++;
    }
   Spoot(String spootName){
      this.spootName = spootName;
      this.spootColor = "Red";
      this.weight = 5;
      this.age = 2;
      numSpoots++;
    }
  Spoot(String spootColor, int weight){
      this.spootName = "Spootly";
      this.spootColor = spootColor;
      this.weight = weight;
      this.age = 2;
      numSpoots++;
    }

    Spoot(String spootName, String spootColor){
      this.spootName = spootName;
      this.spootColor = spootColor;
      this.weight = (int)(Math.random()*15);
      this.age = (int)(Math.random()*20); 
      numSpoots++;
    }
    
    Spoot(String spootName, String spootColor, int weight, int age){
      
      this.spootName = spootName;
      this.spootColor = spootColor;
      this.weight = weight;
      this.age = age;
      numSpoots++;
    }


    void describe(){
      System.out.println("My name is " + spootName + ". I am " +  age  + " years old. I am a "
                         + spootColor + " Spoot and I weight " + weight + " lbs.");
      
    }
    public static int getNumSpoots(){
      return numSpoots;
    }
    public String getSpootName(){// getter or accessor
      return spootName;
    }
    public String getSpootColor(){
      return spootColor;
    }
    public int getWeight(){
    return weight;
    }
    public int getAge(){
    return age;
    }
    //Setters
    public void setSpootName(String spootName){
      this.spootName = spootName;
    }
  public void setSpootColor(String spootColor){
      this.spootColor = spootColor;
    }
  public void setWeight(int weight){
    this.weight = weight;
  }
  public void setAge(int age){
    this.age = age;
  }
}
