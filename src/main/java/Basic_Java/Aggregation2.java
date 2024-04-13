package Basic_Java;

public class Aggregation2 {
    int id;
    String name;
    Aggregation aggregation;

    public Aggregation2(int id, String name, Aggregation aggregation){
        this.id = id;
        this.name = name;
        this.aggregation = aggregation;
    }

    void display(){
        System.out.println("id "+id+"name: "+name+"aggregation: "+aggregation);
        System.out.println(aggregation.city+" "+aggregation.state+" "+aggregation.country);
    }

    public static void main(String[] args) {
        Aggregation e = new Aggregation("akola","maharashtra","India");
        Aggregation e2 = new Aggregation("banglore","karnataka","India");

        Aggregation2 a = new Aggregation2(11," Rahul ",e);
        Aggregation2 a2 = new Aggregation2(12," abc ",e2);

        a.display();
        a2.display();
    }

}
