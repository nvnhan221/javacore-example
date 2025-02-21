package org.example.pattern.abstractfactory.qr;

public class VpbDownloadQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generating VpbDownloadQR: " + data);
    }
}
