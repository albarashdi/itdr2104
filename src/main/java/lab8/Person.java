
package lab8;


public class Person {
    
    protected int age;
    protected String name;
    protected String gender;
    
    public Person(){
        
    }
    
    public Person(int i, String n, String g){
        this.age=i;
        this.name=n;
        this.gender=g;
    }
    public boolean equals(Object o){
        if(o instanceof Person){
            return age ==((Person) o).age&&name==((Person) o).name&&gender==((Person) o).gender;
        }else{
        
        return false;
        }
    }
    public String toString(){
        return "Person age: "+age+", name: "+name+" and gender: "+gender;
    }
}
