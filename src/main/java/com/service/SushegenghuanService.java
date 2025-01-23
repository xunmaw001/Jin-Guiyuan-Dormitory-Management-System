package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushegenghuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushegenghuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushegenghuanView;


/**
 * 宿舍更换
 *
 * @author 
 * @email 
 * @date 2023-03-22 18:50:22
 */
public interface SushegenghuanService extends IService<SushegenghuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushegenghuanVO> selectListVO(Wrapper<SushegenghuanEntity> wrapper);
   	
   	SushegenghuanVO selectVO(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
   	
   	List<SushegenghuanView> selectListView(Wrapper<SushegenghuanEntity> wrapper);
   	
   	SushegenghuanView selectView(@Param("ew") Wrapper<SushegenghuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushegenghuanEntity> wrapper);
   	

}

