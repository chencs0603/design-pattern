package personal.chencs.builder;

/**
 * @author: chencs
 * @date: 2018/10/25
 */
public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("======================\n");
        buffer.append("《" + title + "》");
        buffer.append("\n");
    }

    public void makeString(String string) {
        buffer.append(">" + string);
        buffer.append("\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("   ." + items[i] + "\n");
        }
    }

    public void close() {
        buffer.append("======================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
