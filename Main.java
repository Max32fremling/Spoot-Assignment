class Main {
  public static void main(String[] args) {
    
    Spoot laziestSpoot = new Spoot(); 
    Spoot mySpoot = new Spoot(); 
    //this is what gets my spoot from Spoot.java
    System.out.println("My Spoot is " + (mySpoot.getSpootName()) + ". He is " + 
          (mySpoot.getAge()) + " years old. He is a " + (mySpoot.getSpootColor()) + 
                       " Spoot and weighs " + (mySpoot.getWeight()) + " lbs.");
    System.out.println("*******************");
    //all the spoots
    Spoot someSpoot = new Spoot("Spootler", "Pink");
    Spoot oldSpoot = new Spoot("Henry", "Dark Grey", 20, 78);
    //sets the data field for the spoot
    laziestSpoot.setSpootName("Spoozy");
    laziestSpoot.setSpootColor("Orange");
    Spoot lonelySpoot = new Spoot("Bright Blue", 4);
    Spoot randomSpoot = new Spoot();
    randomSpoot.setSpootName("Spootna");
    randomSpoot.setWeight(6);
    Spoot[] family = {oldSpoot, new Spoot("Stoopla", "Turqoise", 3, 16),
                            new Spoot("Spooter", "Blue", 1, 6), someSpoot, randomSpoot, lonelySpoot, laziestSpoot};
    for(int i = 0; i < family.length; i++){
      family[i].describe();
      
      System.out.println("*******************");
    }


    System.out.println("There are " + Spoot.getNumSpoots() + " Spoots!");
  }
}
