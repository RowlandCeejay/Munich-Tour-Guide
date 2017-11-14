package com.example.android.munich_tour_guide;

public class City {

    private String iDefaultName;

    private String iDefaultAddress;

    private int iDefaultImage = NO_IMAGE_PROVIDED;

    private String iDefaultInfo;

    private String iDefaultLocation;

    private static final int NO_IMAGE_PROVIDED = -1;

    public City(String defaultName, String defaultAddress, int imageResourceId,
                String info, String location) {
        iDefaultName = defaultName;
        iDefaultAddress = defaultAddress;
        iDefaultImage = imageResourceId;
        iDefaultInfo = info;
        iDefaultLocation = location;
    }

    public City(String name, String address, String info, int imageResourceId,
                String location) {
        iDefaultName = name;
        iDefaultAddress = address;
        iDefaultImage = imageResourceId;
        iDefaultInfo = info;
        iDefaultInfo = location;
    }

    public String getDefaultName() {

        return iDefaultName;
    }

    public String getDefaultAddress() {

        return iDefaultAddress;
    }

    public String getDefaultInfo() {
        return iDefaultInfo;
    }

    public String getDefaultLocation() {
        return iDefaultLocation;
    }

    public int getDefaultImage() {

        return iDefaultImage;
    }

    public boolean hasImage() {
        return iDefaultImage != NO_IMAGE_PROVIDED;
    }

}
