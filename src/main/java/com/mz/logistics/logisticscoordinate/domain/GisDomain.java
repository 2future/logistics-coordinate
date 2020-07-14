package com.mz.logistics.logisticscoordinate.domain;

import org.springframework.util.Assert;

import java.math.BigDecimal;

/**
 * @author mz
 * @version V1.0
 * @Title GisDomain
 * @Package com.mz.logistics.logisticscoordinate.domain
 * @Description
 * @date 2020/7/13 3:00 下午
 */
public class GisDomain {

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    public GisDomain(BigDecimal longitude, BigDecimal latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * 获取  两个坐标 经纬度差的比例值
     *
     * @param domain
     * @return
     */
    public BigDecimal getProportion(GisDomain domain) {
        Assert.notNull(longitude, "longitude can not be null");
        Assert.notNull(latitude, "latitude can not be null");
        BigDecimal latitude = domain.getLatitude();
        BigDecimal longitude = domain.getLongitude();
        BigDecimal latitudeSubtract = latitude.subtract(this.latitude);
        BigDecimal longitudeSubtract = longitude.subtract(this.longitude);
        return latitudeSubtract.divide(longitudeSubtract);
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "GisDomain{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}