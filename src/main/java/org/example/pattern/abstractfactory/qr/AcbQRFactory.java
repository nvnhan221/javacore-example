package org.example.pattern.abstractfactory.qr;

public class AcbQRFactory implements QRCodeFactory {
    @Override
    public QRCode createVietQR() {
        return new AcbDownloadQR();
    }

    @Override
    public QRCode createDownloadQR() {
        return new AcbDownloadQR();
    }
}
