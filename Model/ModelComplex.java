package Model;

public class ModelComplex implements NumberInterface {

    Double realPart, imaginaryPart;

    public ModelComplex(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ModelComplex() {
    }

    @Override
    public void setRealPart(Double value) {
        this.realPart = value;
    }

    @Override
    public void setImaginaryPart(Double value) {
        this.imaginaryPart = value;
    }

    @Override
    public Double getRealPart() {
        return realPart;
    }

    @Override
    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "*i";
    }

}
