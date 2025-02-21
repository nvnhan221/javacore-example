package org.example.pattern.abstractfactory.qr;

public class AcbDownloadQR implements QRCode {
    @Override
    public void generate(String data) {
        System.out.println("Generaing AcbDownloadQR: " + data);
    }
}
