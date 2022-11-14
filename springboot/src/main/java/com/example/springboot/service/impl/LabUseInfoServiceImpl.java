package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.LabUseinfo;
import com.example.springboot.mapper.LabUseInfoMapper;
import com.example.springboot.service.ILabUseInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  实验室服务实现类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Service
public class LabUseInfoServiceImpl extends ServiceImpl<LabUseInfoMapper, LabUseinfo> implements ILabUseInfoService {

}
