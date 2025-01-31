
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

/* TODO :
* CHANGE CLOUD DAMAGE BACK TO 35 checked
* ORGANIZE EVERYTHING checked
* SET CLOUDS MANA TO 0 AND SEE WHAT HAPPENS checked
* ADD XP checked
*MAX OUT GOBLIN HEALTH TO TEST BUFFS AND ATTACKS/ SEE WHAT HAPPENS WHEN CLOUD DIES 
*FIX TRY AGAIN SCREEN WHEN DEAD checked
*FIX EXP METHOD checked
*/


public class Stardust {
    //Used to check if character can attack or not (turns)
    Boolean PlayerAttacked = false;

    //EXP Calculations
    int goblinExpDrop = 300;
    int cloudExpGain = 0;
    int cloudExpCap = 300;
    int GolemExpDrop = 1000;


    
    //Clouds stats
    String name1 = "Cloud";
    int level1 = 1;
    int health1 = 300; // was 300
    int currentHealth1 = 300; // 300
    int mana1 = 100;
    int currentMana1 = 30;

    //Clouds attacks
    int playerDamage1 = 35;
    int blizzagaBlade = 60;
    int Cure = 75;
    int crossSlash = 120;

    // Goblins stats
    String goblin = "Goblin";
    int monsterHp = 400; //was 150
    int monsterCurrentHp = 400; //was 150
    int monsterAttack = 40; // 30
    int rampage = 60;
    int goblinMana = 50;
    int goblinCurrentMana = 10; //was 10

    // Final Boss Stats
    String Golem = "Golem";
    int GolemHP = 4000;
    int GolemCurrentHP = 4000;
    int GolemAttack = 40;
    int ObsidianGrasp = 250;
    int GolemMana = 60;
    int GolemCurrentMana = 50;
    int GolemRNG;

    // Goblins random choices
    int goblinRandomizer;
    int goblinAttackRandomizer;

    // Method for story & user input
    Scanner scanner = new Scanner(System.in);
    int start;
    int choice;


    //Main Game
    public static void main(String[] args){
        Stardust game = new Stardust();
        game.startUp();
    }

    public void startUp() {
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("    Welcome to Stardust    ");
        System.out.println();
        System.out.println("1:       New Game      ");
        System.out.println("2:       Continue      ");
        System.out.println("3:       Settings     ");
        System.out.println("4:       Exit Game     ");
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        start = scanner.nextInt(); 

        if(start == 1){
            try{
                System.out.println("Lets start the game");
                Thread.sleep(2000);
                story();
            }
            catch(Exception e){
            }
        }
        else if (start == 2){
            try{
                System.out.println("You have no existing save file");
                Thread.sleep(3000);
                startUp();
            }
            catch(Exception e){
            }
        }
        else if (start == 3){
            try{
                System.out.println("--------------------------------------------");
                System.out.println();
                System.out.println("This is a text based RPG that is meant to get you familar with the genre \nand a tutorial aid you along your journey");
                Thread.sleep(4000);
                System.out.println("Use the number pad to select your actions and progress through the story\n using the number pad. To click attacks and skills in a logical manner is key to suriving");
                Thread.sleep(2000);
                System.out.println("This game is turn based and requires you to plan attacks accordingly");
                System.out.println();
                System.out.println("--------------------------------------------");
                startUp();
            }
            catch(Exception e){
            }
        }
        else if (start == 4){
            System.out.println();
            System.out.println("Thanks for playing");
            
        }
        // else if (start != 1 && start != 2 && start != 3 && start != 4){
        //     System.out.println("Yooooo");
        //     startUp();
        // }
        

    }

    public void story(){
        try{
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You awake confused in a jail cell");
            Thread.sleep(2000);
            System.out.println("Cloud: ughh... how did i end up here");
            Thread.sleep(2000);
            System.out.println("Cloud: i'll figure that out later");
            Thread.sleep(1500);;
            System.out.println("Cloud: I need to get out of here");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println();
            Thread.sleep(2000);
            System.out.println("Press 1 to Continue");
            

        }
        catch(Exception e){
        }

        start = scanner.nextInt();

        if(start == 1){
            decision1();
        }
        else if (start != 1){
            story();
        }
    }

