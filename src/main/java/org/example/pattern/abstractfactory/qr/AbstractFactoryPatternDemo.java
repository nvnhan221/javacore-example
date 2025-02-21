package org.example.pattern.abstractfactory.qr;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // bvb
        QRCodeFactory bvbQRFactory = new VpbQRFactory();
        QRCode vietQR = bvbQRFactory.createVietQR();
        vietQR.generate("11");

//        QRCode downloadQR = bvbQRFactory.createDownloadQR();
//        downloadQR.generate("22");

    }
}
