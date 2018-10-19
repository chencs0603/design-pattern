package personal.chencs.composite;

/**
 * @author: chencs
 * @date: 2018/10/19
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Create Root Directory......");

        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 13));
        bin.add(new File("cp", 34));

        tmp.add(new File("test.log", 513));

        System.out.println("Display Root Directory......");
        root.printList("");
        System.out.println("Display Bin Directory......");
        bin.printList("");

        System.out.println("Display the Size of Root Directory......");
        System.out.println("the size of root:" + root.getSize());

        System.out.println("Display the Size of Bin Directory......");
        System.out.println("the size of bin:" + bin.getSize());
    }
}
