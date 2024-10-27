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


import com.dao.CheliangdengjiDao;
import com.entity.CheliangdengjiEntity;
import com.service.CheliangdengjiService;
import com.entity.vo.CheliangdengjiVO;
import com.entity.view.CheliangdengjiView;

@Service("cheliangdengjiService")
public class CheliangdengjiServiceImpl extends ServiceImpl<CheliangdengjiDao, CheliangdengjiEntity> implements CheliangdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangdengjiEntity> page = this.selectPage(
                new Query<CheliangdengjiEntity>(params).getPage(),
                new EntityWrapper<CheliangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangdengjiEntity> wrapper) {
		  Page<CheliangdengjiView> page =new Query<CheliangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangdengjiVO> selectListVO(Wrapper<CheliangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangdengjiVO selectVO(Wrapper<CheliangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangdengjiView> selectListView(Wrapper<CheliangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangdengjiView selectView(Wrapper<CheliangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
