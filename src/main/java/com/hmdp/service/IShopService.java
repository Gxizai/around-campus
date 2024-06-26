package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XIZAI
 * @since 2021-12-22
 */
public interface IShopService extends IService<Shop> {
    public Result queryById(Long id);

    public Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
