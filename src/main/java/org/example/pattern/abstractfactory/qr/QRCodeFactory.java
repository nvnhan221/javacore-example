package org.example.pattern.abstractfactory.qr;

public interface QRCodeFactory {
    QRCode createVietQR();
    QRCode createDownloadQR();
}
