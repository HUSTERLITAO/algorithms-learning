package DesignPattern.Proxy;

public class RealImage implements Image{
    public String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.printf("loading" + fileName);
    }

    @Override
    public void display() {
        System.out.printf("display" + fileName);
    }
}
