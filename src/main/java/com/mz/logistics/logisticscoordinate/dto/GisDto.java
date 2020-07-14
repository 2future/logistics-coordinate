package com.mz.logistics.logisticscoordinate.dto;

import java.math.BigDecimal;

/**
 * @author mz
 * @version V1.0
 * @Title GisDto
 * @Package com.mz.logistics.logisticscoordinate.dto
 * @Description
 * @date 2020/7/13 3:51 下午
 */
public class GisDto {

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}