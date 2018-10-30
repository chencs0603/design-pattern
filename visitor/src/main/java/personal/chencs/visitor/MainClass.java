package personal.chencs.visitor;

/**
 * @author: chencs
 * @date: 2018/10/30
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("List Root Entries......");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 1000));
        bin.add(new File("latex", 2000));

        root.accept(new ListVisitor());

        System.out.println("Making user entries......");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usr.add(yuki);
        usr.add(hanako);
        usr.add(tomura);

        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.txt", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));

        root.accept(new ListVisitor());
    }
}
