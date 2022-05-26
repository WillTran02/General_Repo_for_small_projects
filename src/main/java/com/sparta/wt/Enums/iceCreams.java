package com.sparta.wt.Enums;

import java.util.Arrays;

public enum iceCreams {
    VANILLA(true),
    CARAMEL(true),
    STRAWBERRY(false),
    CHOCOLATE(false),
    PEANUT_BUTTER(true);

    private boolean withFlake;

    public boolean getWithFlake() {
        return withFlake;
    }

    public void setWithFlake(boolean withFlake) {
        this.withFlake = withFlake;
    }

    iceCreams(boolean withFlake) {
        this.withFlake = withFlake;
    }

    public static void main(String[] args) {
        iceCreams myFavourite = iceCreams.VANILLA;
        iceCreams myLeastFavourite = iceCreams.PEANUT_BUTTER;

        System.out.println("My Ice Cream list: " + Arrays.toString(iceCreams.values()));
        System.out.println("Mint Ice Cream compared to my favourite: " + myFavourite.compareTo(myLeastFavourite));
        System.out.println("My favourite comes with a flake: " + myFavourite.getWithFlake());
        System.out.println("My least favourite comes with a flake: " + myLeastFavourite.getWithFlake());
    }
}
