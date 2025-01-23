package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SushegenghuanDao;
import com.entity.SushegenghuanEntity;
import com.service.SushegenghuanService;
import com.entity.vo.SushegenghuanVO;
import com.entity.view.SushegenghuanView;

@Service("sushegenghuanService")
public class SushegenghuanServiceImpl extends ServiceImpl<SushegenghuanDao, SushegenghuanEntity> implements SushegenghuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushegenghuanEntity> page = this.selectPage(
                new Query<SushegenghuanEntity>(params).getPage(),
                new EntityWrapper<SushegenghuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushegenghuanEntity> wrapper) {
		  Page<SushegenghuanView> page =new Query<SushegenghuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushegenghuanVO> selectListVO(Wrapper<SushegenghuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushegenghuanVO selectVO(Wrapper<SushegenghuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushegenghuanView> selectListView(Wrapper<SushegenghuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushegenghuanView selectView(Wrapper<SushegenghuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
