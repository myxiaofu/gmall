package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SkuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-03-06 22:23:35
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

