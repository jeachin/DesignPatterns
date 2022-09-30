package cn.mrxccc.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:   caijc
 * Date:     2022/9/30 15:45
 * Description:
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
