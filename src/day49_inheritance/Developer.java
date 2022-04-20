package day49_inheritance;

public class Developer extends Employee{

    int featuresCreated;

    public void develop(){
        System.out.println(name+" is creating more features");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "featuresCreated=" + featuresCreated +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", isFulltime=" + isFulltime +
                '}';
    }
}
