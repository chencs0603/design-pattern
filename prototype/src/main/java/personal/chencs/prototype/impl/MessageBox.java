package personal.chencs.prototype.impl;

/**
 * 实现类
 *
 * @author: chencs
 * @date: 2018/10/24
 */
public class MessageBox extends AbstractProduct {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String string) {
        String line = makeLine(decochar, string.length() + 4);
        System.out.println(line);
        System.out.println(decochar + " " + string + " " + decochar);
        System.out.println(line);
    }

}
