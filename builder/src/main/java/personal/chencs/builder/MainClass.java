package personal.chencs.builder;

/**
 * @author: chencs
 * @date: 2018/10/25
 */
public class MainClass {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);
        textDirector.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director htmlDirector = new Director(htmlBuilder);
        htmlDirector.construct();
        String fileName = htmlBuilder.getResult();
        System.out.println(fileName + "文件编写完成");
    }
}
