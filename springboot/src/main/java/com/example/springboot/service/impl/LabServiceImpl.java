package com.example.springboot.service.impl;

import com.example.springboot.entity.CleanInfo;
import com.example.springboot.entity.Lab;
import com.example.springboot.mapper.CleanInfoMapper;
import com.example.springboot.mapper.LabMapper;
import com.example.springboot.service.ICleanInfoService;
import com.example.springboot.service.ILabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-11-13
 */
@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements ILabService {

}
