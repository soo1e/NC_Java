package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("-------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

        b2.price = -5000;
    }
}


// // Getter & Setter
//    String getModelName() {
//        return modelName;
//    }
//
//    void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    String getResolution() {
//        if (resolution == null || resolution.isEmpty()) {
//            return "판매자에게 문의하세요.";
//        }
//        return resolution;
//    }
//
//    void setResolution(String resolution) {
//        this.resolution = resolution;
//    }
//
//    int getPrice() {
//        return price;
//    }
//
//    void setPrice(int price) {
//        if (price < 100000) {
//            this.price = 100000;
//        }
//        else {
//            this.price = price;
//        }
//    }
//
//    String getColor() {
//        return color;
//    }
//
//    void setColor(String color) {
//        this.color = color;
//    }
//}