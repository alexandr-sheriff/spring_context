package com.alex.spring_context;

@PureTransactional
public class FightClubImpl implements FightClub{

    private CombatCat firstCat;

    private CombatCat secondCat;

    @Override
    public void fight() {
        System.out.println("First cat: " + firstCat.toString());
        System.out.println("Second cat: " + secondCat.toString());

        Integer firstCatStrength = firstCat.getStrength();
        Integer secondCatStrength = secondCat.getStrength();
        String firstCatName = firstCat.getName();
        String secondCatName = secondCat.getName();

        if (firstCatStrength > secondCatStrength) {
            System.out.println(firstCatName + " cat win");
        } else if (secondCatStrength > firstCatStrength) {
            System.out.println(secondCatName + " cat win");
        } else {
            System.out.println("Cats strength is the same");
        }
    }

    public void setFirstCat(CombatCat firstCat) {
        this.firstCat = firstCat;
    }

    public void setSecondCat(CombatCat secondCat) {
        this.secondCat = secondCat;
    }
}
