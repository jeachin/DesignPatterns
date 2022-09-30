package cn.mrxccc.interceptingfilter;

/**
 * Author:   caijc
 * Date:     2022/9/30 15:48
 * Description:
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
