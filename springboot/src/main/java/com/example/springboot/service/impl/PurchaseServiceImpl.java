package com.example.springboot.service.impl;

import com.example.springboot.entity.Purchase;
import com.example.springboot.mapper.PurchaseMapper;
import com.example.springboot.service.IPurchaseService;
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
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements IPurchaseService {

}
