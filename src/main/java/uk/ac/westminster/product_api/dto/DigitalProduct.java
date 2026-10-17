package uk.ac.westminster.product_api.dto;


public class DigitalProduct {

    private String downloadUrl;
    private Double fileSizeMB;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(Double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

}
