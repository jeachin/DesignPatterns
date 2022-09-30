package cn.mrxccc.interceptingfilter;

/**
 * Author:   caijc
 * Date:     2022/9/30 15:45
 * Description:
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
