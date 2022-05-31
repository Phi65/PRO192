
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class Dog {
    private int id;
    private String name;

    public Dog() {
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display(){
        Comparator c=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Dog c1=(Dog) o1;
                Dog c2=(Dog) o2;
                if (c1.id>c2.id) return 1;
                else if (c1.id<c2.id) return -1;
                return 0;
            }
        };
        Cate c2=new Cate("Thi No"){
            @Override
            public void print() {
                System.out.println("name: "+name);
            }            
        };
        Dog d2=new Dog(2, "chi pheo");
        if (c.compare(this, d2)>0)
            System.out.println("cho 1 is bigger cho 2");
        else System.out.println("cho 1 is not bigger cho 2");
        c2.print();
    }
    public static void main(String[] args) {
        Dog d1=new Dog(1,"pheo");
        d1.display();
    }
}
