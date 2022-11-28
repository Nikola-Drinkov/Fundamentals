package FinalExamPrep2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> HpMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> MpMap = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String hero = sc.nextLine();
            String name = hero.split(" ")[0];
            int Hp = Integer.parseInt(hero.split(" ")[1]);
            int Mp = Integer.parseInt(hero.split(" ")[2]);
            HpMap.put(name,Hp);
            MpMap.put(name,Mp);
        }
        String inp = sc.nextLine();
        while(!inp.equals("End")){
            String [] input = inp.split(" - ");
            String command = input[0];
            String name = input[1];
            switch (command){
                case"CastSpell":
                    int MpNeeded = Integer.parseInt(input[2]);
                    String spellName = input[3];
                    if(MpMap.get(name)>=MpNeeded){
                        MpMap.put(name, MpMap.get(name)-MpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",name,spellName,MpMap.get(name));
                    }
                    else{
                        System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
                    }
                    break;
                case"TakeDamage":
                    int damage = Integer.parseInt(input[2]);
                    String attacker = input[3];
                    int remHp = HpMap.get(name)-damage;
                    if(remHp>0){
                        HpMap.put(name,remHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,damage,attacker,remHp);
                    }
                    else{
                        HpMap.remove(name);
                        MpMap.remove(name);
                        System.out.printf("%s has been killed by %s!%n",name,attacker);
                    }
                    break;
                case"Recharge":
                    int currentMp = MpMap.get(name);
                    int amountMp = Integer.parseInt(input[2]);
                    int newMp = currentMp+amountMp;
                    if(newMp>200){
                        newMp = 200;
                    }
                    MpMap.put(name,newMp);
                    System.out.printf("%s recharged for %d MP!%n",name,newMp-currentMp);
                    break;
                case"Heal":
                    int currentHp = HpMap.get(name);
                    int amountHp = Integer.parseInt(input[2]);
                    int newHp = currentHp+amountHp;
                    if(newHp>100){
                        newHp = 100;
                    }
                    HpMap.put(name,newHp);
                    System.out.printf("%s healed for %d HP!%n",name,newHp-currentHp);
                    break;
            }
            inp = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : HpMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: "+entry.getValue());
            System.out.println("  MP: "+MpMap.get(entry.getKey()));
        }
    }
}
