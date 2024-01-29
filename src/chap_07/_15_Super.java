package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super -> 부모 클래스의 어떤 것을 자식 클래스에서 사용 할 수 있게
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-----------------");
        speedCam.takePicture();
    }
}
