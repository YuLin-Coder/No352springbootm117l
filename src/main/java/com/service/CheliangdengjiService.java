package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangdengjiView;


/**
 * 车辆登记
 *
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
public interface CheliangdengjiService extends IService<CheliangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangdengjiVO> selectListVO(Wrapper<CheliangdengjiEntity> wrapper);
   	
   	CheliangdengjiVO selectVO(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
   	
   	List<CheliangdengjiView> selectListView(Wrapper<CheliangdengjiEntity> wrapper);
   	
   	CheliangdengjiView selectView(@Param("ew") Wrapper<CheliangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangdengjiEntity> wrapper);
   	

}

