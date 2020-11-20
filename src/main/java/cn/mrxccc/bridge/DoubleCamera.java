package cn.mrxccc.bridge;

/**
 * @author mrxccc
 * @create 2020/9/23
 */
public class DoubleCamera implements Camera{
    @Override
    public void takePicture() {
        System.out.println("双摄");
    }
}
