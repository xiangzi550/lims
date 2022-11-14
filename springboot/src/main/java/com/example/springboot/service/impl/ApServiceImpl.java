package com.example.springboot.service.impl;

import com.example.springboot.entity.Ap;
import com.example.springboot.mapper.ApMapper;
import com.example.springboot.service.IApService;
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
public class ApServiceImpl extends ServiceImpl<ApMapper, Ap> implements IApService {

}
