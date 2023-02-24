package lesson2.Interface.v2;

import lesson2.Interface.v2.Healers.Druid;
import lesson2.Interface.v2.Healers.Healer;
import lesson2.Interface.v2.Healers.Priest;
import lesson2.Interface.v2.Warriors.Knight;
import lesson2.Interface.v2.Warriors.Palladin;
import lesson2.Interface.v2.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Hero> team1 = new ArrayList<Hero>();
        team1.add(new Druid());
        team1.add(new Priest());
        team1.add(new Knight());
        team1.add(new Palladin());
        team1.add(new Avatars());

        var hero = team1.get(0);
        if (hero instanceof Warrior) {
            ((Warrior) hero).attack(null);
        } else if (hero instanceof Healer) {
            ((Healer) hero).healing(null);
        } else {
            //...
        }


        List<Warrior> team2 = new ArrayList<>();
        team2.add(new Knight());
        team2.add(new Palladin());
        team2.add(new Avatars());
//        warriors.add(new Warrior());  // добавить экземпляр абстрактного класса не получится
//        warriors.add(new Druid());  // если List не Hero, а конкретно Warrior, то добавить не получится
        team2.get(0).attack(null); // проверка на тип уже не нужна, так как в списке только воины
        team2.get(2).attack(null);
        ((Avatars) team2.get(2)).healing(null);


        List<Healer> team3 = new ArrayList<>();
//        team3.add(new Palladin());
        team3.add(new Druid());
        team3.add(new Priest());
        team3.add(new Avatars());

        team3.get(0).healing(null);
//        team3.get(0).attack(null); // атаковать не получится, так как это метод для типа Warrior
        team3.get(2).healing((Hero) team2.get(0));
    }
}
