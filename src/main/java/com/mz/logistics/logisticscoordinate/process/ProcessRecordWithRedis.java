package com.mz.logistics.logisticscoordinate.process;

import com.mz.logistics.logisticscoordinate.domain.GisDomain;
import com.mz.logistics.logisticscoordinate.dto.GisDto;
import org.springframework.data.redis.core.RedisTemplate;

import java.math.BigDecimal;

/**
 * @author mz
 * @version V1.0
 * @Title ProcessRecordWithRedis
 * @Package com.mz.logistics.logisticscoordinate.process
 * @Description 使用redis作为状态存储单元
 * @date 2020/7/13 3:27 下午
 */
public class ProcessRecordWithRedis implements ProcessGis {

    private RedisTemplate redisTemplate;

    /**
     * 经纬度 互相差的记录条件比值
     */
    private BigDecimal ratio;

    /**
     * 操作记录方法
     *
     * @param domain
     */
    @Override
    public void recordGis(GisDomain domain) {
        if (isNeedRecord(domain)) {
            //todo  do record

        }
    }

    /**
     * 判断 是否需要记录
     *
     * @param domain
     * @return
     */
    private boolean isNeedRecord(GisDomain domain) {
        BigDecimal proportion = domain.getProportion(findPrevious());
        return proportion.abs().compareTo(ratio) >= 0;
    }

    /**
     * 获取上一个gis记录
     *
     * @return
     */
    private GisDomain findPrevious() {
        GisDto gisDto = (GisDto) redisTemplate.opsForValue().get("");
        return new GisDomain(gisDto.getLongitude(), gisDto.getLatitude());
    }
}