    public void decision1(){
        try{
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("You look around trying to find a way out of this jail cell");
            Thread.sleep(1000);
            System.out.println();
            System.out.println("1: Check the sink");
            Thread.sleep(1000);
            System.out.println("2: Check near the pile of bags");
            Thread.sleep(1000);
            System.out.println("3:Try breaking through the jail bars");
            Thread.sleep(1000);
            System.out.println("4: Give up");
            System.out.println("----------------------------------------------------------------------------------------------");
        }
        catch(Exception e){   
        }

        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("You check under and inside the sink bowl but find nothing");
            System.out.println();
            System.out.println();
            decision1();
        }
        else if (choice == 2){
            try{
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Cloud: Ugh, these smell horrible");
                Thread.sleep(2000);
                System.out.println();
                System.out.println("You rummage inside the bags and find a lockpick");
                Thread.sleep(2000);
                System.out.println();
                System.out.println("*Cloud lockpicks the door*");
                System.out.println();
                System.out.println("You walk out of the jail cell and start to search around for items");
                Thread.sleep(1500);
                System.out.println();
                Thread.sleep(1500);
                System.out.println("You decide to go through the broken cut up wooden door, and faced with a choice");
                System.out.println("----------------------------------------------------------------------------------------------");
                Thread.sleep(2000);
                System.out.println("Press 1 to Continue");
                start = scanner.nextInt();
            }
            catch(Exception e){
            }

            if(start == 1){
                decision2();
            }
            else if (start != 1){
                decision1();
            }
        }
        else if (choice == 3){
            try{
                System.out.println("You try rampaging head on for your escape.... and fail miserably");
                Thread.sleep(1500);
                System.out.println("Cloud took 5 damage");
                currentHealth1 = currentHealth1 - 5;
                Thread.sleep(1000);
            }
            catch(Exception e){
            }

            decision1();
        }
        else if (choice == 4){
            try{
                Thread.sleep(3000);
                System.out.println("You thought you could end the game that easily huh, get back to the game!!");
                System.out.println();
            }
            catch(Exception e){
            }

            decision1();
        }
        // if (start != 1 || start != 2 || start != 3 || start != 4){
        //     decision1();
        // }

    }

    public void decision2(){
        try{
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("You look around through a vacant hallway");
            Thread.sleep(1500);
            System.out.println();
            System.out.println("1: Check the first door");
            Thread.sleep(1500);
            System.out.println("2: Check the second door");
            Thread.sleep(1500);
            System.out.println("3:Check the third door");
            Thread.sleep(1500);
            System.out.println("4: Check the fourth door");
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println();
            Thread.sleep(1500);
            System.out.println("Pick your posion");
            choice = scanner.nextInt();

        }
        catch(Exception e){
        }
        if(choice == 1){
            try{
                System.out.println("You stumbled upon an empty room");
                Thread.sleep(2000);
                System.out.println("Cloud turns back");
                Thread.sleep(2000);
                decision2();
            }
            catch(Exception e){
            }
        }
        else if(choice == 2){
            try{
                System.out.println("You slowly open the door and fall into a booby trap\n instantly killing you");
                Thread.sleep(3000);
                System.out.println("*******GAME OVER*******");
                Thread.sleep(1500);
                System.out.println("Press 1 to Try Again");
                currentHealth1 = health1;
                choice = scanner.nextInt();
            }
            catch(Exception e){
            }

        if(choice == 1){
            decision2();
            }
        else if(choice != 1){
            decision2();
            }
        }

        
        else if(choice == 3){
            try{
                System.out.println();
                System.out.println("You go through the door and find half open crated near the corner of the room");
                System.out.println();
                Thread.sleep(2500);
                System.out.println("Press 1 to continue");
                choice = scanner.nextInt();
            }
            catch(Exception e){

            }
            if(choice == 1){
                story2();
            }
            else if (start != 1){
                decision2();
            }
        } 
        
            else if(choice == 4){
                try{
                    System.out.println("You go through the broken door only to be bitten by a snake creeping around");
                    Thread.sleep(2000);
                    System.out.println("Cloud took 15 damage");
                    currentHealth1 = currentHealth1 - 15;
                    Thread.sleep(1000);
                    decision2();
                }
                catch(Exception e){
                }
        }
    }

    public void story2(){
        try{
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("After looking around in the crate you find some gear");
            Thread.sleep(2000);
            System.out.println();
            System.out.println("******Cloud obtained the Buster Sword******");
            Thread.sleep(2000);
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("As soon as you obtained your gear a goblin heard the ruckus and found you out of your cell");
            Thread.sleep(3000);
            System.out.println();
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println("********You have entered the battle*********");
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println();
            Thread.sleep(1500);
            System.out.println("Press 1 to Continue");
        }
        catch(Exception e){
        }

        start = scanner.nextInt();

        if(start == 1){
            battlecommand();
        }
        else if(start != 1){
            story2();
        }
    }

    public void battlecommand(){
        try{
            System.out.println("\n-----------------------------------------------------------");
            Thread.sleep(1500);
            System.out.println("Goblins HP:" + monsterHp);
            System.out.println("\n-----------------------------------------------------------");
            Thread.sleep(1500);
            battle1();
        }
        catch(Exception e){
        }
    }

    public void battle1(){
        //check if goblin has health, if so loop until ded
        while(monsterCurrentHp >= 1){
            //if player is alive: loop battle turns in order
            if(currentHealth1 >= 1 && PlayerAttacked == false){
                cloudTurn();
            }
            else if(monsterCurrentHp >= 1 && PlayerAttacked == true && currentHealth1 >= 1){
                goblinAttacks();
                PlayerAttacked = false;
            }
            else if(currentHealth1 < 1){
                    if(currentHealth1 < 0){
                        currentHealth1 = 0;
                    }
                    System.out.println("Name: " + name1);
                    System.out.println("Health: " + currentHealth1 + "/" + health1);
                    currentHealth1 = 0;
                    monsterCurrentHp = 0;
            }
            
            //Mage turn
            //Healers turn
            // if (currentHealth1 < 1){
            //     Death1();
            // }
        }
        //System.out.println(currentHealth1);
        if(currentHealth1 < 1){
            PlayerAttacked = false;
            System.out.println(name1 + " has fainted");
            Death1();
        }
        else{
            PlayerAttacked = false;
            System.out.println("You defeated all enemies");
            Win1();
        }
    }

    // Death on first stage
    public void Death1(){
        System.out.println("*******GAME OVER*******");
        System.out.println("Press 1 to Try Again");
        currentHealth1 = health1;
        monsterCurrentHp = monsterHp;
        currentMana1 = 30;
        goblinCurrentMana = 10;
        start = scanner.nextInt();

        if(start == 1){
            battlecommand();
        }
        else if(start != 1){
            Death1();
        }
    }

    // Win on first stage and xp calculator
    public void Win1(){
        try{
            System.out.println("Each of your party members have gained " + goblinExpDrop +  " exp");
            Thread.sleep(3000);
            cloudExpGain = goblinExpDrop + cloudExpGain;
            Exptracker();
            Thread.sleep(5000);
            System.out.println("Press 1 to continue");
            start = scanner.nextInt();
        }
        catch(Exception e){
        }
        if(start == 1){
            story3();
        }
        else if(start != 1){
            Win1();
        }
        
    }

    public void Exptracker(){
        if(cloudExpGain >= cloudExpCap){
            System.out.println("Cloud has leveled up!!");
            level1 += 1;
            health1 += 30;
            currentHealth1 = health1;
            mana1 += 10;
            currentMana1 = 30;
            playerDamage1 += 5;
            crossSlash += 20;
            cloudExpGain = cloudExpGain / cloudExpCap;
            cloudExpCap += 300;
            System.out.println("-----------------------------------------------------");
            System.out.println("Name: " + name1);
            System.out.println("Level " + level1 + " (+ 1)"); 
            System.out.println("Health: " + currentHealth1 + "/" + health1 + " (+ 30)");
            System.out.println("Mana: " + currentMana1 + "/" + mana1 + " (+ 10)");
            System.out.println("Exp: " + cloudExpGain + "/" + cloudExpCap + " (+ 300)");
            System.out.println("-----------------------------------------------------");
        }
    }


    // Clouds UI Stats
    public void displayStats() {
        try{
            Thread.sleep(2000);
            System.out.println("-----------------------------------------------------");
            System.out.println("Name: " + name1);
            System.out.println("Level " + level1); 
            System.out.println("Health: " + currentHealth1 + "/" + health1);
            System.out.println("Mana: " + currentMana1 + "/" + mana1);
            System.out.println("Exp: " + cloudExpGain + "/" + cloudExpCap);
            System.out.println("-----------------------------------------------------");
            Thread.sleep(3500);
        }
        catch(Exception e){
        }
    }

    // Clouds turn options
    public void cloudTurn(){
        System.out.println("\n----------------------------------------------------");
        System.out.println("Name: " + name1);
        System.out.println("Health: " + currentHealth1 + "/" + health1);
        System.out.println("Mana: " + currentMana1 + "/" + mana1);
        System.out.println("\n1: slash : 0 mana (+35 dmg)");
        System.out.println("\n2: Blizzaga Blade : 30 mana (+60 dmg)");
        System.out.println("\n3: Cure : 15 mana (+75 hp)");
        System.out.println("\n4: Cross Slash : 60 mana (+120 dmg)");
        System.out.println("\n5: Stats");
        System.out.println("\n----------------------------------------------------");
        System.out.println();
        System.out.println("Choose your move");
        choice = scanner.nextInt();

        if(currentMana1 >= 100){
            currentMana1 = 100;
        }
        
        if(choice == 1){
            System.out.println("***" + name1 + " attacked!***");
            try{
                System.out.println("-----------------------------------------------------");
                System.out.println("Cloud dealt " + playerDamage1 + " to the goblin\n");
                Thread.sleep(2500);
                monsterCurrentHp = monsterCurrentHp - playerDamage1;
                if(monsterCurrentHp < 0){
                    monsterCurrentHp = 0;
                }
                System.out.println("Goblin: " + monsterCurrentHp + "/" + monsterHp + "\n");
                Thread.sleep(2500);
                System.out.println("-----------------------------------------------------");
                currentMana1 += 10;
                PlayerAttacked = true;
            }
            catch(Exception e){
            }
            //next player
        }
        else if(choice == 2){
            if (currentMana1 >= 30){
                System.out.println(name1 + " used Blizzaga Blade");
                currentMana1 -= 30;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + blizzagaBlade + " to the goblin");
                    Thread.sleep(2500);
                    monsterCurrentHp = monsterCurrentHp - blizzagaBlade;
                    if(monsterCurrentHp < 0){
                        monsterCurrentHp = 0;
                    }
                    System.out.println("Goblin: " + monsterCurrentHp + "/" + monsterHp );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }   
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
        }
        else if(choice == 3){
            if (currentMana1 >= 15) {
                System.out.println(name1 + " used Cure");
                currentMana1 -= 15;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud healed " + Cure + " of his hp");
                    System.out.println();
                    Thread.sleep(2500);
                    currentHealth1 = currentHealth1 + Cure;
                    if(currentHealth1 >= health1){
                        currentHealth1 = health1;
                    }
                    System.out.println(name1 + ": " + currentHealth1 + "/" + health1);
                    System.out.println();
                    System.out.println("Goblin: " + monsterCurrentHp + "/" + monsterHp );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }

            }   
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
        }
        else if(choice == 4){
            if (currentMana1 >= 60) {
                System.out.println(name1 + " used Cross Slash");
                currentMana1 -= 60;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + crossSlash + " to the goblin");
                    Thread.sleep(2500);
                    monsterCurrentHp = monsterCurrentHp - crossSlash;
                    if(monsterCurrentHp < 0){
                        monsterCurrentHp = 0;
                    }
                    System.out.println("Goblin: " + monsterCurrentHp + "/" + monsterHp );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
            
        }
        else if(choice == 5){
            displayStats();
            PlayerAttacked = false;
        }
        // else if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5){
        //     cloudTurn();
        // }
    }
    public void cloudTurn1(){
        System.out.println("\n----------------------------------------------------");
        System.out.println("Name: " + name1);
        System.out.println("Health: " + currentHealth1 + "/" + health1);
        System.out.println("Mana: " + currentMana1 + "/" + mana1);
        System.out.println("\n1: slash : 0 mana (+35 dmg)");
        System.out.println("\n2: Blizzaga Blade : 30 mana (+60 dmg)");
        System.out.println("\n3: Cure : 15 mana (+75 hp)");
        System.out.println("\n4: Cross Slash : 60 mana (+120 dmg)");
        System.out.println("\n5: Stats");
        System.out.println("\n----------------------------------------------------");
        System.out.println();
        System.out.println("Choose your move");
        choice = scanner.nextInt();

        if(currentMana1 >= 100){
            currentMana1 = 100;
        }
       
        if(choice == 1){
            System.out.println("***" + name1 + " attacked!***");
            try{
                System.out.println("-----------------------------------------------------");
                System.out.println("Cloud dealt " + playerDamage1 + " to the Golem\n");
                Thread.sleep(2500);
                GolemCurrentHP = GolemCurrentHP - playerDamage1;
                if(GolemCurrentHP < 0){
                    GolemCurrentHP = 0;
                }
                System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP + "\n");
                Thread.sleep(2500);
                System.out.println("-----------------------------------------------------");
                currentMana1 += 10;
                PlayerAttacked = true;
            }
            catch(Exception e){
            }
            //next player
        }
        else if(choice == 2){
            if (currentMana1 >= 30){
                System.out.println(name1 + " used Blizzaga Blade");
                currentMana1 -= 30;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + blizzagaBlade + " to the Golem");
                    Thread.sleep(2500);
                    GolemCurrentHP = GolemCurrentHP - blizzagaBlade;
                    if(GolemCurrentHP < 0){
                        GolemCurrentHP = 0;
                    }
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }  
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
           
            //next player
           
        }
        else if(choice == 3){
            if (currentMana1 >= 15) {
                System.out.println(name1 + " used Cure");
                currentMana1 -= 15;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud healed " + Cure + " of his hp");
                    System.out.println();
                    Thread.sleep(2500);
                    currentHealth1 = currentHealth1 + Cure;
                    if(currentHealth1 >= health1){
                        currentHealth1 = health1;
                    }
                    System.out.println(name1 + ": " + currentHealth1 + "/" + health1);
                    System.out.println();
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }

            }   
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
        }
        else if(choice == 4){
            if (currentMana1 >= 60) {
                System.out.println(name1 + " used Cross Slash");
                currentMana1 -= 60;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + crossSlash + " to the Golem");
                    Thread.sleep(2500);
                    GolemCurrentHP = GolemCurrentHP - crossSlash;
                    if(GolemCurrentHP < 0){
                        GolemCurrentHP = 0;
                    }
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
           
            //next player
           
           
        }
        else if(choice == 5){
            displayStats();
            PlayerAttacked = false;
        }
        // else if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5){
        //     cloudTurn();
        // }
    }


     


    public void gRampage(){
        try{
            if(goblinCurrentMana >= 15){
                System.out.println("-----------------------------------------------------");
                System.out.println(goblin + " uses Rampage");
                Thread.sleep(2000);
                System.out.println("Throwing a barrage of hits");
                Thread.sleep(1500);
                System.out.println("-----------------------------------------------------");
                goblinCurrentMana -= 15;
                currentHealth1 = currentHealth1 - rampage;
                System.out.println(goblin + " dealt " + rampage + " to " + name1);

            }
            else if(goblinCurrentMana < 15){
                System.out.println("Goblin tried to attack but missed horribly\nSo nothing happened");
                System.out.println("Goblin loses there turn");
            }

            goblinCurrentMana += 10;
        }
         catch(Exception e){
        }
    }

    public void gRage(){

    }


    //Goblins Turn

    public void goblinAttacks(){
        int rand = (int)(Math.random() * 1 - 1 + 1) + 1;
        int randAttack = (int)(Math.random() * 3 - 1 + 1) + 1;

        if(goblinCurrentMana >= 50){
            goblinCurrentMana = 50;
        }
        // goblinRandomizer = ThreadLocalRandom.current().nextInt(1,2); // change to 4 once all characters r added
        // goblinAttackRandomizer = ThreadLocalRandom.current().nextInt(1,4);

        //Cloud gets Attacked
        if(rand == 1 && randAttack == 1){
            System.out.println("*** "+ goblin + " attacked!***");
            goblinCurrentMana += 10;
            currentHealth1 = currentHealth1 - monsterAttack;
            System.out.println(goblin + " dealt " + monsterAttack + " to " + name1);
            

        }
        else if(rand == 1 && randAttack == 2){
            gRampage();
        }
        else if(rand == 1 && randAttack == 3){
            try{
            if(goblinCurrentMana >= 15){
                System.out.println("-----------------------------------------------------");
                System.out.println(goblin + " uses Rage");
                Thread.sleep(2000);
                System.out.println("Gaining a 10% attack buff");
                System.out.println("-----------------------------------------------------");
                Thread.sleep(2000);
                double newNum = (10 / 100) * monsterAttack;
                double newNum2 = (10 / 100) * rampage;
                monsterAttack = monsterAttack + (int)newNum + 4;
                rampage = rampage + (int)newNum2 + 6;
                goblinCurrentMana -= 15;
            }
            else if(goblinCurrentMana < 15){
                System.out.println("Goblin tried to get enraged, but let out a fart instead");
                System.out.println("Goblin loses there turn");
            }
            goblinCurrentMana += 10;
        }
        catch(Exception e){
        }
        
    }

        

    }

    

    public void story3(){
        try{
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Congradulations, you defeated the goblin! However, this is not the end of your journey.");
            Thread.sleep(1000);
            System.out.println();
            System.out.println("You end up coming across a door, these doors will determine your final fate.");
            Thread.sleep(1000);
            System.out.println("Upon opening the door you see an empty room with a radnom boulder???");
            Thread.sleep(1000);
            System.out.println("suddenly the ground begins to shake....");
            Thread.sleep(1000);
            System.out.println("----------------------------------------------------------------------------------------------");
           
            Golembattle();
           
           
    }
            catch(Exception e){
        }

    }
    public void Golembattle(){
        try{
            System.out.println("\n-----------------------------------------------------------");
            Thread.sleep(1000);
            System.out.println("Golems HP:" + GolemHP);
            System.out.println("\n-----------------------------------------------------------");
            Thread.sleep(1000);
            Golembattle1();
        }
        catch(Exception e){
        }
    }

    public void Golembattle1(){
        //check if Golem has health, if so loop until ded
        while(GolemCurrentHP >= 1){
            //if player is alive: loop battle turns in order
            if(currentHealth1 >= 1 && PlayerAttacked == false){
                cloudTurn2();
            }
            else if(GolemCurrentHP >= 1 && PlayerAttacked == true && currentHealth1 >= 1){
                GolemAttack();
                PlayerAttacked = false;
            }
            else if(currentHealth1 < 1){
                System.out.println("Name: " + name1);
                System.out.println("Health: " + currentHealth1 + "/" + health1);
                currentHealth1 = 0;
                GolemCurrentHP = 0;
            }
           
            //Mage turn
            //Healers turn
            // if (currentHealth1 < 1){
            //     Death1();
            // }
        }
        //System.out.println(currentHealth1);
        if(currentHealth1 < 1){
            if(currentHealth1 < 1){
                currentHealth1 = 0;
            }
            PlayerAttacked = false;
            System.out.println(name1 + " has been crushed to death");
            Death2();
        }
        else{
            PlayerAttacked = false;
            System.out.println("You defeated all enemies");
            Win2();
        }
    }

    public void Death2(){
        try{
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("As cloud desperatly tries to get back on his feet. The golem was to much for him to handled");
            Thread.sleep(2500);
            System.out.println("Cloud has fainted in a desperate attempt to fight back. Seeing a shimmer of light appear before him, hope.");
            Thread.sleep(2500);
            System.out.println("To be continued...");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            Thread.sleep(2500);
            System.out.println();
            System.out.println("Thanks for playing our demo !!!");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
        catch(Exception e){
        }
    }

    public void Win2(){
        System.out.println("Each of your party members have gained " + GolemExpDrop +  " exp");
        System.out.println("Press 1 to continue");
        cloudExpGain = GolemExpDrop + cloudExpGain;
        Exptracker();
        start = scanner.nextInt();
        if(start == 1){
           // story4(); had to cut some content
           
        }
        else if(start != 1){
            Win1();
        }
       
    }

        public void GolemAttack(){

        if(GolemCurrentMana >= 60){
            GolemCurrentMana = 60;
        }
        Random rand = new Random();
        int GolemRNG = rand.nextInt(2); // 0 or 1 with equal probability

        if (GolemRNG == 0) {
            System.out.println(Golem + " uses Obsidian grasp " + (ObsidianGrasp+ObsidianGrasp) + " damage!" + "ITS A CRITICAL HIT");
            GolemCurrentMana += 10;
            currentHealth1 = currentHealth1 - (ObsidianGrasp+ObsidianGrasp);
            if(currentHealth1 < 0){
                currentHealth1 = 0;
            }
        } else {
            System.out.println(Golem + " attacks for " + ObsidianGrasp + " damage.");
            GolemCurrentMana += 10;
            currentHealth1 = currentHealth1 - ObsidianGrasp;
            if(currentHealth1 < 0){
                currentHealth1 = 0;
            }
        }
    }

    // Clouds turn options
    public void cloudTurn2(){
        System.out.println("\n----------------------------------------------------");
        System.out.println("Name: " + name1);
        System.out.println("Health: " + currentHealth1 + "/" + health1);
        System.out.println("Mana: " + currentMana1 + "/" + mana1);
        System.out.println("\n1: slash : 0 mana (+35 dmg)");
        System.out.println("\n2: Blizzaga Blade : 30 mana (+60 dmg)");
        System.out.println("\n3: Cure : 15 mana (+75 hp)");
        System.out.println("\n4: Cross Slash : 60 mana (+120 dmg)");
        System.out.println("\n5: Stats");
        System.out.println("\n----------------------------------------------------");
        System.out.println();
        System.out.println("Choose your move");
        choice = scanner.nextInt();

        if(currentMana1 >= 100){
            currentMana1 = 100;
        }
        
        if(choice == 1){
            System.out.println("***" + name1 + " attacked!***");
            try{
                System.out.println("-----------------------------------------------------");
                System.out.println("Cloud dealt " + playerDamage1 + " to the golem\n");
                Thread.sleep(2500);
                GolemCurrentHP = GolemCurrentHP - playerDamage1;
                if(GolemCurrentHP < 0){
                    GolemCurrentHP = 0;
                }
                System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP + "\n");
                Thread.sleep(2500);
                System.out.println("-----------------------------------------------------");
                currentMana1 += 10;
                PlayerAttacked = true;
            }
            catch(Exception e){
            }
            //next player
        }
        else if(choice == 2){
            if (currentMana1 >= 30){
                System.out.println(name1 + " used Blizzaga Blade");
                currentMana1 -= 30;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + blizzagaBlade + " to the golem");
                    Thread.sleep(2500);
                    GolemCurrentHP = GolemCurrentHP - blizzagaBlade;
                    if(GolemCurrentHP < 0){
                        GolemCurrentHP = 0;
                    }
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }   
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
        }
        else if(choice == 3){
            if (currentMana1 >= 15) {
                System.out.println(name1 + " used Cure");
                currentMana1 -= 15;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud healed " + Cure + " of his hp");
                    System.out.println();
                    Thread.sleep(2500);
                    currentHealth1 = currentHealth1 + Cure;
                    if(currentHealth1 >= health1){
                        currentHealth1 = health1;
                    }
                    System.out.println(name1 + ": " + currentHealth1 + "/" + health1);
                    System.out.println();
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }

            }   
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
        }
        else if(choice == 4){
            if (currentMana1 >= 60) {
                System.out.println(name1 + " used Cross Slash");
                currentMana1 -= 60;
                try{
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Cloud dealt " + crossSlash + " to the golem");
                    Thread.sleep(2500);
                    GolemCurrentHP = GolemCurrentHP - crossSlash;
                    if(GolemCurrentHP < 0){
                        GolemCurrentHP = 0;
                    }
                    System.out.println("Golem: " + GolemCurrentHP + "/" + GolemHP );
                    Thread.sleep(2500);
                    System.out.println("-----------------------------------------------------");
                    currentMana1 += 10;
                    PlayerAttacked = true;
                }
                catch(Exception e){
                }
            }
            else {
                System.out.println("Not enough mana!");
                PlayerAttacked = false;
            }
            
            //next player
            
            
        }
        else if(choice == 5){
            displayStats();
            PlayerAttacked = false;
        }
        // else if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5){
        //     cloudTurn();
        // }
    }
}


