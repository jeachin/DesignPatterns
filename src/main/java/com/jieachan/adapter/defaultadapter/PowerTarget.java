package com.jieachan.adapter.defaultadapter;

/**
 * 目标角色：
 *
 * @author jieachan
 * @create 2020/9/2
 * @since 1.0.0
 */
public interface PowerTarget {
    default int output5V(){return 0;}

    default int output10V(){return 0;}

    default int output20V(){return 0;}
}
