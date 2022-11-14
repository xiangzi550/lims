package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.CleanInfo;
import com.example.springboot.mapper.CleanInfoMapper;
import com.example.springboot.service.ICleanInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  消杀服务实现类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Service
public class CleanInfoServiceImpl extends ServiceImpl<CleanInfoMapper, CleanInfo> implements ICleanInfoService {

}
