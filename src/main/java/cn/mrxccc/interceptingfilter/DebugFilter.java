package cn.mrxccc.interceptingfilter;

/**
 * Author:   caijc
 * Date:     2022/9/30 15:44
 * Description:
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
