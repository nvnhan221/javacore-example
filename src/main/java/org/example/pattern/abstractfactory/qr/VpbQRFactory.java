package org.example.pattern.abstractfactory.qr;

public class VpbQRFactory implements QRCodeFactory {
    @Override
    public QRCode createVietQR() {
        return new VpbVietQR();
    }

    @Override
    public QRCode createDownloadQR() {
        return new VpbDownloadQR();
    }
}
