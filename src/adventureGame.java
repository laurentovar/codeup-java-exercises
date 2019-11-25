import java.util.Scanner;

public class adventureGame {
    //sets the scanner global
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static Scanner enterScanner = new Scanner(System.in);


    //player properties
    static String userName;
    static int playerHealth;
    static int monsterHealth;
    static String playerWeapon;
    static int choice;
    static int emerald;

    public static void main(String[] args) {
        adventureGame game;
        game = new adventureGame();

        game.startGame();


    }
    public static void startGame (){
        System.out.println("Welcome to Howlers Keep!!");
        System.out.println("                                                     ,.=,,==. ,,_\n" +
                "                                    _ ,====, _    |I|`` ||  `|I `| Art by\n" +
                "                _|\\_,              |`I|    || `==,|``   ^^   ``  |\n" +
                "        ,.--,   \\_ `a\\_            | ``    ^^    ||_,===TT`==,,_ | -ZEUS-\n" +
                "   6^`--:_ ||  ,/  ,-,,\\           |,==Y``Y==,,__| \\L=_-`'   +J/`\n" +
                "  / \\```\\ \\|\\_/ /-/\\\\  `            \\|=_  ' -=#J/..-|=_-     =|\n" +
                " /  \\.., | \\/  /-/  `                |=_   -;-='`. .|=_-     =|----T--,\n" +
                "/   \\..,'|    /-|                    |=/\\  -|=_-. . |=_-/^\\  =||-|-|::|____\n" +
                "    \\__     \\_L-==,                  |=||  -|=_-. . |=_-| |  =|-|-||::\\____\n" +
                "    |  /   \\_.-..=                   |=LJ  -|=_-. . |=_-|_|  =||-|-|:::::::\n" +
                "    \\ /    /--_/\\                    |=_   -|=_-_.  |=_-     =|-|-||::::::\n" +
                "   _J`   .'-_,/\\_``=                 |=_   -|=//^\\. |=_-     =||-|-|:::::::\n" +
                "`X`    \\/--_/    `-`             ,   |/&_,_-|=||  | |=_-     =|-|-||:::::::\n" +
                "/   \\   |_/                   ,--``8%,/    ',%||  | |=_-     =||-|-|%::::::\n" +
                "   _/  / /                ,---`_,888`  ,.'''''`-.,|,|/!,--,.&\\|&\\-,|&#:::::\n" +
                "./`; /`/`                |;:;K`__,...;=\\_____,=``           %%%&     %#,---\n" +
                "    \\\\\\\\                 |;::::::::::::|       `'.________+-------\\   ``\n" +
                "     w w           |    /8M%;:::;;:::::|                  |        `-------\n" +
                "                   |   |`   88`V  /&8%\\|_______,__,,      |\n" +
                "                   |   /,  %8,  ,/&888% &,       ,  `-----`,--..../|--,,,,_\n" +
                "                  / \\/88%  88%  8888%88% &,       \\,     `\\      /     &,,\n" +
                "                  |,M8,  , `8%   ,,8% `8, `         , \\,        &\\     ,&##\n" +
                "                 /8888%  888`    ```    `            `  `               ```");
        System.out.println("Ready to start the game? Y/N");
       String  input = scanner.nextLine();

        if (input.equalsIgnoreCase("Y")){
           //===enter your name===
           System.out.println("Hi hero what is your name?");
            userName = scanner.nextLine();

            //====player and monster health===
            playerHealth = 10;
            monsterHealth = 15;

            playerWeapon = "Sword";

            //welcome user
           System.out.println("\n------------------------------------------------------------------\n");

           System.out.println("                 {}\n" +
                   "                  .--.\n" +
                   "                 /.--.\\\n" +
                   "                 |====|\n" +
                   "                 |`::`|\n" +
                   "             .-;`\\..../`;_.-^-._\n" +
                   "            /  |...::..|`   :   `|\n" +
                   "           |   /'''::''|   .:.   |\n" +
                   "           ;--'\\   ::  |..:::::..|\n" +
                   "           <__> >._::_.| ':::::' |\n" +
                   "           |  |/   ^^  |   ':'   |\n" +
                   "           \\::/|       \\    :    /\n" +
                   "           |||\\|        \\   :   /\n" +
                   "           ''' |___/\\___|`-.:.-`\n" +
                   "                \\_ || _/    `\n" +
                   "                <_ >< _>\n" +
                   "                |  ||  |\n" +
                   "                |  ||  |\n" +
                   "               _\\.:||:./_\n" +
                   "         jgs  /____/\\____\\");

           System.out.println("----------------------------------------");
           System.out.println("Welcome " + userName + "!");
           System.out.println("Your health: " +playerHealth);
           System.out.println("Your weapon: " +playerWeapon);
           System.out.println("Lets start your adventure!");
           scanner.nextLine();
           System.out.println("\n------------------------------------------------------------------\n");
           townGate();


       }else if (input.equalsIgnoreCase("n"))
           System.out.println("Exited the game!");



    }
    public static void townGate (){
        System.out.println("You are in front of the castle gate.");
        System.out.println("   .\n" +
                "  /:\\\n" +
                "  |:|\n" +
                "  |:|\n" +
                "  |:|\n" +
                "  |:|      __\n" +
                ",_|:|_,   /  )                     *_   _   _   _   _   _   _   *\n" +
                "  (Oo    / _I_                     | `_' `-' `_' `-' `_' `-' `_'|\n" +
                "   +\\ \\  || __|            ^       |                            |       ^\n" +
                "      \\ \\||___|            |       |                            |       |\n" +
                "        \\ /.:.\\-\\          |  (*)  |_   _   _   _   _   _   _   |  \\^/  |\n" +
                "         |.:. /-----\\      | _<\">_ | `_' `-' `_' `-' `_' `-' `_'| _(#)_ |\n" +
                "         |___|  oOo  |    o+o \\a/ \\0                            0/ \\a/ (=)\n" +
                "         /   ||     0'\\a-a/\\/                            \\/\\a-a/`0\n" +
                "        |_____\\  :  /        /_^_\\ |                            | /_^_\\\n" +
                "         | |  \\ \\:/          || || |                            | || ||\n" +
                "         | |   | |           d|_|b_T____________________________T_d|_|b\n" +
                "         \\ /   | \\___              /                           /\n" +
                "         / |   \\_____\\         /                              /\n" +
                "         `-'               /                                 /\n" +
                "________________________/                                   /___________\n" +
                "                                                               ______\n");
        scanner.nextLine();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("A guard appears in front of you.");

        System.out.println("                   _.--.    .--._\n" +
                "                 .\"  .\"      \".  \".\n" +
                "                ;  .\"    /\\    \".  ;\n" +
                "                ;  '._,-/  \\-,_.`  ;\n" +
                "                \\  ,`  / /\\ \\  `,  /\n" +
                "                 \\/    \\/  \\/    \\/\n" +
                "                 ,=_    \\/\\/    _=,\n" +
                "                 |  \"_   \\/   _\"  |\n" +
                "                 |_   '\"-..-\"'   _|\n" +
                "                 | \"-.        .-\" |\n" +
                "                 |    \"\\    /\"    |\n" +
                "                 |      |  |      |\n" +
                "         ___     |      |  |      |     ___\n" +
                "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\n" +
                "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\n" +
                " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\n" +
                "!     \\  \\  \\   \\                  /   /  /  /     !\n" +
                ":      \\  \\  \\   \\                /   /  /  /      TK\n");

        scanner.nextLine();
        System.out.println("What do you want to do?");
        scanner.nextLine();
        System.out.println("1: Be his friend and talk to him");
        System.out.println("2. Attack the guard with your sword!");
        System.out.println("3. Leave the guard alone");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();
        if(choice == 1){
            if(emerald == 1){
                ending();
            }
            else{
                System.out.println("Guard: Hello there, " + userName + "? \nSorry but we cannot let you in. You have been exiled and were told to never return! Get out of here!");
                enterScanner.nextLine();
                townGate();
            }

        }
        else if(choice == 2){
            playerHealth = playerHealth-1;
            System.out.println("Guard: Hey don't be stupid.\n\nThe guard hit you so hard and you gave up.\n(You receive 1 damage)\n");
            System.out.println("Your HP: " + playerHealth);
            enterScanner.nextLine();
            townGate();
        }
        else if(choice == 3){
            crossRoad();
        }
        else{
            townGate();
        }
    }
    public static void crossRoad(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are at a crossroad. If you go south, you will go back to the town.\n\n");
        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go south");
        System.out.println("4: Go west");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();

        if(choice == 1){
            north();
        }
        else if(choice == 2){
            east();
        }
        else if(choice == 3){
            townGate();
        }
        else if(choice == 4){
            west();
        }
        else{
            crossRoad();
        }
    }

