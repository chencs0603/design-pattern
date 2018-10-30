package personal.chencs.visitor;

import java.util.Iterator;

/**
 * 具体访问者
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";

    public void visitor(File file) {
        System.out.println(this.currentDir + "/" + file);
    }

    public void visitor(Directory directory) {
        System.out.println(this.currentDir + "/" + directory);
        String saveDir = this.currentDir;
        this.currentDir = this.currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        this.currentDir = saveDir;
    }
}
