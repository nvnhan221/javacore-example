package org.example.pattern.abstractfactory.qr;

public class VpbVietQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generating VpbVietQr: " + data);
    }
}
