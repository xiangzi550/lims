package com.example.springboot.service.impl;

import com.example.springboot.entity.Ws;
import com.example.springboot.mapper.WsMapper;
import com.example.springboot.service.IWsService;
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
public class WsServiceImpl extends ServiceImpl<WsMapper, Ws> implements IWsService {

}
