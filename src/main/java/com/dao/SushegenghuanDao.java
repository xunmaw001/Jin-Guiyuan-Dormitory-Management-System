package com.dao;

import com.entity.SushegenghuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushegenghuanVO;
import com.entity.view.SushegenghuanView;


/**
 * 宿舍更换
 * 
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public interface SushegenghuanDao extends BaseMapper<SushegenghuanEntity> {
	
	List<SushegenghuanVO> selectListVO(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
	
	SushegenghuanVO selectVO(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
	
	List<SushegenghuanView> selectListView(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);

	List<SushegenghuanView> selectListView(Pagination page,@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
	
	SushegenghuanView selectView(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
	

}
