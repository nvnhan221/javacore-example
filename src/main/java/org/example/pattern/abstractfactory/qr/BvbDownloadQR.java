package org.example.pattern.abstractfactory.qr;

public class BvbDownloadQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generaing BvbDownloadQr: " + data);
    }
}
