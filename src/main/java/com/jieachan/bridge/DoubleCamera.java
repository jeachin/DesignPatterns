package com.jieachan.bridge;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public class DoubleCamera implements Camera{
    @Override
    public void takePicture() {
        System.out.println("双摄");
    }
}
