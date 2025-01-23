package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LouyuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LouyuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LouyuxinxiView;


/**
 * 楼宇信息
 *
 * @author 
 * @email 
 * @date 2023-03-22 18:50:21
 */
public interface LouyuxinxiService extends IService<LouyuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LouyuxinxiVO> selectListVO(Wrapper<LouyuxinxiEntity> wrapper);
   	
   	LouyuxinxiVO selectVO(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
   	
   	List<LouyuxinxiView> selectListView(Wrapper<LouyuxinxiEntity> wrapper);
   	
   	LouyuxinxiView selectView(@Param("ew") Wrapper<LouyuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LouyuxinxiEntity> wrapper);
   	

}

