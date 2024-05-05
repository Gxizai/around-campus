package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XIZAI
 * @since 2021-12-22
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    public Result seckillVoucher(Long voucherId);

    public void createVoucherOrder(VoucherOrder voucherOrder);
}
