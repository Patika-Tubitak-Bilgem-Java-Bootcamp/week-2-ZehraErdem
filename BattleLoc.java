public class BattleLoc extends Location{
    //...
    boolean awardTaken = false;

    //....

    @Override
    boolean onLocation() {
        //...
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You lose!");
            return false;
        }

        if(this.getName().equals("Maden")) {
            // increment total number of awards and marked as award taken so the player will not visit this location again
            this.getPlayer().setNoOfAwards(this.getPlayer().getNoOfAwards()++);
            this.awardTaken = true;
        }

        return true;
    }

    public boolean combat(int obsNumber) {
        for(int i = 0; i < obsNumber; i++) {
            //...

            // create a random value between 0 and 1 to decide who first attack
            double random = Math.random();
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                //...
                if (selectCombat.equals("V")) {


                    if(random < 0.5 && random != -1) {
                        System.out.println("Siz vurdunuz");
                        //...
                    } else if(random != -1) {
                        System.out.println("Darbe aldınız");
                        //...
                    }
                    // make random -1 so it will be used just once
                    random = -1;

                }
            }
        }

        if(this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
            //...

            // if is it mine and a snake is died chose a random value to decide award
            if(this.getName().equals("Maden")) {
                int kindOfAward = (int) Math.random()*100;
                if( kindOfAward < 15) {
                    wonGun();
                } else if ( kindOfAward < 30) {
                    wonArmor();
                } else if(kindOfAward < 55) {
                    wonMoney();
                } else {
                    System.out.println("Hiçbir şey kazanamadınız...");
                }
            } else {
                //...
            }
            //...
        }

        //...

    }

    public void wonGun() {
        int random = (int) Math.random()*100;
        if(random < 15) {
            System.out.println("Tüfek kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setWeapon(Weapon.getWeaponObjByID(2));
        } else if(random < 35) {
            System.out.println("Kılıç kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setWeapon(Weapon.getWeaponObjByID(1));
        }else  {
            System.out.println("Tabanca kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setWeapon(Weapon.getWeaponObjByID(0));
        }
    }

    public void wonArmor() {
        int random = (int) Math.random()*100;
        if(random < 20) {
            System.out.println("Ağır Zırh kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setArmor(Armor.getArmorObjByID(2));
        } else if(random < 50) {
            System.out.println("Orta Zırh kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setArmor(Armor.getArmorObjByID(1));
        }else  {
            System.out.println("Hafif Zırh kazandınız. Değişmek ister misiniz? (Evet/Hayır)");
            String chose = input.nextInt();
            if(chose.equals("Evet"))
                player.getInventory().setArmor(Armor.getArmorObjByID(0));
        }
    }

    public void wonMoney() {
        int random = (int) Math.random()*100;
        if(random < 20) {
            System.out.println("10 para kazandınız");
            player.setMoney(player.getMoney() + 10);
        } else if(random < 50) {
            System.out.println("5 para kazandınız");
            player.setMoney(player.getMoney() + 5);
        }else  {
            System.out.println("1 para kazandınız");
            player.setMoney(player.getMoney() + 1);
        }
    }

    public boolean isAwardTaken() {
        return awardTaken;
    }

    public void setAwardTaken(boolean awardTaken) {
        this.awardTaken = awardTaken;
    }

}
