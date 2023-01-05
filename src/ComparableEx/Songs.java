package ComparableEx;

//public class Songs{
//    String name;
//    int length;
//
//    public Songs(String name, int length) {
//        this.name = name;
//        this.length = length;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getLength() {
//        return length;
//    }
//}





public class Songs implements Comparable<Songs> {
    String name;
    int length;

    public Songs(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }
    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Songs o) {
       // int ans = this.length - o.length;
       // System.out.println(ans + "=" + this.getName() + " - " + o.getName());
        return this.length - o.length;
    }
    //return this.getName().compareTo(o.getName());//use this for name comparison

}
