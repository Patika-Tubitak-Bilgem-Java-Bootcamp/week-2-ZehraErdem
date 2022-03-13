public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canınız yanilendi");
        this.player().setHealth(this.player.getInitialHealth());

        if(this.player.getNoOfAwards() == 3) {
            this.player.setWon(true);
        }
    }

}
