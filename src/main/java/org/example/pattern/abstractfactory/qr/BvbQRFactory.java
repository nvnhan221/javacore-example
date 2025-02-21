package org.example.pattern.abstractfactory.qr;

public class BvbQRFactory implements QRCodeFactory {
    @Override
    public QRCode createVietQR() {
        return new BvbVietQR();
    }

    @Override
    public QRCode createDownloadQR() {
        return new BvbDownloadQR();
    }
}
