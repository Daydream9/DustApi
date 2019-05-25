package com.usut.dustapi.model.dust_material;

public class FineDust {

    private Weather weather;
    private Common common;
    private Result result;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FineDust{" +
                "weather=" + weather +
                ", common=" + common +
                ", result=" + result +
                '}';
    }
}