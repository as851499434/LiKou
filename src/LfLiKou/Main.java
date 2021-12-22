package LfLiKou;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: liangfan
 * @Date: 2021-11-12 11:20
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(time);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
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
