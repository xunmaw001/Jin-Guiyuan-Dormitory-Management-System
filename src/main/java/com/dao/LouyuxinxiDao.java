package com.dao;

import com.entity.LouyuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LouyuxinxiVO;
import com.entity.view.LouyuxinxiView;


/**
 * 楼宇信息
 * 
 * @author 
 * @email 
 * @date 2023-03-22 18:50:21
 */
public interface LouyuxinxiDao extends BaseMapper<LouyuxinxiEntity> {
	
	List<LouyuxinxiVO> selectListVO(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
	
	LouyuxinxiVO selectVO(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
	
	List<LouyuxinxiView> selectListView(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);

	List<LouyuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
	
	LouyuxinxiView selectView(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
	

}
