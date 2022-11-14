package com.example.springboot.service.impl;

import com.example.springboot.entity.Buyer;
import com.example.springboot.mapper.BuyerMapper;
import com.example.springboot.service.IBuyerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-11-14
 */
@Service
public class BuyerServiceImpl extends ServiceImpl<BuyerMapper, Buyer> implements IBuyerService {

}
