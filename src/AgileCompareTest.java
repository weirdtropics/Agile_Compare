import java.io.IOException;


public class AgileCompareTest {
    public static void main(String[] args) throws IOException {

        AgileCompare cti = new AgileCompare("images/image1.png", "images/image2.png");
        cti.setParam(10, 10);
        cti.compare();
        if (!cti.isIdentic()) {
            System.out.println("No Match");
            AgileCompare.savePNG(cti.getImgResult(), "images/result/result.png");
        } else {
            System.out.println("Match");
        }
    }
}