    public  static void north(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("There is a river. You drink the water and rest at the riverside.");
        System.out.println("Your HP is recovered.");
        playerHealth = playerHealth + 1;
        System.out.println("Your HP: " + playerHealth);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();

        if(choice == 1){
            crossRoad();
        }
        else{
            north();
        }
    }

    public static void east(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walked into a forest and found a new weapon!");
        System.out.println("   ,   A           {}\n" +
                "  / \\, | ,        .--.\n" +
                " |    =|= >      /.--.\\\n" +
                "  \\ /` | `       |====|\n" +
                "   `   |         |`::`|\n" +
                "       |     .-;`\\..../`;-.\n" +
                "      /\\\\/  /  |...::...|  \\\n" +
                "      |:'\\ |   /'''::'''\\   |\n" +
                "       \\ /\\;-,/\\   ::   /\\--;\n" +
                "       |\\ <` >  >._::_.<,<__>\n" +
                "       | `\"\"`  /   ^^   \\|  |\n" +
                "       |       |        |\\::/\n" +
                "       |       |        |/|||\n" +
                "       |       |___/\\___| '''\n" +
                "       |        \\_ || _/\n" +
                "       |        <_ >< _>\n" +
                "       |        |  ||  |\n" +
                "       |        |  ||  |\n" +
                "       |       _\\.:||:./_\n" +
                "       |      /____/\\____\\");
        System.out.println("You got a Angelic axe");
        playerWeapon = "Axe";
        System.out.println("Your Weapon is now: "+ playerWeapon);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            east();
        }
    }

    public static void west(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter a goblin!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();

        if(choice == 1){
            fight();
        }
        else if(choice == 2){
            crossRoad();
        }
        else{
            west();
        }
    }

    public static void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHealth);
        System.out.println("Monster HP: " + monsterHealth);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = scanner.nextInt();

        if(choice == 1){
            attack();
        }
        else if(choice == 2){
            crossRoad();
        }
        else{
            fight();
        }
    }

    public static void attack(){
        int playerDamage =0;


        if(playerWeapon.equalsIgnoreCase("Knife")){
            //gets a random number from 0-5
            playerDamage = new java.util.Random().nextInt(5);
        }
        else if(playerWeapon.equalsIgnoreCase("Axe")){
            //gets a random number from 0-8
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHealth = monsterHealth - playerDamage;

        System.out.println("Monster HP: " + monsterHealth);

        if(monsterHealth <1 ){
            win();
        } else if(monsterHealth > 0){
            int monsterDamage =0;

            //gets a random number from 0-4
            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");

            playerHealth = playerHealth - monsterDamage;

            System.out.println("Player health is: " + playerHealth);

            if(playerHealth < 1){
                dead();
            } else if(playerHealth > 0){
                fight();
            }
        }


    }

    public static void dead(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");

    }

    public static void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the monster!");
        System.out.println("The monster dropped a stone!");
        scanner.nextLine();
        System.out.println("_______\n" +
                "        .'_/_|_\\_'.\n" +
                "        \\`\\  |  /`/\n" +
                "         `\\\\ | //'\n" +
                "            `\\|/`\n" +
                "              `");
        System.out.println("You obtained an Emerald!\n\n");
        System.out.println("1: Go east");
        System.out.println("\n------------------------------------------------------------------\n");

        emerald = 1;

        choice = scanner.nextInt();
        if(choice==1){
            crossRoad();
        }
        else{
            win();
        }

    }

    public static void ending(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Guard: Oh you killed that goblin!?? Great!");
        System.out.println("Guard: It seems you are a trustworthy guy. Welcome to our town!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }


}
