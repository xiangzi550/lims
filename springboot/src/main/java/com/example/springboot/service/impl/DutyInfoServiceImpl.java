package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.DutyInfo;
import com.example.springboot.mapper.DutyInfoMapper;
import com.example.springboot.service.IDutyInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  值班服务实现类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Service
public class DutyInfoServiceImpl extends ServiceImpl<DutyInfoMapper, DutyInfo> implements IDutyInfoService {

}
