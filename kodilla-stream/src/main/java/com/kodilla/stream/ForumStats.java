package com.kodilla.stream;

public class ForumStats {

//metaoda zwracajaca srednia liczbe postow userow z wieku >=40
public static Double  ageUp40() {
    double avrPostsUserAgeUp40 = UsersRepository.getUsersList()
            .stream()
            .filter(a -> a.getAge() > 40)
            .mapToInt(p -> p.getNumberOfPost())
            .average()
            .getAsDouble();
return avrPostsUserAgeUp40;
}
//metoda zwracajaca srednia liczbe postow userw z wieku <40
public static Double  ageDown40() {
    double avrPostsUserAgeDown40 = UsersRepository.getUsersList()
            .stream()
            .filter(a -> a.getAge() < 40)
            .mapToInt(p -> p.getNumberOfPost())
            .average()
            .getAsDouble();
    return avrPostsUserAgeDown40;
}
    public static void main(String[] args) {

        System.out.println("Average post from user Less 40 years : " + ageDown40());
        System.out.println("Average post from user more 40 years : " + ageUp40());
    }
}
