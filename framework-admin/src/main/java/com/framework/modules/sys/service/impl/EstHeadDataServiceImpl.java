package com.framework.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.framework.common.utils.PageUtils;
import com.framework.common.utils.Query;

import com.framework.modules.sys.dao.EstHeadDataDao;
import com.framework.modules.sys.entity.EstHeadDataEntity;
import com.framework.modules.sys.service.EstHeadDataService;


@Service("estHeadDataService")
public class EstHeadDataServiceImpl extends ServiceImpl<EstHeadDataDao, EstHeadDataEntity> implements EstHeadDataService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<EstHeadDataEntity> page = this.selectPage(
                new Query<EstHeadDataEntity>(params).getPage(),
                new EntityWrapper<EstHeadDataEntity>()
        );

        return new PageUtils(page);
    }

}
