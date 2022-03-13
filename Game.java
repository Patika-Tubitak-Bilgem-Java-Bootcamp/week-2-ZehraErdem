public class Game {

    //....

    public void start() {
        //...
        while(true) {
            //...

            if(location instanceof BattleLoc) {
                if( ((BattleLoc)location).isAwardTaken()) {
                    System.out.println("Buradaki ödülü çoktan aldınız, başka yer deneyin");
                }
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }

            if(player.getWon()) {
                System.out.println("Kazandın, tebrikler");
                break;
            }


        }
    }
}
