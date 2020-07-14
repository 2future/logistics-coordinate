package com.mz.logistics.logisticscoordinate.process;

import com.mz.logistics.logisticscoordinate.domain.GisDomain;

/**
 * @author mz
 * @version V1.0
 * @Title ProcessGis
 * @Package com.mz.logistics.logisticscoordinate.process
 * @Description 经纬度轨迹处理器
 * @date 2020/7/13 2:58 下午
 */
public interface ProcessGis {



    /**
     * 记录当前轨迹 到具体物理单元
     * @param domain
     */
    void recordGis(GisDomain domain);

}