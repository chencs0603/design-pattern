package personal.chencs.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象零件：页面
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public abstract class Page {

    protected String title;
    protected String author;

    protected List<Item> content;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new ArrayList<Item>();
    }

    public void add(Item item) {
        content.add(item);
    }

    // 模板方法
    public void output() {
        try {
            String fileName = this.title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName + "编写完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
