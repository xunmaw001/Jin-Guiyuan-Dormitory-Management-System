package com.dao;

import com.entity.ZhusuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhusuxinxiVO;
import com.entity.view.ZhusuxinxiView;


/**
 * 住宿信息
 * 
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public interface ZhusuxinxiDao extends BaseMapper<ZhusuxinxiEntity> {
	
	List<ZhusuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
	
	ZhusuxinxiVO selectVO(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
	
	List<ZhusuxinxiView> selectListView(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);

	List<ZhusuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
	
	ZhusuxinxiView selectView(@Param("ew") Wrapper<ZhusuxinxiEntity> wrapper);
	

}
