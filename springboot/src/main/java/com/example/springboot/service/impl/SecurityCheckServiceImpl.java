package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.SecurityCheck;
import com.example.springboot.mapper.SecurityCheckMapper;
import com.example.springboot.service.ISecurityCheckService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  安全检查服务实现类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Service
public class SecurityCheckServiceImpl extends ServiceImpl<SecurityCheckMapper, SecurityCheck> implements ISecurityCheckService {

}
