package org.example.pattern.abstractfactory.qr;

public class BvbVietQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generating BvbVietQr: " + data);
    }
}
