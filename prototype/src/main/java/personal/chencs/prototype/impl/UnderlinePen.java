package personal.chencs.prototype.impl;

/**
 * 实现类
 *
 * @author: chencs
 * @date: 2018/10/24
 */
public class UnderlinePen extends AbstractProduct {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String string) {
        System.out.println(" " + string + " ");
        String line = makeLine(ulchar, string.length() + 2);
        System.out.println(line);
    }

}
