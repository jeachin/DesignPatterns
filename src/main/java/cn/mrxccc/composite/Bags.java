package cn.mrxccc.composite;

import java.util.ArrayList;

/**
 * //树枝构件：袋子
 *
 * @author mrxccc
 * @create 2020/9/4
 */
public class Bags implements Articles {
    /**
     * 名字
     */
    private String name;
    private ArrayList<Articles> bags = new ArrayList<Articles>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles)obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles)obj).show();
        }
    }
}
