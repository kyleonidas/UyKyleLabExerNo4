package com.uy.uykylelabexerno4;

public class Android {
    int logo;
    String android, version, level, date, message;

    public Android(int logo, String android, String version, String level, String date, String message) {
        this.logo = logo;
        this.android = android;
        this.version = version;
        this.level = level;
        this.date = date;
        this.message = message;
    }

    public int getLogo(){
        return logo;
    }

    public String getAndroid() { return android; }

    public String getVersion(){
        return version;
    }

    public String getLevel(){ return level; }

    public String getDate(){ return date; }

    public String getMessage(){ return message; }

}

