package cn.mrxccc.interceptingfilter;

/**
 * Author:   caijc
 * Date:     2022/9/30 15:44
 * Description:
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
