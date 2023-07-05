public class ComplexNo {

    private int realPart;

    private int imgPart;

    public ComplexNo(){
gi
        realPart = 0;
        imgPart = 0;

    }

    public ComplexNo(int realPart, int imgPart) {
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    public void print(){
        System.out.println("("+realPart+"+"+imgPart+"i"+")");
    }
}


