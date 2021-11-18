package LiKou;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: liangfan
 * @Date: 2021-11-12 11:20
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        Person p1 = new Person("a", 11, "aaaaa");
        Person p2 = new Person("b", 12, "bbbbb");
        Person p3 = new Person("c", 13, "ccccc");
        Person p4 = new Person("d", 14, "ddddd");
        Person p5 = new Person("e", 15, "eeeee");
        list = Arrays.asList(p1, p2, p3, p4, p5);
        List<Person> a = list.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        int asInt = list.stream().mapToInt(Person::getAge).max().getAsInt();
        list.stream().mapToInt(Person::getAge).reduce(0, Integer::sum);
        System.out.println();
        System.out.println(asInt);
        System.out.println(a);
    }
}

class Person {

    private String name;
    private int age;
    private String province;

    public Person(String name, int age, String province) {
        this.name = name;
        this.age = age;
        this.province = province;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", province='" + province + '\'' +
                '}';
    }
}
