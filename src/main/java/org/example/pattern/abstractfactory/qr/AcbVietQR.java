package org.example.pattern.abstractfactory.qr;

public class AcbVietQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generating AcbVietQR: " + data);
    }
}
